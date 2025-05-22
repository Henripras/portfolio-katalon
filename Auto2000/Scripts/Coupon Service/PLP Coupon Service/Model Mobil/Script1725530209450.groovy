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

WebUI.navigateToUrl('https://sit.auto2000.co.id/c/kupon-service')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 591)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/Penawaran Khusus/Field Penawaran Khusus'))

WebUI.delay(2)

WebUI.check(findTestObject('Coupon Service/PLP Coupon Service/Penawaran Khusus/Diskon'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Coupon Service/PLP Coupon Service/Penawaran Khusus/Diskon'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 591)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Field Model Mobil'))

WebUI.delay(2)

WebUI.check(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Agya'))

WebUI.delay(5)

WebUI.uncheck(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Agya'))

WebUI.delay(5)

WebUI.check(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Altis'))

WebUI.delay(5)

WebUI.uncheck(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Altis'))

WebUI.delay(5)

WebUI.check(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Avanza'))

WebUI.delay(5)

WebUI.uncheck(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Avanza'))

WebUI.delay(5)

WebUI.check(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Innova'))

WebUI.delay(5)

WebUI.uncheck(findTestObject('Coupon Service/PLP Coupon Service/Model Mobil/Innova'))

WebUI.delay(5)

