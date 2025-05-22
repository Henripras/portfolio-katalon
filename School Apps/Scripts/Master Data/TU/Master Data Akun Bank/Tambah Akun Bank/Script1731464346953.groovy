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

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.sekolah@gmail.com')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Menu Master Data'))

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Menu Akun Bank'))

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Button Tambah'))

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Pilih Nama Bank'))

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/BNI Syariah'))

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Klik Nama Rekening'))

WebUI.setText(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Klik Nama Rekening'), 'Katalons')

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Klik Nomor Rekening'))

WebUI.setText(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Klik Nomor Rekening'), '317541245')

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Klik Kepemilikan'))

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Sekolah'))

WebUI.click(findTestObject('Master Data/TU/Akun Bank/Tambah Akun Bank/Button Tambahkan'))

