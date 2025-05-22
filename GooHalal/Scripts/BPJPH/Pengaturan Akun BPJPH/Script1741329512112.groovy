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

WebUI.navigateToUrl('https://goohalal.ihtekno.tech/login')

WebUI.click(findTestObject('Login/Field Dropdown Masuk Sebagai'))

WebUI.click(findTestObject('BPJPH/Value Masuk Sebagai BPJPH'))

WebUI.click(findTestObject('Login/Button Konfirmasi Masuk Sebagai'))

WebUI.click(findTestObject('BPJPH/Masuk Sebagai BPJPH'))

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.setText(findTestObject('Login/Field Email Login'), 'bpjph@example.com')

WebUI.click(findTestObject('Login/Field Password Login'))

WebUI.setText(findTestObject('Login/Field Password Login'), '123456')

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.click(findTestObject('Login/Button Masuk Login'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Pendamping Halal/Homepage/Button Mengerti Pop Up Informasi'))

WebUI.click(findTestObject('BPJPH/Page Pengaturan Akun/Menu Pengaturan Akun'))

WebUI.click(findTestObject('BPJPH/Page Pengaturan Akun/Button Ubah Informasi'))

// Fungsi untuk menghasilkan nomor HP random dengan panjang antara 10 hingga 13 digit
// Panjang nomor diacak antara 10 hingga 13 digit
// (10, 11, 12, 13)
// Awalan nomor HP di Indonesia
// Tambahkan angka secara random
// Menambahkan angka 0-9 secara random
// Fungsi untuk menginput nomor HP
// Klik pada field input
// Select all (CTRL + A) lalu hapus (DELETE)
// Input nomor HP yang valid
// Panggil fungsi untuk menginput nomor HP random
inputRandomPhoneNumber()

WebUI.click(findTestObject('BPJPH/Page Pengaturan Akun/Button Simpan Informasi'))

String generateRandomPhoneNumber() {
    Random rand = new Random()

    int length = rand.nextInt(4) + 10

    String phoneNumber = '08'

    for (int i = 2; i < length; i++) {
        phoneNumber += rand.nextInt(10)
    }
    
    return phoneNumber
}

void inputRandomPhoneNumber() {
    String randomPhoneNumber = generateRandomPhoneNumber()

    TestObject fieldNomorHp = findTestObject('BPJPH/Page Pengaturan Akun/Field Nomor Hp')

    WebUI.click(fieldNomorHp)

    WebUI.sendKeys(fieldNomorHp, Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(fieldNomorHp, Keys.chord(Keys.DELETE))

    WebUI.setText(fieldNomorHp, randomPhoneNumber)

    println('✅ Nomor HP yang dimasukkan: ' + randomPhoneNumber)
}

