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

// Mulai sesi browser dan buka URL login
WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

// Login ke aplikasi
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

// Navigasi ke menu Akun Bank
WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Menu Laporan'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Sub Menu Pembayaran'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Dropdown Kelas'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Field Pencarian Kelas'))

WebUI.setText(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Field Pencarian Kelas'), 'XII IPS')

WebUI.verifyElementVisible(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Value Dropdown Kelas XII IPS 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Value Dropdown Kelas XII IPS 2'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Dropdown Metode Pembayaran'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Value Metode Pembayaran Kasir'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Dropdown Status'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Value Status Lunas'))

WebUI.delay(2)

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Button Terapkan'))

WebUI.delay(2)

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Button Reset'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Field Pencarian Siswa'))

WebUI.setText(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Field Pencarian Siswa'), 'Adam')

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Value Rekomendasi Pencarian Siswa'))

WebUI.click(findTestObject('Laporan/Laporan Pembayaran/Filter Search Laporan Pembayaran/Button Terapkan'))

