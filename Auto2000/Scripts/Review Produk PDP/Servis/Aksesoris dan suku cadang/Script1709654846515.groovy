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

WebUI.navigateToUrl('https://pre.auto2000.co.id/review-produk/keunggulan-produk-car-cover-yang-tersedia-di-auto2000-digiroom%20pras%20test')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Servis/Aksesoris dan suku cadang/Offering Card'))

WebUI.scrollToPosition(0, 445)

WebUI.click(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Servis/Aksesoris dan suku cadang/OffCard/button_LIHAT AKSESORIS LAINNYA'))

WebUI.back()

WebUI.scrollToPosition(0, 2116)

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Section Promo Lainnya'))

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Section Bagikan'))

WebUI.scrollToPosition(0, 2813)

WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/Footer/Footer'))

WebUI.closeBrowser()

