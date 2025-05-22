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
WebUI.maximizeWindow()

// Navigate to the URL
WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564')

// Login
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo210@gmail.com')
WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123')
WebUI.click(findTestObject('Login/Button Submit Email Password'))

// Input OTP
(1..6).each { index ->
    WebUI.setText(findTestObject("Login/OTP Page/Kode OTP ${index}"), '1')
}

WebUI.click(findTestObject('Login/Button Submit OTP'))

// Navigate to the Payment menu
WebUI.click(findTestObject('Dashboard/Menu Payment'))

// Verify elements on Payment page
['Export Excel', 'Export PDF', 'Export Print'].each { element ->
    WebUI.verifyElementVisible(findTestObject("Payment/Export Excel/${element}"))
    WebUI.comment("Element ${element} terlihat, lanjut ke step selanjutnya")
}