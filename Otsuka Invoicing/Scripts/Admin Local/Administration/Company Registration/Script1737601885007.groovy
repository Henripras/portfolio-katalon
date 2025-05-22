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
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import java.util.Random

// Fungsi untuk menghapus teks dalam field menggunakan CTRL + A dan DELETE
def clearTextUsingCtrlADelete(TestObject testObject) {
    WebUI.click(testObject) // Klik field untuk memastikan fokus
    WebUI.sendKeys(testObject, Keys.chord(Keys.CONTROL, 'a')) // CTRL + A untuk select all
    WebUI.sendKeys(testObject, Keys.chord(Keys.DELETE)) // Delete teks yang dipilih
}

// Fungsi untuk menginput data random untuk nama perusahaan
def setRandomCompanyName(TestObject testObject) {
    List<String> companyNames = [
        'Google LLC',
        'Microsoft Corporation',
        'Apple Inc.',
        'Amazon.com, Inc.',
        'Facebook (Meta Platforms)',
        'Tesla, Inc.',
        'Samsung Electronics',
        'Toyota Motor Corporation'
    ]
    Random random = new Random()
    String randomCompanyName = companyNames[random.nextInt(companyNames.size())]
    WebUI.setText(testObject, randomCompanyName)
}

// Fungsi untuk menginput data random untuk alamat
def setRandomAddress(TestObject testObject) {
    List<String> addresses = [
        '1600 Amphitheatre Parkway, Mountain View, CA 94043, USA',
        '1 Microsoft Way, Redmond, WA 98052, USA',
        '1 Infinite Loop, Cupertino, CA 95014, USA',
        '410 Terry Avenue North, Seattle, WA 98109, USA',
        '5000 Tesla Road, Fremont, CA 94538, USA',
        'Samsung Digital City, Suwon-si, Gyeonggi-do, South Korea'
    ]
    Random random = new Random()
    String randomAddress = addresses[random.nextInt(addresses.size())]
    WebUI.setText(testObject, randomAddress)
}

// Buka browser dan lakukan navigasi
WebUI.openBrowser('')
WebUI.maximizeWindow()
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

// Navigasi ke menu Administrator dan User Registration
WebUI.click(findTestObject('Administrator/Menu Administrator'))
WebUI.click(findTestObject('Administrator/Sub Menu User And Registration'))

// Implementasi pada objek Company dan Address
TestObject fieldCompany = findTestObject('Administrator/Company Registration/Field Company')
TestObject fieldAddress = findTestObject('Administrator/Company Registration/Field Address')

// Clear dan input random data untuk Company
clearTextUsingCtrlADelete(fieldCompany)
setRandomCompanyName(fieldCompany)

// Clear dan input random data untuk Address
clearTextUsingCtrlADelete(fieldAddress)
setRandomAddress(fieldAddress)

// Pilih status aktif/inaktif
WebUI.click(findTestObject('Administrator/Company Registration/Radio Button Inactive'))
WebUI.click(findTestObject('Administrator/Company Registration/Radio Button Active'))

// Klik tombol Apply
WebUI.click(findTestObject('Administrator/Company Registration/Button Apply'))

// Verifikasi notifikasi
WebUI.verifyElementVisible(findTestObject('Administrator/Company Registration/Toast Notification Company Update'))