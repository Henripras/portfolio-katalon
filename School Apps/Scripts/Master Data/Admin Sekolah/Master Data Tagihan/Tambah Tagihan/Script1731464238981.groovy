import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// Buka browser dan navigasi ke URL
WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.CONTINUE_ON_FAILURE)

// Login
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.CONTINUE_ON_FAILURE)

// Navigate to "Tambah Tagihan"
WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Menu Master Data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Menu Tagihan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button Tambah'), FailureHandling.CONTINUE_ON_FAILURE)

// Isi Form Tagihan
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Nama Tagihan'), 'KATALONZ', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Select Tipe Tagihan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Tagihan Regular'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Klik Tahun Ajaran'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/2023-2024'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Select Kelas'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Semua Kelas'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Tutup Kelas'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Kode Tagihan'), 'HKU', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Jumlah Tagihan'), '750000', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Select Rekening Bank'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/CIMB'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Keterangan'), 'Ini keterangan katalon', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button Generate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button Tambahkan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button YA'), FailureHandling.CONTINUE_ON_FAILURE)

// Delay untuk memastikan halaman selesai memuat pesan
WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

// Verifikasi pesan error untuk kode tagihan duplikat
WebUI.verifyTextPresent('Billing code sudah di gunakan', false, FailureHandling.CONTINUE_ON_FAILURE)

// Delay sebelum mulai proses penghapusan
WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

int minDigits = 2

int maxDigits = 5

int randomLength = ((Math.random() * ((maxDigits - minDigits) + 1)) as int) + minDigits

String randomNumber = String.format(('%0' + randomLength) + 'd', ((Math.random() * Math.pow(10, randomLength)) as int))

// Klik dan hapus kode tagihan menggunakan kombinasi `CONTROL + A`, `BACK_SPACE`, dan `clearText`
WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Kode Tagihan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Kode Tagihan'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.BACK_SPACE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Kode Tagihan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Kode Tagihan'), randomNumber, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1 // Beri waktu untuk memastikan penghapusan
    , FailureHandling.CONTINUE_ON_FAILURE)

// Verifikasi bahwa field kosong, lalu masukkan nilai baru jika kosong
if (WebUI.getAttribute(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Kode Tagihan'), 'value') == '') {
    WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Input Kode Tagihan'), 'teer')
} else {
    println('Field tidak kosong setelah clearText dan JavaScript. Cek ulang penghapusan.')
}

// Klik tombol Tambahkan dan konfirmasi
WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button Tambahkan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Tagihan/Button YA'), FailureHandling.CONTINUE_ON_FAILURE)

