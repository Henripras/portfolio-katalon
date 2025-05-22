import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import java.util.Random
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

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/HomePageMenu/Sidebar Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/HomePageMenu/Sub Menu Kelas'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Tambah Kelas'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Modal Tambah/Unit/Pilih Unit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Modal Tambah/Unit/Klik Unit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Modal Tambah/Prefix/Klik Prefix'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Modal Tambah/Prefix/Pilih Prefix'), FailureHandling.CONTINUE_ON_FAILURE)

// Generate data random untuk suffix kelas
String[] suffixes = ['PHP', 'JAVA', 'PYTHON', 'C++', 'JS'] // List possible suffixes
int randomIndex = new Random().nextInt(suffixes.length) // Generate random index
int randomNumber = new Random().nextInt(10) + 1 // Generate random number between 1-10

String randomSuffix = suffixes[randomIndex] + " " + randomNumber // Combine suffix and random number

// Set random suffix ke input field
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Modal Tambah/Suffix/Input Suffix kelas'), randomSuffix, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Modal Tambah/Jurusan/Klik Jurusan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Modal Tambah/Jurusan/Pilih Jurusan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tambah Kelas/Modal Tambah/Tambahkan/Tambah Data'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

