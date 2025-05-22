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

WebUI.click(findTestObject('Informasi/Tambah Pengumuman/Menu Informasi'))

WebUI.click(findTestObject('Informasi/Tambah Pengumuman/Submenu Event'))

WebUI.click(findTestObject('Informasi/Hapus Pengumuman/Tridots'))

WebUI.click(findTestObject('Informasi/Edit Pengumuman/Edit'))

WebUI.click(findTestObject('Informasi/Tambah Pengumuman/Input Judul'))

WebUI.delay(3)

// Inisialisasi variabel untuk pengecekan apakah teks sudah clear
boolean isTextCleared = false
int maxRetries = 5 // Batas maksimal percobaan
int retryCount = 0 // Counter untuk percobaan

// Loop untuk memastikan teks terhapus
while (!isTextCleared && retryCount < maxRetries) {
    try {
        // Pastikan elemen tersedia sebelum melakukan tindakan
        if (WebUI.verifyElementPresent(findTestObject('Informasi/Tambah Pengumuman/Input Judul'), 5)) {
            // Fokus ke elemen input
            WebUI.click(findTestObject('Informasi/Tambah Pengumuman/Input Judul'))
            
            // Tekan CTRL + A untuk memilih semua teks
            WebUI.sendKeys(findTestObject('Informasi/Tambah Pengumuman/Input Judul'), Keys.chord(Keys.CONTROL, 'a'))
            
            // Tekan tombol Delete untuk menghapus teks
            WebUI.sendKeys(findTestObject('Informasi/Tambah Pengumuman/Input Judul'), Keys.chord(Keys.DELETE))
            
            WebUI.delay(1)

            // Dapatkan teks terkini dari elemen
            String currentText = WebUI.getAttribute(findTestObject('Informasi/Tambah Pengumuman/Input Judul'), 'value')
            isTextCleared = currentText.isEmpty()

            if (!isTextCleared) {
                WebUI.comment('Teks belum clear, mencoba ulang...')
            }
        } else {
            WebUI.comment('Elemen tidak ditemukan atau tidak dapat diakses.')
            break
        }
    } catch (Exception e) {
        WebUI.comment("Terjadi error: " + e.message)
        break
    }
    retryCount++
}

if (!isTextCleared) {
    WebUI.comment('Gagal menghapus teks setelah ' + maxRetries + ' percobaan.')
} else {
    WebUI.comment('Teks berhasil dihapus.')
}

import java.util.UUID

// Fungsi untuk menghasilkan string random
String generateRandomText(String prefix, int length) {
    return prefix + "_" + UUID.randomUUID().toString().replace("-", "").substring(0, length)
}

// Contoh penggunaan generate random username
String randomUsername = generateRandomText("user", 8)
WebUI.setText(findTestObject('Informasi/Tambah Pengumuman/Input Judul'), randomUsername)

WebUI.comment("Teks berhasil di-clear dan teks baru '$randomUsername' telah di-set.")

// Contoh generate informasi lainnya
String randomTitle = generateRandomText("title", 10)
WebUI.comment("Judul acak: $randomTitle")

String randomCode = generateRandomText("code", 5)
WebUI.comment("Kode acak: $randomCode")

WebUI.delay(1)

WebUI.click(findTestObject('Informasi/Edit Pengumuman/Button Simpan'))

WebUI.click(findTestObject('Informasi/Edit Pengumuman/Button YA'))

