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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pre.auto2000.co.id/berita-dan-tips')

WebUI.click(findTestObject('Events/Static Tab (Kategori) dan PLP/Tab_BERITA'))

WebUI.verifyElementVisible(findTestObject('Events/Static Tab (Kategori) dan PLP/Hero Banner'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Events/Static Tab (Kategori) dan PLP/Tab_BERITA'), Keys.chord(Keys.SPACE, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.scrollToPosition(0, 250)

// Define the element to be verified
TestObject shareButton = new TestObject('Object Repository/Events/Share Button/Button share')

shareButton.addProperty('xpath', ConditionType.EQUALS, '//button[contains(@id, \'btn-modal-share\')]')

// Verify if the element is visible
if (WebUI.verifyElementVisible(shareButton, FailureHandling.OPTIONAL)) {
    WebUI.click(shareButton)

    WebUI.delay(2 // Re-attempt to click the button after refresh
        )
} else {
    WebUI.refresh()

    WebUI.delay(0)

    if (WebUI.verifyElementVisible(shareButton, FailureHandling.OPTIONAL)) {
        WebUI.click(shareButton)

        WebUI.delay(2)
    }
}

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Events/Share Button/WhatsApp'), 10, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Events/Share Button/Facebook'), 10, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Events/Share Button/X'), 10, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Events/Share Button/Tiktok'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Events/Share Button/Copy Link'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Events/Share Button/Close_button share'), FailureHandling.OPTIONAL)

