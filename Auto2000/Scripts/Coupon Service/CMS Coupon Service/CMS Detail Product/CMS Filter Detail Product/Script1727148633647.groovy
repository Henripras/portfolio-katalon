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

WebUI.delay(4)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Kupon Service'))

WebUI.delay(4)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Detail Product'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Search'))

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Set Text Search'), 'KUPON SERVIS A')

WebUI.delay(2)

WebUI.clearText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Set Text Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Filter CMS'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Kategori Mobil CMS Detail'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Filter Kategori Mobil'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Tanggal Periode perubahan'))

String strDate = '12'

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Tanggal di ubah'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Sampai tanggal di ubah'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Atur tanggal di ubah'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/close Filter'))

WebUI.delay(2)

