import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// Buka browser dan navigasi ke URL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat/auto2000cempakaputih')

WebUI.maximizeWindow()

// Tunggu hingga halaman selesai dimuat
WebUI.waitForPageLoad(5)

// Scroll ke posisi yang ditentukan
WebUI.scrollToElement(findTestObject('Branch Landing Page/Promo Branch/Scroll To Position'), 0, FailureHandling.OPTIONAL)

// Verifikasi teks pada elemen "Promo Auto2000 Cempaka Putih"
WebUI.verifyTextPresent('PROMO AUTO2000 CEMPAKA PUTIH', false)

// Verifikasi teks pada tombol "Lihat Semua Promo"
WebUI.verifyTextPresent('LIHAT SEMUA', false)

WebUI.delay(2)

// Klik tombol "Lihat Semua Promo"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Promo Branch/Lihat Semua Promo Branch'))

WebUI.delay(2)

// Scroll ke posisi yang ditentukan
WebUI.scrollToPosition(0, 50)

// Verifikasi dan klik detail promo branch
WebUI.verifyElementPresent(findTestObject('Object Repository/Branch Landing Page/Promo Branch/Detail Promo Branch'), 5)

WebUI.click(findTestObject('Object Repository/Branch Landing Page/Promo Branch/Detail Promo Branch'))

WebUI.waitForPageLoad(5)

// Jumlah total kartu di halaman
int totalCards = 8 // Ganti dengan jumlah total kartu yang Anda miliki di halaman

for (int i = 1; i <= totalCards; i++) {
    // Buat TestObject dinamis untuk kartu
    TestObject cardToSelect = new TestObject()

    cardToSelect.addProperty('xpath', ConditionType.EQUALS, ('(//div[contains(@class, "pt-1 px-1.5 pb-6 lg:pt-2 lg:px-3 lg:pb-5 flex flex-col h-full")])[' + 
        i) + ']')

    // Klik pada kartu
    WebUI.click(cardToSelect)

    // Tunggu beberapa detik agar halaman dimuat
    WebUI.delay(2)

    // Verifikasi apakah form inquiry ada
    TestObject inquiryForm = new TestObject()

    inquiryForm.addProperty('xpath', ConditionType.EQUALS, '//section[contains(@class, "bg-reliableBlack5")]')

    boolean formExists = WebUI.waitForElementPresent(inquiryForm, 2, FailureHandling.OPTIONAL)

    if (formExists) {
        // Lanjutkan ke langkah selanjutnya jika form ada
        WebUI.comment('Form inquiry ditemukan, melanjutkan ke langkah selanjutnya...')

        // Isi nama pada form
        WebUI.setText(findTestObject('Promosi Nasional/Promo Semua/Minta Penawaran Semua/Field Nama Lengkap'), 'Budi Hartono')

        // Isi nomor handphone pada form
        WebUI.setText(findTestObject('Promosi Nasional/Promo Semua/Minta Penawaran Semua/Field No Hp'), '81263459777')

        // Scroll ke posisi yang ditentukan
        WebUI.scrollToPosition(0, 500)

        // Buka dan isi model mobil
        WebUI.click(findTestObject('Promosi Nasional/Promo Semua/Minta Penawaran Semua/Field Model Mobil'))

        TestObject firstElement = findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Isi Model Mobil')

        TestObject fallbackElement = findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Field Model Mobil')

        if (WebUI.verifyElementPresent(firstElement, 30, FailureHandling.OPTIONAL)) {
            WebUI.click(firstElement)
        } else {
            WebUI.click(fallbackElement)

            println('Element not found.')
        }
        
        // Ceklis checkbox terms and conditions
        WebUI.click(findTestObject('Object Repository/Section inquiry city/Checkbox terms Condition'), FailureHandling.OPTIONAL)

        // Scroll ke posisi yang ditentukan
        WebUI.scrollToElement(findTestObject('Promosi Nasional/Promo Semua/Scroll Share'), 0)

        // Verifikasi elemen sharing
        WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share Facebook'), 10)

        WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share Whatsapp'), 10)

        WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share X'), 10)

        WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share Link'), 10)

        break
    } else {
        WebUI.back()

        WebUI.delay(1)
    }
}

