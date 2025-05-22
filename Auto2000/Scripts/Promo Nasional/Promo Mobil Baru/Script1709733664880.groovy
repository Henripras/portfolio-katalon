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

//open browser
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://pre.auto2000.co.id/promosi')

// Tunggu hingga halaman selesai dimuat
WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Promosi Nasional/Promo Mobil Baru/Kategori Mobil'))

////Klik Kategori Mobil Baru
//WebUI.click(findTestObject('Object Repository/Promosi Nasional/Promo Mobil Baru/Kategori Mobil Baru'))
//Klik Detail Promo
// Jumlah total kartu di halaman
int totalCards = 12 // Ganti dengan jumlah total kartu yang Anda miliki di halaman

for (int i = 1; i <= totalCards; i++) {
    // Buat TestObject dinamis untuk kartu
    TestObject cardToSelect = new TestObject()

    cardToSelect.addProperty('xpath', ConditionType.EQUALS, ('//a[starts-with(@id, "card-promo-")][' + 
        i) + ']')

    // Klik pada kartu
    WebUI.click(cardToSelect)

    // Tunggu beberapa detik agar halaman dimuat
    WebUI.delay(0)

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

        // Coba klik elemen pertama jika ada, jika tidak klik elemen kedua dan tampilkan pesan
        TestObject firstElement = findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Isi Model Mobil')

        TestObject fallbackElement = findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Field Model Mobil')

        //Isi Model Mobil
        if (WebUI.verifyElementPresent(findTestObject('Object Repository/Events/Minta Penawaran/Model Mobil'), 30, FailureHandling.OPTIONAL)) {
            // Step 2: If the element exists, click on it
            WebUI.click(findTestObject('Object Repository/Events/Minta Penawaran/Model Mobil' // Add any additional steps you want to perform after clicking the element
                    // Add a failure message or alternative steps if the element does not exist
                    ))
        } else {
            WebUI.click(findTestObject('Object Repository/Events/Minta Penawaran/input_Model Mobil_dd-model-mobil'))

            println('Element not found.')
        }
        
        WebUI.click(findTestObject('Object Repository/Section inquiry city/Checkbox terms Condition'), FailureHandling.OPTIONAL)

        WebUI.scrollToElement(findTestObject('Promosi Nasional/Promo Semua/Scroll Share'), 0)

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

