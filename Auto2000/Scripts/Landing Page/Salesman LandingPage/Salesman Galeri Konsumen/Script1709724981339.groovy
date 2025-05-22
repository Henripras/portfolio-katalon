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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota')

WebUI.maximizeWindow()

//WebUI.maximizeWindow()
// Get the existing WebDriver instance from Katalon
WebDriver driver = DriverFactory.getWebDriver()

//WebUI.click(findTestObject('Salesman Object/Dealer toyota'))
WebUI.scrollToPosition(0, 244)

WebUI.delay(2)

//WebUI.verifyElementVisible(findTestObject('Location Map'))
WebUI.click(findTestObject('Salesman Object/Cempaka Putih'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 1104)

WebUI.delay(2)

WebUI.click(findTestObject('Salesman Object/span_Lihat Semua'))

WebUI.delay(5)

WebUI.click(findTestObject('Salesman Object/Rizaldi Salesman'))

WebUI.verifyElementVisible(findTestObject('Salesman Object/Mobil Baru Salesman'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('NCP/hover effect/Page_Daftar Harga Mobil Baru Toyota Indones_71eda5/a_LIHAT DETAIL'))

WebUI.click(findTestObject('NCP/hover effect/lihat Detail'))

WebUI.back()

WebUI.scrollToPosition(0, 1418)

WebUI.delay(2)

WebUI.click(findTestObject('Salesman Object/Konten Galsum'))

WebUI.delay(2)

WebUI.click(findTestObject('Salesman Object/close inquiry Galsum'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 3214)

WebUI.click(findTestObject('Salesman Object/video Youtube'))

WebUI.mouseOver(findTestObject('NCP/hover effect/Play Youtube'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Play Youtube'))

WebUI.delay(2)

WebUI.waitForPageLoad(4)

