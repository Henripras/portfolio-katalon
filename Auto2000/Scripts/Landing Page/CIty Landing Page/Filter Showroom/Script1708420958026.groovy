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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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
		
		try {
		    if (WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'))) {
		        WebUI.comment('Elemen ini terlihat')
		
		        WebUI.click(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'), FailureHandling.CONTINUE_ON_FAILURE)
		    } else {
		        WebUI.comment('Elemen tidak terlihat')
		    }
		}
		catch (Exception e) {
		    WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		} 
		
		WebUI.delay(2)
		
		try {
			if (WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Filter City/Checkbox Showroom'))) {
				WebUI.comment('Elemen ini terlihat')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Checkbox Showroom'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		try {
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Button Pilih'))) {
				WebUI.comment('Elemen ini terlihat')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Button Pilih'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		WebUI.delay(3)
		
		try {
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'))) {
				WebUI.comment('Elemen ini terlihat')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		WebUI.delay(3)
		
		try {
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Checkbox Bengkel dan cabang'))) {
				WebUI.comment('Elemen ini terlihat')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Checkbox Bengkel dan cabang'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		
		WebUI.delay(2)
		
		try {
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Button Pilih'))) {
				WebUI.comment('Elemen ini terlihat')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Button Pilih'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		
		WebUI.delay(2)
		
		try {
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'))) {
				WebUI.comment('Elemen ini terlihat')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		
		WebUI.delay(3)
		
		WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Button Hapus Semua'))
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Button Hapus Semua'))
		
		WebUI.delay(2)
		
		WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Checkbox body dan cat'))
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Checkbox body dan cat'))
		
		WebUI.delay(2)
		
		WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Button Pilih'))
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Button Pilih'))
		
		WebUI.delay(2)
		
		WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'))
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Section Location/Button Filter'))
		
		WebUI.delay(3)
		
		try {
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Button Hapus Semua'))) {
				WebUI.comment('Elemen ini terlihat')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Button Hapus Semua'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		}
		
		WebUI.delay(2)
		
		try {
			if (WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Branch Terdekat'))) {
				WebUI.comment('Elemen ini terlihat')
		
				WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Branch Terdekat'), FailureHandling.CONTINUE_ON_FAILURE)
			} else {
				WebUI.comment('Elemen tidak dapat di Klik')
			}
		}
		catch (Exception e) {
			WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
		
		}
		WebUI.delay(2)
		
		WebUI.verifyElementClickable(findTestObject('Landing Page/City Landing Page/Filter City/Button Pilih'))
		
		WebUI.click(findTestObject('Landing Page/City Landing Page/Filter City/Button Pilih'))
		
		WebUI.delay(2)
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



