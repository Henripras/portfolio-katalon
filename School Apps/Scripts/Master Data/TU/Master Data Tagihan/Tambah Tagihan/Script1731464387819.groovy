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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://school-payment.digiform.co.id/login')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'tu@gmail.com')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.click(findTestObject('Master Data/TU/HomePageMenu/Sidebar Menu'))

WebUI.click(findTestObject('Master Data/TU/HomePageMenu/Sub Menu Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Klik Tambah Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Field Input Tagihan/Klik Field Input Tagihan'))

WebUI.setText(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Field Input Tagihan/Klik Field Input Tagihan'), 
    'Windows Activation')

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Tahun Ajaran/Klik Dropdown Tahun Ajaran'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Tahun Ajaran/Klik Cari Tahun Ajaran'))

WebUI.setText(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Tahun Ajaran/Klik Cari Tahun Ajaran'), 
    '2023')

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Tahun Ajaran/Klik Hasil Pencarian Tahun Ajaran'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Unit/Klik Dropdown Unit'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Unit/Klik Isi Dropdown Unit'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Tipe Tagihan/Klik Dropdown Tipe Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Tipe Tagihan/Klik Value Dropdown Tipe Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Kelas/Klik Dropdown Kelas'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Kelas/Pilih Value Kelas'))

int minDigits = 2

int maxDigits = 5

int randomLength = ((Math.random() * ((maxDigits - minDigits) + 1)) as int) + minDigits

String randomNumber = String.format(('%0' + randomLength) + 'd', ((Math.random() * Math.pow(10, randomLength)) as int))

// Klik pada field Kode Tagihan
WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Field Kode Tagihan/Input Kode Tagihan'))

WebUI.setText(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Field Kode Tagihan/Input Kode Tagihan'), randomNumber)

int min = 1000000 // Batas minimum
int max = 15000000 // Batas maksimum

// Generate angka random antara min dan max
int randomNumber1 = ((Math.random() * (max - min)) + min) as int

// Klik pada field input
WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Field Tagihan Perbulan/Input Field Tagihan Perbulan'))

// Masukkan angka random ke field input
WebUI.setText(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Field Tagihan Perbulan/Input Field Tagihan Perbulan'),
	randomNumber1.toString()) // Konversi angka menjadi string


WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Rekening Bank/Klik Dropdown Rekening Bank'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Rekening Bank/Klik Cari Rekening Bank'))

WebUI.setText(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Rekening Bank/Klik Cari Rekening Bank'), 
    '1223123123')

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Dropdown Rekening Bank/Pilih Value Rekening Bank'))


// Array untuk menyimpan opsi
String[] options = ['Pembayaran Windows 10', 'Pembayaran Windows 11', 'Pembayaran Microsoft Office', 'Pembayaran Office 365']

// Pilih salah satu opsi secara random
String randomOption = options[new Random().nextInt(options.length)]

// Klik pada field input
WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Field Keterangan/Input Field Keterangan'))

// Masukkan opsi yang terpilih ke field input
WebUI.setText(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Field Keterangan/Input Field Keterangan'), randomOption)


WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Button Generate Tagihan/Klik Generate Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Button Tambahkan/Tambahkan Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Tambah Tagihan/Page Tagihan/Klik Button Konfirmasi/Klik Button Ya'))

int generateRandomNumber(int min, int max) {
    return ((Math.random() * ((max - min) + 1)) as int) + min
}

