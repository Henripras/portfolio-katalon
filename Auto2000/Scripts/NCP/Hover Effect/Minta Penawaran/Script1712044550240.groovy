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

WebUI.navigateToUrl('https://pre.auto2000.co.id/c/mobil-baru-toyota')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.scrollToPosition(0, 197)

WebUI.mouseOver(findTestObject('Object Repository/NCP/hover effect/Page_Daftar Harga Mobil Baru Toyota Indones_71eda5/a_LIHAT DETAIL'))

WebUI.click(findTestObject('NCP/hover effect/Minta Penawaran'))

WebUI.delay(2)

WebUI.setText(findTestObject('NCP/hover effect/Nama Customer'), 'ibnu aldi')

WebUI.setText(findTestObject('NCP/hover effect/Nomer Customer'), '81314348387')

//WebUI.click(findTestObject('NCP/hover effect/Provinsi'))
WebUI.verifyElementVisible(findTestObject('NCP/hover effect/Nama Provinsi'))

//WebUI.click(findTestObject('NCP/hover effect/City'))
WebUI.verifyElementVisible(findTestObject('NCP/hover effect/Nama City'))

WebUI.click(findTestObject('NCP/hover effect/Robot Coba syarat'))

WebUI.click(findTestObject('NCP/hover effect/Robot Close Penawaran'))

