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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://school-payment.digiform.co.id/login')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'tu@gmail.com')

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.click(findTestObject('Master Data/TU/Tambah Kelas/Menu Master Data'))

WebUI.click(findTestObject('Master Data/TU/Tambah Kelas/Menu Kelas'))

WebUI.delay(1)

// Akses elemen "Edit Suffix Kelas"
TestObject suffixKelasField = findTestObject('Master Data/TU/Edit Kelas/Edit Suffix Kelas')

// Klik tombol "Edit"
WebUI.click(findTestObject('Master Data/TU/Edit Kelas/Button Edit'))

// Klik pada field "Edit Suffix Kelas" untuk fokus
WebUI.click(suffixKelasField)

WebUI.delay(3)

// Inisialisasi variabel untuk pengecekan apakah teks sudah clear
boolean isTextCleared = false

// Loop untuk memastikan teks terhapus
while (!(isTextCleared)) {
    WebUI.clearText(suffixKelasField)

    WebUI.delay(1 // Tambahkan delay agar ada waktu untuk proses clearText
        )

    // Cek apakah teks sudah clear
    String currentText = WebUI.getAttribute(suffixKelasField, 'value')

    isTextCleared = currentText.isEmpty()

    if (!(isTextCleared)) {
        WebUI.comment('Teks belum clear, mencoba ulang...')
    }
}

// Setelah teks clear, set teks baru
WebUI.setText(suffixKelasField, 'yahsik')

WebUI.comment('Teks berhasil di-clear dan teks baru telah di-set.')

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/TU/Edit Kelas/Button Simpan'))

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Edit User Management/Button YA popup'))

