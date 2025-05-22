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

WebUI.navigateToUrl('https://pre.auto2000.co.id/mobil-baru-toyota/p/agya')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Hover Footer/Minta Penawaran'))

WebUI.delay(3)

//WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/Hover Footer/Minta Penawaran Hover/Nama Lengkap'), 'Ilham Samarudin')

WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/Hover Footer/Minta Penawaran Hover/Nomor Hp'), '81254314132')

WebUI.verifyElementVisible(findTestObject('NCP/PDP NCP/OVERVIEW/Hover Footer/Minta Penawaran Hover/Provinsi'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('NCP/PDP NCP/OVERVIEW/Hover Footer/Minta Penawaran Hover/Kota'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Hover Footer/Minta Penawaran Hover/Checkbox'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Hover Footer/Minta Penawaran Hover/Close Minta Penawaran'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Hover Footer/Hubungi Kami'))

WebUI.waitForPageLoad(2)

