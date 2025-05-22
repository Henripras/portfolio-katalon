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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.CONTINUE_ON_FAILURE)

// Login
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pengaturan Sistem/Edit Invoice/Menu Pengaturan'))

WebUI.click(findTestObject('Pengaturan Sistem/Edit Invoice/Menu Invoice'))

WebUI.click(findTestObject('Pengaturan Sistem/Edit Invoice/Prefix'))

WebUI.delay(3)

// Fungsi untuk clear text menggunakan CTRL + A dan Delete
void clearFieldWithCtrlAAndDelete(TestObject testObject) {
    boolean isTextCleared = false // Inisialisasi variabel pengecekan

    // Loop hingga teks benar-benar terhapus
    while (!isTextCleared) {
        WebUI.click(testObject) // Fokus pada field
        WebUI.sendKeys(testObject, Keys.chord(Keys.CONTROL, 'a')) // Pilih semua teks
        WebUI.sendKeys(testObject, Keys.chord(Keys.DELETE)) // Hapus teks yang dipilih
        
        WebUI.delay(1) // Tunggu sebentar untuk memastikan perubahan terjadi

        // Ambil nilai teks saat ini
        String currentText = WebUI.getAttribute(testObject, 'value')

        // Cek apakah teks sudah kosong
        isTextCleared = currentText.isEmpty()

        if (!isTextCleared) {
            WebUI.comment('Teks belum clear, mencoba ulang...')
        }
    }

    WebUI.comment('Teks berhasil di-clear.')
}

// Generate username random
String randomUsername = 'kln' + UUID.randomUUID().toString().substring(0, 8)

WebUI.setText(findTestObject('Pengaturan Sistem/Edit Invoice/Prefix'), randomUsername)

WebUI.comment("Teks berhasil di-clear dan teks baru '$randomUsername' telah di-set.")

WebUI.delay(1)

WebUI.click(findTestObject('Pengaturan Sistem/Edit Invoice/Button Lanjutkan'))

