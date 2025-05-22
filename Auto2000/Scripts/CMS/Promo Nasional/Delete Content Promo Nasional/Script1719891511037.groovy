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

WebUI.navigateToUrl('sit.auto2000.co.id/cms')

WebUI.setText(findTestObject('CMS/Login CMS/Username'), 'admin')

WebUI.setText(findTestObject('CMS/Login CMS/Password'), 'admin')

//WebUI.delay(6)
WebUI.click(findTestObject('CMS/Login CMS/Button Submit'))

WebUI.delay(4)

WebUI.click(findTestObject('CMS/Promo Nasional/Menu Promo'))

WebUI.delay(1)

WebUI.click(findTestObject('CMS/Promo Nasional/Sub Menu Nasional'))

int maxLoops = 1000

for (int i = 0; i < maxLoops; i++) {
    // Klik Button Action
    WebUI.click(findTestObject('CMS/Promo Nasional/Button Action'))

    // Klik Button Delete
    WebUI.click(findTestObject('CMS/Promo Nasional/Button Delete'))

    // Tunggu elemen Button Ya Delete muncul
    WebUI.waitForElementVisible(findTestObject('CMS/Promo Nasional/Button Ya Delete'), 10)

    // Klik Button Ya Delete
    WebUI.click(findTestObject('CMS/Promo Nasional/Button Ya Delete'))

    // Tunggu beberapa detik sebelum mengulangi tindakan
    WebUI.delay(1)
}

