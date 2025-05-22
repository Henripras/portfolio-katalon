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
WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564/')
WebUI.waitForPageLoad(5)

// Login
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo210@gmail.com')
WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123')
WebUI.click(findTestObject('Login/Button Submit Email Password'))
WebUI.delay(10)
WebUI.click(findTestObject('Login/Button Submit OTP'))

// Navigasi Menu
List<String> menuPaths = [
    'Dashboard/Menu Transaksi',
    'Dashboard/Sub Menu Trade',
    'Dashboard/Sub Menu Non Trade',
    'Dashboard/Menu Payment',
    'Dashboard/Menu Report',
    'Dashboard/Report Account Receivable',
    'Dashboard/Report Account Payable',
    'Dashboard/Menu Change Profile',
    'Dashboard/Sub Menu My Profile',
    'Dashboard/Sub Menu My Access',
    'Dashboard/Menu Contact Us',
    'Dashboard/Button Notification',
    'Dashboard/Menu Home'
]

menuPaths.each { menu ->
    WebUI.click(findTestObject(menu))
    WebUI.delay(1) // Delay untuk memastikan stabilitas navigasi
}


