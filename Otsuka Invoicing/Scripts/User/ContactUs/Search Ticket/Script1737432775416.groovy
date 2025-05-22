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

WebUI.click(findTestObject('Contact Us/Search_Ticket/Field Search'), FailureHandling.OPTIONAL)

// Daftar subjects
subjects = ['Permintaan Barang Elektronik', 'Permintaan Alat Tulis Kantor', 'Permintaan Jasa Kebersihan', 'Permintaan Jasa IT'
    , 'Permintaan Bahan Makanan', 'Permintaan Jasa Konsultasi', 'Permintaan Barang Kesehatan', 'Permintaan Jasa Transportasi'
    , 'Test']

// Menggunakan Random untuk memilih elemen acak dari daftar
Random random = new Random()

int index = random.nextInt(subjects.size( // Menghasilkan index acak antara 0 dan (subjects.size() - 1)
        ))

String randomSubject = subjects[index // Memilih elemen acak berdasarkan index
]

// Menunggu dan mengisi field pencarian dengan subject acak
WebUI.waitForElementVisible(findTestObject('Contact Us/Search_Ticket/Field Search'), 10, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Contact Us/Search_Ticket/Field Search'), randomSubject, FailureHandling.OPTIONAL)

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Search_Ticket/Kembalikan Ke Sebelum Search'), FailureHandling.OPTIONAL)

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

