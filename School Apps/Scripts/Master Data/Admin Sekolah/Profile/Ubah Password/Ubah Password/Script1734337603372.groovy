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

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.delay(1)

WebUI.delay(2)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Klik Profile'))

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Password/Klik Ubah Password'))

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Password/Klik Password Lama'))

WebUI.delay(2)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Password/Klik Password Lama'), 'Test1234')

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Password/Klik Password Baru'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Password/Klik Password Baru'), 'Test12345')

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Password/Ulangi Password Baru'))

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Password/Ulangi Password Baru'), 'Test12345')

WebUI.delay(1)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Profile/Ubah Password/Tombol X'))

