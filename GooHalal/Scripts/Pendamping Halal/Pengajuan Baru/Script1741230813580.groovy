import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import java.util.Random as Random
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

// Fungsi untuk melakukan klik dengan FailureHandling.OPTIONAL dan menunggu hanya 3 detik
// Tunggu hingga elemen terlihat dengan timeout yang lebih pendek (misalnya 3 detik)
// Jika gagal menemukan elemen dalam waktu yang ditentukan, lanjutkan tanpa error
// Daftar nomor HP
def phoneNumbers = ['081279699119', '081221581491', '081239289400', '081296913674', '081214752282', '081210328641', '081291617353','081277344341']

// Pilih nomor HP secara acak
def randomPhoneNumber = phoneNumbers[new Random().nextInt(phoneNumbers.size())]

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://goohalal.ihtekno.tech/login')

// Contoh penggunaan fungsi klik dengan FailureHandling.OPTIONAL dan timeout 3 detik
clickWithOptionalHandling(findTestObject('Existing To Sihalal/Pop Up Chrome Later Subscription'))

clickWithOptionalHandling(findTestObject('Login/Field Dropdown Masuk Sebagai'))

clickWithOptionalHandling(findTestObject('Pendamping Halal/Value Masuk Sebagai Pendamping Halal'))

clickWithOptionalHandling(findTestObject('Login/Button Konfirmasi Masuk Sebagai'))

clickWithOptionalHandling(findTestObject('Login/Button Masuk To Login Page'))

clickWithOptionalHandling(findTestObject('Login/Field Email Login'))

// Isi field "Email Login" dengan nomor HP yang dipilih secara acak
WebUI.setText(findTestObject('Login/Field Email Login'), randomPhoneNumber)

clickWithOptionalHandling(findTestObject('Login/Field Password Login'))

WebUI.setText(findTestObject('Login/Field Password Login'), '123456')

clickWithOptionalHandling(findTestObject('Login/Field Email Login'))

clickWithOptionalHandling(findTestObject('Login/Button Masuk Login'))

WebUI.waitForPageLoad(5)

clickWithOptionalHandling(findTestObject('Pendamping Halal/Homepage/Button Mengerti Pop Up Informasi'))

clickWithOptionalHandling(findTestObject('Pendamping Halal/Homepage/Menu Pengajuan Baru'))

clickWithOptionalHandling(findTestObject('Pendamping Halal/Page Pengajuan Baru/Lihat Detail Pengajuan Baru'))

WebUI.delay(12)

clickWithOptionalHandling(findTestObject('Pendamping Halal/Page Pengajuan Baru/Button Terima'))

def clickWithOptionalHandling(TestObject testObject, int timeoutInSeconds = 3) {
    try {
        if (WebUI.waitForElementVisible(testObject, timeoutInSeconds, FailureHandling.OPTIONAL)) {
            WebUI.click(testObject)
        }
    }
    catch (Exception e) {
        WebUI.comment("Elemen tidak ditemukan atau tidak bisa diklik dalam waktu $timeoutInSeconds detik.")
    } 
}

