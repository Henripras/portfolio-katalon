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


WebUI.navigateToUrl('https://pre.auto2000.co.id/berita-dan-tips')

//WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Events/Static Tab (Kategori) dan PLP/Tab_BERITA'))

WebUI.doubleClick(findTestObject('Object Repository/Objek Berita dan Tips/button_Scroll Ke Bawah'))

WebUI.verifyElementVisible(findTestObject('Events/Static Tab (Kategori) dan PLP/Hero Banner'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Events/Static Tab (Kategori) dan PLP/Tab_BERITA'), Keys.chord(Keys.SPACE, Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Events/Minta Penawaran/input_Nama Lengkap_input-full-name'), 'Jennyfer')

WebUI.setText(findTestObject('Object Repository/Events/Minta Penawaran/input_Nomor Handphone_input-phone-number'), '85270980450')

WebUI.scrollToPosition(0, 400)

// Click on elements
WebUI.click(findTestObject('Object Repository/Events/Minta Penawaran/input_Model Mobil_dd-model-mobil'))

//Isi Model Mobil
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Events/Minta Penawaran/Model Mobil'), 30, FailureHandling.OPTIONAL)) {
	// Step 2: If the element exists, click on it
	WebUI.click(findTestObject('Object Repository/Events/Minta Penawaran/Model Mobil'))
	// Add any additional steps you want to perform after clicking the element
} else {
	// Add a failure message or alternative steps if the element does not exist
	WebUI.click(findTestObject('Object Repository/Events/Minta Penawaran/input_Model Mobil_dd-model-mobil'))
	println("Element not found.")
}

WebUI.click(findTestObject('Section inquiry city/Checkbox terms Condition'), FailureHandling.OPTIONAL)

//WebUI.navigateToUrl('https://uat.auto2000.co.id/berita-dan-tips')
//
//WebUI.click(findTestObject('Events/Static Tab (Kategori) dan PLP/Tab_BERITA'))
//
//WebUI.click(findTestObject('Events/Static Tab (Kategori) dan PLP/Card Berita'))
//
//WebUI.verifyElementVisible(findTestObject('Events/PDP/Judul konten PDP'))
//
//WebUI.verifyElementVisible(findTestObject('Events/PDP/Detail Konten PDP'))
//
//WebUI.click(findTestObject('Events/PDP/Lihat semua promo PDP'))
//
//WebUI.navigateToUrl('https://uat.auto2000.co.id/berita-dan-tips/mobil-toyota-avanza')
//
//WebUI.click(findTestObject('Events/PDP/Card konten promo PDP'))
//
//WebUI.navigateToUrl('https://uat.auto2000.co.id/berita-dan-tips/mobil-toyota-avanza')
//
//WebUI.click(findTestObject('Events/PDP/Lihat semua news PDP'))
//
//WebUI.navigateToUrl('https://uat.auto2000.co.id/berita-dan-tips/mobil-toyota-avanza')
//
//WebUI.click(findTestObject('Events/PDP/Card konten news PDP'))
//
//WebUI.navigateToUrl('https://uat.auto2000.co.id/berita-dan-tips/mobil-toyota-avanza')
//WebUI.click(findTestObject('Events/PDP/Logo WA'))
//
//WebUI.click(findTestObject('Events/PDP/Logo FB'))
//
//WebUI.click(findTestObject('Events/PDP/Logo X'))
//
//WebUI.click(findTestObject('Events/PDP/Logo Tiktok'))
//
//WebUI.click(findTestObject('Events/PDP/Logo Link'))

