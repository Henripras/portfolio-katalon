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

WebUI.navigateToUrl('https://pre.auto2000.co.id/review-produk/keunggulan-antikarat-avanza')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Servis/Kupon Servis/Offering card kupon servis'))

WebUI.scrollToPosition(0, 445)

WebUI.click(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Servis/Kupon Servis/Page_Apa Itu KUPON SERVIS Yuk Kita Review  Auto 2000/button_LIHAT KUPON SERVIS LAINNYA'))

WebUI.back()

WebUI.scrollToPosition(0, 445)

WebUI.click(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Button Share'))

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Pop Up Bagikan'))

WebUI.click(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Icon X'))

WebUI.scrollToPosition(0, 2116)

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Section Promo Lainnya'))

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Section Bagikan'))

WebUI.scrollToPosition(0, 2813)

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/Footer/Footer'))

WebUI.closeBrowser()

