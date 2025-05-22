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

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.click(findTestObject('Login/Button Masuk Login'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Pendamping Halal/Homepage/Button Mengerti Pop Up Informasi'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pendamping Halal/Homepage/Menu Sertifikasi'))

WebUI.click(findTestObject('Komite Fatwa/Page Penetapan Status Halal/Button Lihat Detail Penetapan Status Halal'))

WebUI.scrollToElement(findTestObject('Komite Fatwa/Page Penetapan Status Halal/Tetapkan Status Halal'), 3)

WebUI.click(findTestObject('Komite Fatwa/Page Penetapan Status Halal/Tetapkan Status Halal'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Komite Fatwa/Page Penetapan Status Halal/Checkbox Pernyataan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Komite Fatwa/Page Penetapan Status Halal/Button Kirim Pengajuan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

