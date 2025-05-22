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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as Driver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser('')

// Navigate to the URL
WebUI.navigateToUrl('https://pre.auto2000.co.id/berita-dan-tips')

// Maximize the window
WebUI.maximizeWindow()

WebUI.delay(2)

// Click on an element
WebUI.click(findTestObject('Object Repository/Objek Berita dan Tips/tabNewsBERITA'))

// Wait for page load
WebUI.waitForPageLoad(8)

// Scroll to the element to ensure it's within the viewport
WebUI.verifyElementVisible(findTestObject('Events/Static Tab (Kategori) dan PLP/Hero Banner'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Events/Static Tab (Kategori) dan PLP/Tab_BERITA'), Keys.chord(Keys.SPACE, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.delay(2)

// Set text to input fields
WebUI.setText(findTestObject('Object Repository/Events/Minta Penawaran/input_Nama Lengkap_input-full-name'), 'Jennyfer')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Events/Minta Penawaran/input_Nomor Handphone_input-phone-number'), '85270980450')

WebUI.scrollToPosition(0, 400)

// Click on elements
WebUI.click(findTestObject('Object Repository/Events/Minta Penawaran/input_Model Mobil_dd-model-mobil'))

WebUI.delay(5)

//Isi Model Mobil
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Events/Minta Penawaran/Model Mobil'), 30, FailureHandling.OPTIONAL)) {
    // Step 2: If the element exists, click on it
    WebUI.click(findTestObject('Object Repository/Events/Minta Penawaran/Model Mobil') // Add any additional steps you want to perform after clicking the element
        ) // Add a failure message or alternative steps if the element does not exist
} else {
    WebUI.click(findTestObject('Object Repository/Events/Minta Penawaran/input_Model Mobil_dd-model-mobil'))

    println('Element not found.')
}

WebUI.click(findTestObject('Object Repository/Section inquiry city/Checkbox terms Condition'), FailureHandling.OPTIONAL)

