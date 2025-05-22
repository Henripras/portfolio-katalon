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

WebUI.maximizeWindow()

WebUI.navigateToUrl('sit.auto2000.co.id/cms')

WebUI.setText(findTestObject('CMS/Login CMS/Username'), 'admin')

WebUI.setText(findTestObject('CMS/Login CMS/Password'), 'admin')

WebUI.click(findTestObject('CMS/Login CMS/Button Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Search FAQ/Button Listing Kupon Servis'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Search FAQ/Button Detail FAQ'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Button Tambah FAQ'))

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Field Pertanyaan FAQ'), 'Test')

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Field Jawaban FAQ'), 'Test')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Button Listing Produk Tambah FAQ'), 
    0)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Field Kategori mobil'))

WebUI.delay(1)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Kategori mobil MPV Detail'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Kategori mobil SUV Detail'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Close select tag mobil SUV'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Close Dropdown Kategori'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Field Model mobil'))

WebUI.delay(1)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Model mobil Avanza Detail'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Close Dropdown Model mobil'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Button Listing Produk Tambah FAQ'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Field Kategori mobil'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Kategori mobil Semua Listing'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Button Submit'))

WebUI.delay(4)

