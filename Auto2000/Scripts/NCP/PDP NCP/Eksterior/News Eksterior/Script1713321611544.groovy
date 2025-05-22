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

WebUI.navigateToUrl('https://uat.auto2000.co.id/mobil-baru-toyota/p/agya/eksterior')

WebUI.waitForPageLoad(2)

WebUI.scrollToPosition(0, 2537)

WebUI.click(findTestObject('NCP/PDP NCP/EKSTERIOR/News/Lihat Semua News'))

WebUI.waitForPageLoad(2)

WebUI.doubleClick(findTestObject('NCP/PDP NCP/INTERIOR/News/Listing News/Scroll Ke Bawah'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/News/Listing News/Konten Card'))

WebUI.scrollToPosition(0, 229)

WebUI.setText(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Nama Lengkap'), '1234')

WebUI.verifyTextPresent('Hanya boleh diisi dengan huruf', false)

WebUI.setText(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/No Hp'), '748363')

WebUI.verifyTextPresent('Mohon Masukkan Nomor Handphone Yang Valid', false)

WebUI.clearText(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Nama Lengkap'))

WebUI.clearText(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/No Hp'))

WebUI.setText(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Nama Lengkap'), 'Lutfi ')

WebUI.setText(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/No Hp'), '81275379260')

WebUI.scrollToPosition(0, 429)

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Model Mobil'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Isi Model Mobil'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Checkbox'))

WebUI.scrollToPosition(0, 1829)

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Share Whatsapp'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Share Facebook'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Share X'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Share Tiktok'))

WebUI.click(findTestObject('NCP/PDP NCP/INTERIOR/Promo/Detail Card/Share Link'))

WebUI.closeBrowser()

