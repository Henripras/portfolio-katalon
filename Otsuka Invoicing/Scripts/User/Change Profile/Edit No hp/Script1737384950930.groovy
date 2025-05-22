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
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo41@gmail.com')

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123')

WebUI.click(findTestObject('Login/Button Submit Email Password'))

WebUI.click(findTestObject('Profile/OTP 1'))

WebUI.setText(findTestObject('Profile/OTP 1'), '673432')

WebUI.click(findTestObject('Profile/Submit OTP'))

WebUI.delay(4)

WebUI.click(findTestObject('Profile/Email/Sidebar change Profile'))

WebUI.delay(1)

WebUI.click(findTestObject('Profile/Email/Sub-menu My Profile'))

WebUI.delay(2)

WebUI.click(findTestObject('Profile/NoHp/Edit No Hp'))

WebUI.delay(1)

WebUI.click(findTestObject('Profile/NoHp/Field phone Number'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Profile/NoHp/Field phone Number'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Profile/NoHp/Field phone Number'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(2)

List<String> randomNumbers = ['81234567890', '81987654321', '85876543210', '82333445566', '83356778899', '87583946710', '89357485623'
    , '83771245689', '87628345591', '84938296754']

// Menghasilkan nomor acak dari daftar
Random rand = new Random()

String randomPhoneNumber = randomNumbers[rand.nextInt(randomNumbers.size())]

// Menginputkan nomor acak ke dalam field
WebUI.sendKeys(findTestObject('Profile/NoHp/Field phone Number'), randomPhoneNumber)

WebUI.delay(3)

WebUI.click(findTestObject('Profile/NoHp/Tombol X'))

WebUI.closeBrowser()

