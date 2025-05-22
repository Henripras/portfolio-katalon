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

// Fungsi untuk menghasilkan angka acak
// Variabel angka acak untuk total tagihan
int min = 1000000

int max = 15000000

int randomNumber = generateRandomNumber(min, max)

// Script utama
WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

// Login
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.sekolah@gmail.com')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.delay(1)

// Navigasi ke Sub Menu
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Menu Tagihan'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub-Menu Tagihan Persiswa'))

// Filter berdasarkan Unit dan Kelas
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Unit/Klik Dropdown'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Unit/Pilih Value Unit'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Kelas/Klik Dropdown Kelas'))

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Kelas/Klik Field Cari Kelas'), 
    'XI IPA')

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Dropdown Kelas/Pilih Kelas'))

// Filter berdasarkan NIS
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Filter/Filter By NIS/Klik Dropdown Nama'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Filter/Filter By NIS/Klik NIS'))

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Field Nama/Klik Field Nama'), 
    '2024')

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Field Nama/Edit Tagihannya'))

// Terapkan filter
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tombol Terapkan/Klik Tombol Terapkan'))

WebUI.delay(2)

// Edit Tagihan
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Klik Tri Dots Icon'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Klik Edit'))

// Ubah Nama Tagihan
WebUI.sendKeys(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Edit Nama Tagihan'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Edit Nama Tagihan'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Edit Nama Tagihan'), 
    'tagihan pempek goreng')

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Edit Total Tagihan'))

WebUI.sendKeys(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Edit Total Tagihan'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Edit Total Tagihan'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Edit Total Tagihan'), 
    randomNumber.toString())

// Simpan perubahan
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Tagihan Persiswa/Tri Dots Icon/Edit Tagihan Persiswa/Tombol Simpan Tagihan/Tombol Simpan'))

WebUI.closeBrowser()

int generateRandomNumber(int min, int max) {
    return ((Math.random() * ((max - min) + 1)) as int) + min
}

