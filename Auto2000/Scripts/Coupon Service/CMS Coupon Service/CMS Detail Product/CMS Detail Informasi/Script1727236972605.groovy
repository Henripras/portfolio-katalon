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

WebUI.delay(4)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Create'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Detail Informasi'))

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Pop up Yes'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Title Detail Product'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Title Detail Product'))

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Title Detail Product'), 'KUPON SERVIS TOYOTA INNOVA 2024')

WebUI.delay(5)

WebUI.scrollToPosition(0, 296)

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Deskripsi Product'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Deskripsi Product'))

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Deskripsi Product'), 'Auto2000 menyediakan berbagai macam Kupon Servis Toyota Innova untuk semua model dan tipe kendaraan yang dikhususkan untuk setiap mobil Toyota Innova yang Anda miliki. ')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Detail Tag Product'))

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Detail Tag Product'), 'Efisiensi')

WebUI.delay(2)

WebUI.scrollToPosition(0, 729)

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Title Voucher Promo'), 'DISKON 50% s/d Rp 300.000 ')

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Deskripsi Title Promo'), 'Nikmati berbagai promo menarik lainnya di Auto2000 ')

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Pertinjau'))

WebUI.delay(5)

WebUI.closeWindowUrl('https://sit.auto2000.co.id/cms/coupon-service/preview')

WebUI.delay(5)

