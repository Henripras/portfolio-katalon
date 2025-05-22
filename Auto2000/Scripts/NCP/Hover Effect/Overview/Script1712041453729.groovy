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

//WebUI.mouseOver(findTestObject('null'))
WebUI.click(findTestObject('NCP/hover effect/lihat Detail'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 417)

WebUI.click(findTestObject('NCP/hover effect/Beli Mobil'))

WebUI.setText(findTestObject('NCP/hover effect/Number Order online'), '81934158282')

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/dropdown tipe'))

WebUI.delay(4)

WebUI.click(findTestObject('NCP/hover effect/button tipe Manual'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Close Tipe Mobil'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 450)

WebUI.click(findTestObject('NCP/hover effect/Simulasi Kredit'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Slider Minta penawaran'))

WebUI.click(findTestObject('NCP/hover effect/Hitung Simulasi'))

WebUI.click(findTestObject('NCP/hover effect/close simulasi kredit'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

//WebUI.navigateToUrl('https://uat.auto2000.co.id/mobil-baru-toyota/p/agya')
WebUI.click(findTestObject('NCP/hover effect/Spesifikasi'))

//WebUI.delay(2)
//WebUI.click(findTestObject('NCP/hover effect/Unduh Katalog'))
WebUI.delay(2)

//WebUI.switchToWindowUrl('https://uat.auto2000.co.id/mobil-baru-toyota/p/agya/spesifikasi')
WebUI.click(findTestObject('NCP/hover effect/Interior'))

WebUI.scrollToPosition(0, 1245)

WebUI.scrollToPosition(0, 1812)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Eksterior'))

WebUI.scrollToPosition(0, 1121)

WebUI.scrollToPosition(0, 1910)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Button Lainnya'))

WebUI.click(findTestObject('NCP/hover effect/Filter Tipe'))

WebUI.delay(5)

WebUI.click(findTestObject('NCP/hover effect/Button Lainnya'))

WebUI.click(findTestObject('NCP/hover effect/Filter Warna'))

WebUI.delay(5)

WebUI.click(findTestObject('NCP/hover effect/Button Lainnya'))

WebUI.click(findTestObject('NCP/hover effect/Filter Kredit'))

WebUI.delay(5)

WebUI.click(findTestObject('NCP/hover effect/Button Lainnya'))

WebUI.click(findTestObject('NCP/hover effect/Filter Ulasan'))

WebUI.delay(5)

WebUI.click(findTestObject('NCP/hover effect/Button Lainnya'))

WebUI.scrollToPosition(0, 563)

WebUI.click(findTestObject('NCP/hover effect/Filter Galeri'))

WebUI.delay(5)

WebUI.click(findTestObject('NCP/hover effect/Button Lainnya'))

WebUI.scrollToPosition(0, 563)

WebUI.click(findTestObject('NCP/hover effect/Filter Video'))

WebUI.delay(5)

WebUI.click(findTestObject('NCP/hover effect/Overview'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 450)

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Unduh Katalog'))

WebUI.delay(5)

