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

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Klik Profile'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Foto Profile/Klik Menu Ubah Foto Profile'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

String fotoFilePath = 'C:/Users/akmal/Downloads/admin.png'

// Klik tombol "Unggah File" untuk membuka dialog upload
WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Foto Profile/Klik Unggah File'), FailureHandling.OPTIONAL)

// Delay untuk memastikan elemen input file tersedia
WebUI.delay(2, FailureHandling.OPTIONAL)

// Upload file menggunakan TestObject elemen input file
WebUI.uploadFile(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Foto Profile/Unggah File'), fotoFilePath, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Foto Profile/Terapkan'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

