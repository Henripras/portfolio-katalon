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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.CONTINUE_ON_FAILURE)

// Login
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Menu User Management'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Button Tambah'))

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Dropdown Role'))

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Orang Tua atau Siswa'))

int minDigits = 5

int maxDigits = 5

int randomLength = ((Math.random() * ((maxDigits - minDigits) + 1)) as int) + minDigits

String randomNumber = String.format(('%0' + randomLength) + 'd', ((Math.random() * Math.pow(10, randomLength)) as int))

// Klik pada field Kode Tagihan
WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Username'))

WebUI.setText(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Username'), randomNumber)

int min = 1000000 // Batas minimum

int max = 15000000 // Batas maksimum

int randomNumber1 = (((Math.random() * (max - min)) + min) as int)

// Generate email random
String emailPrefix = 'user' + randomNumber1

String emailDomain = '@testmail.com'

String randomEmail = emailPrefix + emailDomain

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Email'))

WebUI.setText(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Email'), randomEmail)

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Button Simpan'))

