import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// Membuka browser
WebUI.openBrowser('', FailureHandling.OPTIONAL)

// Navigasi ke URL Login
WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.OPTIONAL)

// Mengisi email
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.OPTIONAL)

// Mengisi password
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.OPTIONAL)

// Klik tombol Submit untuk login
WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.OPTIONAL)

// Navigasi ke menu Master Data
WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Data Menu'), FailureHandling.OPTIONAL)

// Pilih menu Tahun Ajaran
WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Menu Tahun Ajaran'), FailureHandling.OPTIONAL)

// Klik tombol Tambah untuk menambahkan Tahun Ajaran baru
WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Button Tambah'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Tahun Mulai/Dropdown Tahun Mulai'), FailureHandling.OPTIONAL)

// Fungsi untuk membuat XPath dinamis berdasarkan tanggal
// Buat XPath dinamis untuk tanggal tertentu
String dynamicXPath = createDynamicXPath('10' // Ganti "10" dengan tanggal yang diinginkan
    )

// Buat TestObject berdasarkan XPath dinamis
TestObject dynamicTestObject = new TestObject().addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

// Klik elemen berdasarkan XPath yang sudah di-generate
WebUI.click(dynamicTestObject, FailureHandling.OPTIONAL)

// Submit form Tahun Ajaran
WebUI.click(findTestObject('Master Data/Admin Sekolah/Tahun Ajaran/Button Submit Tahun Ajaran'), FailureHandling.OPTIONAL)

// Tutup browser setelah selesai
WebUI.closeBrowser(FailureHandling.OPTIONAL)

String createDynamicXPath(String date) {
    return ('//div[@class=\'mt-2 grid grid-cols-7\']//p[text()=\'' + date) + '\' and contains(@class, \'cursor-pointer\')]'
}

