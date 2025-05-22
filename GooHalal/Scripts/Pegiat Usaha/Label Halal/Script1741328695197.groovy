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

WebUI.navigateToUrl('https://goohalal.ihtekno.tech/login')

WebUI.click(findTestObject('Login/Field Dropdown Masuk Sebagai'))

WebUI.click(findTestObject('Login/Value Dropdown Pegiat Usaha'))

WebUI.click(findTestObject('Login/Button Konfirmasi Masuk Sebagai'))

WebUI.click(findTestObject('Login/Button Masuk To Login Page'))

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.setText(findTestObject('Login/Field Email Login'), '0895360988041')

WebUI.click(findTestObject('Login/Field Password Login'))

WebUI.setText(findTestObject('Login/Field Password Login'), '123456')

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.click(findTestObject('Login/Button Masuk Login'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Pegiat Usaha/Homepage/Checkbox Autentikasi Akun'))

WebUI.click(findTestObject('Pegiat Usaha/Homepage/Button Lanjutkan Autentikasi Akun'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Guide Selesai'))

WebUI.click(findTestObject('Pegiat Usaha/Homepage/Menu Label Halal'))

WebUI.click(findTestObject('Pegiat Usaha/Homepage/Sub Menu Pedoman Label Halal'))

WebUI.click(findTestObject('Pegiat Usaha/Homepage/Sub Menu Label Halal Utama'))

WebUI.click(findTestObject('Pegiat Usaha/Homepage/Sub Menu Label Halal Sekunder'))

WebUI.delay(3)

def clickWithTimeout(Optional<Integer> timeout = Optional.of(3000)) {
    try {
        if (timeout.isPresent()) {
            WebUI.delay(timeout.get() / 1000)
        }
        
        WebUI.click(findTestObject('Existing To Sihalal/Pop Up Chrome Later Subscription'))
    }
    catch (Exception e) {
        println("Error: $e.message")
    } 
}

