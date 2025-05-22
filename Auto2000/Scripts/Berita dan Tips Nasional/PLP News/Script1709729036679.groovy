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

//WebUI.openBrowser('')

WebUI.navigateToUrl('https://pre.auto2000.co.id/berita-dan-tips')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Objek Berita dan Tips/Page_Berita  Tips Toyota 2024 Terbaru/h3_Apakah Berita dan Artikel otomotif mobil_89d74e'))

WebUI.click(findTestObject('Object Repository/Objek Berita dan Tips/Page_Berita  Tips Toyota 2024 Terbaru/h3_Apakah Berita dan Artikel otomotif mobil_89d74e'))

WebUI.click(findTestObject('Object Repository/Objek Berita dan Tips/Page_Berita  Tips Toyota 2024 Terbaru/a_BERITA'))

WebUI.click(findTestObject('Object Repository/Objek Berita dan Tips/Page_Berita  Tips Toyota 2024 Terbaru/a_REVIEW'))

WebUI.click(findTestObject('Object Repository/Objek Berita dan Tips/Page_/a_TIPS DAN TRIK'))

WebUI.click(findTestObject('Object Repository/Objek Berita dan Tips/Page_/a_EVENT'))

WebUI.click(findTestObject('Object Repository/Objek Berita dan Tips/Page_Berita  Tips Toyota 2024 Terbaru/a_SEMUA'))

WebUI.scrollToElement(findTestObject('Object Review Produk/Review Produk/Footer/Footer'), 0)

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/Footer/Footer'))

WebUI.closeBrowser()

