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

WebUI.navigateToUrl('https://pre.auto2000.co.id/mobil-baru-toyota/p/agya/interior')

WebUI.waitForPageLoad(2)

WebUI.scrollToElement(findTestObject('NCP/PDP NCP/INTERIOR/Navigasi/Scroll Position'), 0)

WebUI.click(findTestObject('NCP/PDP NCP/SPESIFIKASI/Navigasi/Button Next'))

WebUI.delay(5)

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('NCP/PDP NCP/INTERIOR/Navigasi/Scroll Position'), 0)

WebUI.click(findTestObject('NCP/PDP NCP/SPESIFIKASI/Navigasi/Button Prev'))

WebUI.closeBrowser()

