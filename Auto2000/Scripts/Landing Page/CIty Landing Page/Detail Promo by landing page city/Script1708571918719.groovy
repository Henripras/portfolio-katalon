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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.exception.StepFailedException


int retryCount = 0
int maxRetry = 3
boolean elementFound = false

while (retryCount < maxRetry && !elementFound) {
	try {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat')

		WebUI.maximizeWindow()
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Seection Promo/Card Promo'))
		
		WebUI.delay(3)
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/Breadcrumbs PDP'))
		
		WebUI.scrollToPosition(0, 473)
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/Periode Promosi'))
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/Deskripsi Promo'))
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Seection Promo/Button share'))
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Icon Share Button/Copy Button'))
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Icon Share Button/Page_Jakarta - Simulasi Kredit dan Cicilan Toyota Veloz 2024  Auto 2000/CloseBtn'))
		
		WebUI.scrollToElement(findTestObject('Landing Page/City Landing Page/Seection Promo/Section Promo Lainnya'), 5)
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/Section Promo Lainnya'))
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Seection Promo/Section bagikan'))
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Icon Share Button/Whatsapp'))
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Icon Share Button/Facebook'))
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Icon Share Button/X'))
		
//		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Icon Share Button/Tiktok'))
		
		WebUI.scrollToElement(findTestObject('Landing Page/City Landing Page/Footer'), 0)
		
		WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Footer'))
		elementFound = true
	} catch (Exception e) {
		retryCount++
		WebUI.delay(2) 
	}
}

if (!elementFound) {
	WebUI.comment("Element not found after ${maxRetry} retries")
	throw new StepFailedException("Element not found")
}



