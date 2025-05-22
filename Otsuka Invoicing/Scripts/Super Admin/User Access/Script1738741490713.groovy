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
WebUI.setText(findTestObject('Login/Field Email'), Email)

WebUI.setText(findTestObject('Login/Field Password'), Password)

WebUI.click(findTestObject('Login/Button Submit Email Password'))

// Input OTP
(1..6).each({ def index ->
        WebUI.setText(findTestObject("Login/OTP Page/Kode OTP $index"), '1')
    })

WebUI.click(findTestObject('Login/Button Submit OTP'))

WebUI.click(findTestObject('Administrator/Menu Administrator'))

WebUI.click(findTestObject('Administrator/Sub Menu User And Registration'))

WebUI.click(findTestObject('Administrator/Page Company Registration/Sub Menu User Access'))

WebUI.click(findTestObject('Administrator/Page User Access/Button View'))

WebUI.click(findTestObject('Administrator/Page Access Management/Button PDF'))

WebUI.click(findTestObject('Administrator/Page Access Management/Button Print'))

