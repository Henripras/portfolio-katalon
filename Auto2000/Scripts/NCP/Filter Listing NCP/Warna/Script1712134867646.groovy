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

WebUI.navigateToUrl('https://pre.auto2000.co.id/c/mobil-baru-toyota')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 405)

WebUI.click(findTestObject('NCP/Filter Listing NCP/Warna/Field Warna'))

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Abu Abu'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Abu Abu'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Biru'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Biru'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Cokelat'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Cokelat'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Hijau'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Hijau'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Hitam'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Hitam'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Kuning'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Kuning'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Merah'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Merah'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Oranye'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Oranye'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Putih'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Putih'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Silver'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Silver'))

WebUI.delay(2)

WebUI.check(findTestObject('NCP/Filter Listing NCP/Warna/Ungu'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('NCP/Filter Listing NCP/Warna/Ungu'))

WebUI.delay(2)

