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
import java.util.Random

WebUI.openBrowser('')

WebUI.maximizeWindow()

// Navigate to the URL
WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564')

// Login
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo6@gmail.com')

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123')

WebUI.click(findTestObject('Login/Button Submit Email Password'))

// Input OTP
(1..6).each({ def index -> 
    WebUI.setText(findTestObject("Login/OTP Page/Kode OTP $index"), '1')
})

WebUI.click(findTestObject('Login/Button Submit OTP'))

WebUI.click(findTestObject('Administrator/Menu Administrator'))

WebUI.click(findTestObject('Administrator/Sub Menu System Administration'))

WebUI.verifyElementVisible(findTestObject('Administrator/System Administration/Headline System Administration/Password Administrator'))

WebUI.click(findTestObject('Administrator/System Administration/Headline System Administration/Password Administrator'))

// Generate random number between 5 and 10
Random rand = new Random()
int randomNumber1 = rand.nextInt(6) + 5  // Menghasilkan angka acak antara 5 hingga 10

// Set text with random number
WebUI.setText(findTestObject('Administrator/System Administration/Page Password Administrator/Field Minimum Character'), 
    String.valueOf(randomNumber1))

// Generate random number between 30 and 100
int randomNumber2 = rand.nextInt(71) + 30  // Menghasilkan angka acak antara 30 hingga 100

// Set text with random number
WebUI.setText(findTestObject('Administrator/System Administration/Page Password Administrator/Field Renew of password every'), 
    String.valueOf(randomNumber2))

// Click checkboxes
WebUI.click(findTestObject('Administrator/System Administration/Page Password Administrator/Checkbox Uppercase'))

WebUI.click(findTestObject('Administrator/System Administration/Page Password Administrator/Checkbox Lowercase'))

WebUI.click(findTestObject('Administrator/System Administration/Page Password Administrator/Checkbox Number'))

WebUI.click(findTestObject('Administrator/System Administration/Page Password Administrator/Checkbox Alphabet'))

WebUI.click(findTestObject('Administrator/System Administration/Page Password Administrator/Checkbox Symbol'))

WebUI.delay(3)

WebUI.click(findTestObject('Administrator/System Administration/Page Password Administrator/Button Cancel'))
