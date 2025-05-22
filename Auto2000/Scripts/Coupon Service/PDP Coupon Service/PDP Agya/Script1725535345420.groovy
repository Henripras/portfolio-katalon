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

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Coupon Model Mobil'))

WebUI.scrollToPosition(0, 864)

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Model Agya'))

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Card Coupun Agya'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Share Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Close Button Share'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Cuopon Diskon'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Syarat dan Ketentuan'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Close TnC'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Card Diskon'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 251)

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Tipe Mobil'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Manual Agya'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 153)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Cuopon Servis Agya 1'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 153)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Cuopon Servis Agya 2'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 443)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Cuopon Servis Agya 3'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Coupon Service/PDP Coupon Service/Syarat dan Ketentuan Element'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Syarat dan Ketentuan Kupon service'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Close Syarat dan Ketentuan'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 1381)

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/FAQ'))

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Expend FAQ'))

WebUI.scrollToPosition(0, 969)

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Button Beli Langsung'))

WebUI.delay(5)

try {
    if (WebUI.waitForElementVisible(findTestObject('Coupon Service/PDP Coupon Service/Button Simpan Lokasi SIT'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')

        WebUI.delay(2)

        WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/Button Simpan Lokasi SIT'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.click(findTestObject('NCP/hover effect/Close Location'), FailureHandling.OPTIONAL)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

WebUI.delay(5)

WebUI.setText(findTestObject('Coupon Service/PDP Coupon Service/Input Login Number'), '082189003138')

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PDP Coupon Service/button login'))

