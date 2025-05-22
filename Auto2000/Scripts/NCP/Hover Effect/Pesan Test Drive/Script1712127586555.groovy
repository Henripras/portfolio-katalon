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

WebUI.click(findTestObject('NCP/hover effect/Test Drive'))

WebUI.scrollToPosition(0, 168)

WebUI.delay(3)

//try {
//if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Ganti Provinsi'), 0)) {
//WebUI.comment('Elemen ini terlihat dan dapat di klik')
//WebUI.click(findTestObject('NCP/hover effect/Ganti Provinsi'), FailureHandling.CONTINUE_ON_FAILURE)
//} else {
//WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
try {
    if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Save Location'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')
		
		WebUI.delay(2)

        WebUI.click(findTestObject('NCP/hover effect/Save Location'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('NCP/hover effect/Close Location'), FailureHandling.OPTIONAL)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

WebUI.delay(3)

WebUI.scrollToPosition(0, 1243)

try {
    if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Save Location'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')
		
		WebUI.delay(2)

        WebUI.click(findTestObject('NCP/hover effect/Save Location'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('NCP/hover effect/Close Location'), FailureHandling.OPTIONAL)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

WebUI.delay(3)

WebUI.setText(findTestObject('NCP/hover effect/full name test drive'), 'ibnu aldi')

//
WebUI.setText(findTestObject('NCP/hover effect/full number test drive'), '81314348387')

//
WebUI.setText(findTestObject('NCP/hover effect/email Test drive'), 'ibnualdi1998@gmail.com')

WebUI.delay(2)

WebUI.scrollToPosition(0, 1392)

WebUI.check(findTestObject('NCP/hover effect/Robot saya setuju'))

WebUI.delay(2)

WebUI.click(findTestObject('NCP/hover effect/Close Term and Condition'))

