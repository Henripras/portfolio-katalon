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

WebUI.navigateToUrl('https://uat.auto2000.co.id/mobil-baru-toyota/p/agya/eksterior')

WebUI.waitForPageLoad(2)

WebUI.scrollToPosition(0, 814)

WebUI.mouseOver(findTestObject('NCP/PDP NCP/EKSTERIOR/Eksterior/Gambar 1'))

WebUI.mouseOver(findTestObject('NCP/PDP NCP/EKSTERIOR/Eksterior/Gambar 2'))

WebUI.scrollToPosition(0, 1148)

WebUI.mouseOver(findTestObject('NCP/PDP NCP/EKSTERIOR/Eksterior/Gambar 3'))

WebUI.mouseOver(findTestObject('NCP/PDP NCP/EKSTERIOR/Eksterior/Gambar 4'))

WebUI.scrollToPosition(0, 1482)

WebUI.mouseOver(findTestObject('NCP/PDP NCP/EKSTERIOR/Eksterior/Gambar 5'))

WebUI.mouseOver(findTestObject('NCP/PDP NCP/EKSTERIOR/Eksterior/Gambar 6'))

WebUI.delay(2)

WebUI.closeBrowser()

