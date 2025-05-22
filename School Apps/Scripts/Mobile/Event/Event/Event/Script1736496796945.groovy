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

Mobile.startApplication('C:\\Users\\akmal\\Downloads\\app-sit-debug (4).apk', false)

Mobile.tap(findTestObject('Mobile/Landing Page Mobile/Tombol Lanjut Landing Page'), 0)

Mobile.tap(findTestObject('Mobile/Landing Page Mobile/Tombol Lanjut Landing Page'), 0)

Mobile.tap(findTestObject('Mobile/Landing Page Mobile/Tombol Lanjut Landing Page'), 0)

Mobile.tap(findTestObject('Mobile/Landing Page Mobile/Dropdown Pilih Sekolah'), 0)

Mobile.tap(findTestObject('Mobile/Landing Page Mobile/Value Dropdown Sekolah'), 0)

Mobile.tap(findTestObject('Mobile/Landing Page Mobile/Tombol Lanjut'), 0)

Mobile.tap(findTestObject('Mobile/Login/Kolom Email'), 0)

Mobile.setText(findTestObject('Mobile/Login/Kolom Email'), 'akmalalhaqi123@gmail.com', 0)

'manual\r\n'
Mobile.tap(findTestObject('Mobile/Login/check Pass'), 0, FailureHandling.STOP_ON_FAILURE)

'manual'
Mobile.setText(findTestObject('Mobile/Login/check Pass'), 'Test12345', 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Login/Tombol Masuk'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Event dan Pengumuman/Event/Event Button'), 0)

Mobile.tap(findTestObject('Mobile/Event dan Pengumuman/Event/Card event'), 0)

Mobile.tap(findTestObject('Mobile/Event dan Pengumuman/Event/Arrow Button'), 0)

