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

WebUI.navigateToUrl('https://pre.auto2000.co.id/mobil-baru-toyota/p/agya/spesifikasi')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Nav Bar Interior'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Tipe Mobil/Pilih Tipe'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Tipe Mobil/Otomatis 1'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Tipe Mobil/Model Manual'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Tipe Mobil/Manual 1'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Tipe Mobil/Button Pilih'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Simulasi Kredit/Button Simulasi Kredit'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Simulasi Kredit/Presentasi Uang Muka'))

WebUI.scrollToElement(findTestObject('NCP/PDP NCP/INTERIOR/Simulasi Kredit/Button Lama Tenor'), 0)

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Simulasi Kredit/Button Lama Tenor'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Simulasi Kredit/Button Hitung Simulasi'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Simulasi Kredit/Close Pop Up'))

WebUI.scrollToPosition(0, 50)

WebUI.delay(2)

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Button Pre Order'))

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(2)

WebUI.doubleClick(findTestObject('NCP/PDP NCP/INTERIOR/Button Unduh Katalog'))

WebUI.closeBrowser()

