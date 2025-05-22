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

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.click(findTestObject('Master Data/TU/HomePageMenu/Sidebar Menu'))

WebUI.click(findTestObject('Master Data/TU/HomePageMenu/Sub Menu Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Filter Tagihan/Klik Button Filter'))

WebUI.click(findTestObject('Master Data/TU/Filter Tagihan/Modal Filter/Tipe Tagihan/Klik Dropdown Tipe Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Filter Tagihan/Modal Filter/Tipe Tagihan/Pilih Value Tipe Tagihan'))

WebUI.click(findTestObject('Master Data/TU/Filter Tagihan/Modal Filter/Rekening Bank/Klik Dropdown Rekening Bank'))

WebUI.click(findTestObject('Master Data/TU/Filter Tagihan/Modal Filter/Rekening Bank/Input Rekening Bank'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/TU/Filter Tagihan/Modal Filter/Rekening Bank/Cari Rekening Bank'), '1223123')

WebUI.click(findTestObject('Master Data/TU/Filter Tagihan/Modal Filter/Rekening Bank/Input Hasil Pencarian'))

WebUI.click(findTestObject('Master Data/TU/Filter Tagihan/Modal Filter/Terapkan/Klik Terapkan'))

WebUI.delay(3)

WebUI.closeBrowser()

