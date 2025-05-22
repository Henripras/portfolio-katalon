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

WebUI.navigateToUrl('https://pre.auto2000.co.id/mobil-baru-toyota/p/agya')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Tipe Mobil/Pilih Tipe Mobil'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Tipe Mobil/Otomatis 1'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Tipe Mobil/Transmisi Manual'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Tipe Mobil/Manual 1'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Tipe Mobil/Button Pilih'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 336)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Button Beli Mobil'))

WebUI.back()

WebUI.delay(3)

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Button Simulasi Kredit'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Simulasi Kredit/Slider Presentasi Uang Muka'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Simulasi Kredit/Lama Tenor'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Simulasi Kredit/Button Hitung Simulasi'))

WebUI.delay(3)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Simulasi Kredit/Close Pop Up'))

