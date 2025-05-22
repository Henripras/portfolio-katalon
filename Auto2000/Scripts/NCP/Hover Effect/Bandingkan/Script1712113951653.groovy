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

WebUI.click(findTestObject('NCP/hover effect/Bandingkan'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Add Mobil'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Data Hatchback'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Data Hybrid'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Data MPV'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Data SUV'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Data Sedan'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Data Sports'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/All Tipe'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Pilih Mobil'))

WebUI.click(findTestObject('NCP/hover effect/Radio Button'))

WebUI.click(findTestObject('NCP/hover effect/Pilih Variant'))

WebUI.scrollToPosition(0, 102)

WebUI.click(findTestObject('NCP/hover effect/DIMENSI'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/CHASSIS'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/MESIN'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/FITUR KEAMANAN'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/FITUR KENYAMANAN'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/LAINNYA'))

WebUI.delay(2)

