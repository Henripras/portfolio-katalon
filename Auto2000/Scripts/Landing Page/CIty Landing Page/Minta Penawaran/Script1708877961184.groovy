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
		
		WebUI.delay(3)
		
		try {
			WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/button_MINTA PENAWARAN'))
			
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/button_MINTA PENAWARAN'))) {
				WebUI.comment('Elemen ini dapat di klik')
		
				WebUI.click(findTestObject('Object Repository/Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/button_MINTA PENAWARAN'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		WebUI.delay(2)
		
		WebUI.setText(findTestObject('Object Repository/Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/inputbranch-input-fullname'), 
		    'Januar')
		
		WebUI.setText(findTestObject('Object Repository/Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/inputbranch-input-phone-number'), 
		    '85819486322')
		
		WebUI.click(findTestObject('Events/Minta Penawaran/Field Model Mobil'), FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(5)
		
		if (WebUI.verifyElementPresent(findTestObject('Landing Page/City Landing Page/ModelMobilValue'), 30, FailureHandling.OPTIONAL)) {
		    // Step 2: If the element exists, click on it
		    WebUI.click(findTestObject('Landing Page/City Landing Page/ModelMobilValue' // Add any additional steps you want to perform after clicking the element
		            // Add a failure message or alternative steps if the element does not exist
		            ))
		} else {
		    WebUI.delay(30)
		
		    WebUI.click(findTestObject('Events/Minta Penawaran/Field Model Mobil'), FailureHandling.STOP_ON_FAILURE)
		
		    println('Element not found.')
		}
		
		try {
			
			if (WebUI.verifyElementClickable(findTestObject('Events/Minta Penawaran/Field Input Branch'))) {
				WebUI.comment('Elemen ini dapat di klik')
		
				WebUI.click(findTestObject('Events/Minta Penawaran/Field Input Branch'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		WebUI.delay(2)
		
		try {
			
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/Choose branch'))) {
				WebUI.comment('Elemen ini dapat di klik')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/Choose branch'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		
		WebUI.delay(2)
		
		try {
			
			if (WebUI.verifyElementClickable(findTestObject('Object Repository/Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/div_w-17px h-17px border rounded-none bg-in_95bb4d'))) {
				WebUI.comment('Elemen ini dapat di klik')
		
				WebUI.click(findTestObject('Object Repository/Landing Page/City Landing Page/Minta Penawaran/Page_Dealer dan Bengkel Toyota Jakarta Pusat/div_w-17px h-17px border rounded-none bg-in_95bb4d'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
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


