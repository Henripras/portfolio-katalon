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
import java.util.Random as Random

WebUI.openBrowser('', FailureHandling.OPTIONAL)

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564/', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

// Login
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo41@gmail.com', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Login/Button Submit Email Password'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/OTP 1'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/OTP 1'), '673432', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/Submit OTP'), FailureHandling.OPTIONAL)

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Add_Ticket/Sidebar menu Contact us'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Sort_Ticket/Sort Button'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Sort_Ticket/Sorting'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Sort_Ticket/Button Submit'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

