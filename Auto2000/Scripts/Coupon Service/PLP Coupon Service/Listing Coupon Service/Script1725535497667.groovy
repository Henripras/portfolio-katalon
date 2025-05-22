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

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/Kategori Coupon Service/Hatchback'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Coupon Service/PDP Coupon Service/Card Coupun Agya'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Coupon Service/PDP Coupon Service/Card Coupun Agya'))) {
    println('Kupon tersebut muncul')
} else {
    println('Kupon tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/Kategori Coupon Service/MPV'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Coupon Service/PDP Coupon Service/Card Cuopon Avanza'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Coupon Service/PDP Coupon Service/Card Cuopon Avanza'))) {
    println('Kupon tersebut muncul')
} else {
    println('Kupon tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/Kategori Coupon Service/Sedan'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Coupon Service/PDP Coupon Service/Card Cuopon Altis'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Coupon Service/PDP Coupon Service/Card Cuopon Altis'))) {
    println('Kupon tersebut muncul')
} else {
    println('Kupon tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/Kategori Coupon Service/Semua'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 584)

WebUI.delay(2)

WebUI.scrollToPosition(0, 947)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1427)

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/FAQ Listing/FAQ 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/FAQ Listing/FAQ 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/FAQ Listing/FAQ 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/FAQ Listing/FAQ 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/Informasi Kupon Servis/Lihat Selengkapnya'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/PLP Coupon Service/Informasi Kupon Servis/Lihat Lebih Sedikit'))

WebUI.delay(2)

