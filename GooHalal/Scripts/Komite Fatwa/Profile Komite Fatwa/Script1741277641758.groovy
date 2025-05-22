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

WebUI.navigateToUrl('https://goohalal.ihtekno.tech/login')

WebUI.click(findTestObject('Login/Field Dropdown Masuk Sebagai'))

WebUI.click(findTestObject('Komite Fatwa/Value Masuk Sebagai Komite Fatwa'))

WebUI.click(findTestObject('Login/Button Konfirmasi Masuk Sebagai'))

WebUI.click(findTestObject('Login/Button Masuk To Login Page'))

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.setText(findTestObject('Login/Field Email Login'), 'majelisfatwahalal@example.com')

WebUI.click(findTestObject('Login/Field Password Login'))

WebUI.setText(findTestObject('Login/Field Password Login'), '123456')

WebUI.delay(10)

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.click(findTestObject('Login/Button Masuk Login'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Pendamping Halal/Homepage/Button Mengerti Pop Up Informasi'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pendamping Halal/Homepage/Menu Sertifikasi'))

WebUI.click(findTestObject('Komite Fatwa/Homepage/Sub Menu Profile Komite Fatwa'))

WebUI.delay(3)

WebUI.click(findTestObject('Komite Fatwa/Page Profile Komite Fatwa/Field Nomor Hp'))

// Fungsi untuk menghasilkan nomor HP acak dengan panjang maksimum 13 digit
// Pilih panjang 12 atau 13 digit secara acak
// Membuat nomor HP acak dengan panjang yang ditentukan
// Menambahkan angka acak
// Ambil nomor HP acak
def randomHp = generateRandomPhoneNumber()

// Masukkan nomor HP acak ke dalam field
WebUI.sendKeys(findTestObject('Komite Fatwa/Page Profile Komite Fatwa/Field Nomor Hp'), 'CTRL + A')

WebUI.sendKeys(findTestObject('Komite Fatwa/Page Profile Komite Fatwa/Field Nomor Hp'), 'Delete')

WebUI.setText(findTestObject('Komite Fatwa/Page Profile Komite Fatwa/Field Nomor Hp'), randomHp)

WebUI.delay(3)

def generateRandomPhoneNumber() {
    def randomPhoneNumber = ''

    def length = 12 + new Random().nextInt(2)

    for (int i = 0; i < length; i++) {
        randomPhoneNumber += new Random().nextInt(10)
    }
    
    return randomPhoneNumber
}

