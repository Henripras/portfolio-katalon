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

WebUI.click(findTestObject('CMS/Login CMS/Button Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Search FAQ/Button Listing Kupon Servis'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Search FAQ/Button Detail FAQ'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/Button Edit 3'))

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Field Pertanyaan FAQ'), 'Test Edit')

WebUI.delay(1)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Field Jawaban FAQ'), 'test Edit')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Button Listing Produk Tambah FAQ'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/Field Kategori Mobil Edit'))

WebUI.delay(2)

//WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/Dropdown Kategori mobil SUV'))
//WebUI.delay(2)
if (WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/MPV 2'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/MPV 2'))

    WebUI.delay(2)
} else {
    WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/MPV 1'))
}

WebUI.delay(2)

if (WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Field Model mobil'), 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Field Model mobil'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/Dropdown Vellfire'))

    WebUI.delay(2)
} else {
    println('Dropdown Tidak Ada')
}

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Button Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/Button Edit 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/Button Log Activity'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Search FAQ/Button Listing Kupon Servis'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Search FAQ/Button Detail FAQ'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Edit FAQ/Button Edit 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Filter FAQ/Button Close PopUp'))

WebUI.delay(2)

