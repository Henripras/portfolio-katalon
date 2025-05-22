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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository

Mobile.startApplication('C:\\Users\\henri\\Downloads\\SiprusEdu SIT Debug v0.24.45.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

// Tap the dropdown to select a school
Mobile.tap(findTestObject('Login/Field Dropdown Pilih Sekolah'), 0)

WebUI.delay(2)

// Select the school value from the dropdown
Mobile.tap(findTestObject('Login/Value Dropdown Pilih Sekolah'), 0)

// Tap the "Lanjut" button
Mobile.tap(findTestObject('Login/Button Lanjut'), 0)

Mobile.tap(findTestObject('Login/Field Email'), 0)

// Set text for email field
Mobile.setText(findTestObject('Login/Field Email'), 'user.ortu@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.delay(2)

// Tap pada field password untuk memastikan fokus
Mobile.tap(findTestObject('Login/Field Password'), 0, FailureHandling.STOP_ON_FAILURE)

// Coba input teks
Mobile.setText(findTestObject('Login/Field Password'), 'Test1234', 0, FailureHandling.OPTIONAL)

Mobile.hideKeyboard()

WebUI.delay(2)

// Verify the login button is visible
Mobile.verifyElementVisible(findTestObject('Login/Button Submit Login'), 0)

// Tap the "Login" button
Mobile.tap(findTestObject('Login/Button Submit Login'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Homepage/Button Notification'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Homepage/Button Daftar Siswa'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Homepage/Button Pengumuman'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Button Menu/Button Beranda'), 0)

Mobile.tap(findTestObject('Homepage/Button Tagihan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Button Menu/Button Beranda'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Homepage/Button Lainnya'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

// Fungsi untuk scroll ke bawah
void scrollDown(int startX, int startY, int endX, int endY) {
    Mobile.swipe(startX, startY, endX, endY, FailureHandling.CONTINUE_ON_FAILURE)
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE) // Delay untuk memastikan animasi selesai
}

// Contoh penggunaan fungsi scroll
int startX = 500 // Koordinat X awal
int startY = 1500 // Koordinat Y awal
int endX = 500 // Koordinat X akhir
int endY = 300 // Koordinat Y akhir

// Panggil fungsi scroll
scrollDown(startX, startY, endX, endY)

// Aksi setelah scroll (contoh tap pada elemen)
Mobile.tap(ObjectRepository.findTestObject('Homepage/Button Lihat Semua Pengumuman'), 0)