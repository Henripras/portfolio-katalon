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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://pre.auto2000.co.id/mobil-baru-toyota/p/agya/spesifikasi')

WebUI.waitForPageLoad(2)

WebUI.scrollToPosition(0, 1375)

WebUI.click(findTestObject('NCP/PDP NCP/SPESIFIKASI/Promo/Lihat Semua Promo'))

WebUI.waitForPageLoad(2)

WebUI.doubleClick(findTestObject('NCP/PDP NCP/SPESIFIKASI/Promo/Listing Promo/Scroll Ke Bawah'))

// Jumlah total kartu di halaman
int totalCards = 12 // Ganti dengan jumlah total kartu yang Anda miliki di halaman

for (int i = 1; i <= totalCards; i++) {
    // Buat TestObject dinamis untuk kartu
    TestObject cardToSelect = new TestObject()

    cardToSelect.addProperty('xpath', ConditionType.EQUALS, ('(//div[contains(@class, "pt-1 px-1.5 pb-6 lg:pt-2 lg:px-3 lg:pb-5 flex flex-col h-full")])[' + 
        i) + ']')

    // Klik pada kartu
    WebUI.click(cardToSelect)

    // Tunggu beberapa detik agar halaman dimuat
    WebUI.delay(1)

    // Verifikasi apakah form inquiry ada
    TestObject inquiryForm = new TestObject()

    inquiryForm.addProperty('xpath', ConditionType.EQUALS, '//section[contains(@class, "bg-reliableBlack5")]' // Ganti XPath dengan XPath form inquiry Anda
        )

    boolean formExists = WebUI.waitForElementPresent(inquiryForm, 2, FailureHandling.OPTIONAL)

    if (formExists) {
        // Lanjutkan ke langkah selanjutnya jika form ada
        WebUI.comment('Form inquiry ditemukan, melanjutkan ke langkah selanjutnya...')

        // Contoh langkah selanjutnya
        WebUI.setText(findTestObject('Promosi Nasional/Promo Semua/Minta Penawaran Semua/Field Nama Lengkap'), 'Budi Hartono')

        WebUI.setText(findTestObject('Promosi Nasional/Promo Semua/Minta Penawaran Semua/Field No Hp'), '81263459777')

        WebUI.scrollToPosition(0, 500)

        WebUI.click(findTestObject('Promosi Nasional/Promo Semua/Minta Penawaran Semua/Field Model Mobil'))

        if (WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Isi Model Mobil'), 
            30, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Isi Model Mobil'))
        } else {
            WebUI.click(findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Field Model Mobil'))

            println('Element not found.')
        }
        
        WebUI.click(findTestObject('Promosi Nasional/Promo Semua/Minta Penawaran Semua/Checkbox'), FailureHandling.OPTIONAL)

        WebUI.scrollToElement(findTestObject('Promosi Nasional/Promo Semua/Scroll Share'), 0)

        WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share Facebook'), 10)

        WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share Whatsapp'), 10)

        WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share X'), 10)

        //WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share Tiktok'), 10)
        WebUI.verifyElementPresent(findTestObject('Promosi Nasional/Promo Semua/Share Link'), 10)

        break
    } else {
        WebUI.back()

        WebUI.delay(1)
    }
}

