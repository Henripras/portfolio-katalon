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

WebUI.openBrowser('')

WebUI.maximizeWindow()

// Navigate to the URL
WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564')

// Login
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo250@gmail.com')

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123')

WebUI.click(findTestObject('Login/Button Submit Email Password'))

// Input OTP
(1..6).each({ def index ->
        WebUI.setText(findTestObject("Login/OTP Page/Kode OTP $index"), '1')
    })

WebUI.click(findTestObject('Login/Button Submit OTP'))

WebUI.click(findTestObject('Administrator/Menu Administrator'))

WebUI.click(findTestObject('Administrator/Sub Menu System Administration'))

/**
 * Fungsi untuk menghapus teks dalam field menggunakan CTRL + A dan DELETE
 * @param testObject TestObject yang merepresentasikan field input
 */
// Klik field untuk memastikan fokus
// CTRL + A untuk select all
// Delete teks yang dipilih
/**
 * Fungsi untuk menginput random company letterhead pada field
 * @param testObject TestObject yang merepresentasikan field input
 * @param options List of possible company letterheads
 */
// Pilih random letterhead
/**
 * Fungsi untuk menginput random footer pada field
 * @param testObject TestObject yang merepresentasikan field input
 * @param options List of possible footer texts
 */
// Pilih random footer
// Contoh implementasi
TestObject fieldCompanyLetterhead = findTestObject('Administrator/FIll Template Invoice/Field Company Letterhead')

TestObject fieldFooter = findTestObject('Administrator/FIll Template Invoice/Field Footer')

// Daftar company letterhead
List<String> companyLetterheads = ['Google LLC', 'Microsoft Corporation', 'Apple Inc.', 'Amazon.com, Inc.', 'Facebook, Inc. (Meta Platforms)'
    , 'Tesla, Inc.', 'Samsung Electronics Co., Ltd.', 'Toyota Motor Corporation', 'Sony Group Corporation', 'Intel Corporation'
    , 'IBM Corporation', 'Oracle Corporation', 'Cisco Systems, Inc.', 'Adobe Inc.', 'Salesforce, Inc.']

// Daftar footer
List<String> footers = ['Thank you for your business!', 'Please contact us if you have any questions.', 'Payment is due within 30 days.'
    , 'This invoice was generated automatically.', 'We appreciate your prompt payment.']

// Panggil fungsi untuk clear text dan menginput random company letterhead
clearTextUsingCtrlADelete(fieldCompanyLetterhead)

setRandomCompanyLetterhead(fieldCompanyLetterhead, companyLetterheads)

// Panggil fungsi untuk clear text dan menginput random footer
clearTextUsingCtrlADelete(fieldFooter)

setRandomFooter(fieldFooter, footers)

WebUI.click(findTestObject('Administrator/FIll Template Invoice/Button History'))

WebUI.click(findTestObject('Administrator/FIll Template Invoice/Button Close History'))

WebUI.click(findTestObject('Administrator/FIll Template Invoice/Button Preview'))

WebUI.click(findTestObject('Administrator/FIll Template Invoice/Button Close Preview'))

WebUI.click(findTestObject('Administrator/FIll Template Invoice/Button Apply'))

def clearTextUsingCtrlADelete(TestObject testObject) {
    WebUI.click(testObject)

    WebUI.sendKeys(testObject, Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(testObject, Keys.chord(Keys.DELETE))
}

def setRandomCompanyLetterhead(TestObject testObject, List<String> options) {
    Random random = new Random()

    String randomCompanyLetterhead = options[random.nextInt(options.size())]

    WebUI.setText(testObject, randomCompanyLetterhead)
}

def setRandomFooter(TestObject testObject, List<String> options) {
    Random random = new Random()

    String randomFooter = options[random.nextInt(options.size())]

    WebUI.setText(testObject, randomFooter)
}

