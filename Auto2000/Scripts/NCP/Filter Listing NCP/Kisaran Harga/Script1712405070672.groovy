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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pre.auto2000.co.id/c/mobil-baru-toyota')

WebUI.maximizeWindow()

// Set the desired values for the slider
int minSliderValue = 231933200 // Example minimum value

int maxSliderValue = 1500000000 // Example maximum value

// Set the locator for the range input elements
String minSliderLocator = '//input[@data-testid="slider-min"]'

String maxSliderLocator = '//input[@data-testid="slider-max"]'

// Get the WebDriver instance
def driver = DriverFactory.getWebDriver()

// Execute JavaScript to set the value of the minimum slider
    ((driver) as JavascriptExecutor).executeScript('document.querySelector(arguments[0]).value = arguments[1];', minSliderLocator, 
    minSliderValue)

// Execute JavaScript to set the value of the maximum slider
    ((driver) as JavascriptExecutor).executeScript('document.querySelector(arguments[0]).value = arguments[1];', maxSliderLocator, 
    maxSliderValue)

WebUI.delay(5)

WebUI.dragAndDropByOffset(findTestObject(null), 0, 0)

