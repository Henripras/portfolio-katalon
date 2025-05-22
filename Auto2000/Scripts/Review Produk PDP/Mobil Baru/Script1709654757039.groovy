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

WebUI.navigateToUrl('https://pre.auto2000.co.id/review-produk/lihat-lebih-detail-mesin-listrik-bz4x--duplikat-1')

//WebUI.maximizeWindow()
WebUI.scrollToPosition(0, 400)

WebUI.delay(10)

WebUI.click(findTestObject('Object Review Produk/CardButtonPenawaran'))

WebUI.delay(2)

if (true) {
    WebUI.verifyElementPresent(findTestObject('modalHeader'), 8, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('closemodalHeader'), FailureHandling.OPTIONAL)

    WebUI.scrollToPosition(0, 400)
} else {
    WebUI.scrollToPosition(0, 400)
}

WebUI.setText(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/input_Nama Lengkap_input-full-name'), 
    'Testing')

WebUI.setText(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/input_Nomor Handphone_input-phone-number'), 
    '89673761949')

WebUI.click(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/input_Provinsi_product-dd-province'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/Jakarta'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/input_Kota_product-dd-city'))

WebUI.click(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/Jakpus'))

WebUI.click(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/Checkbox'))

//
//WebUI.click(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/button_Submit'))
//
//WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/Inquiry Form/Page_Review Lengkap TSS pada All New Avanza  Auto 2000/Pop Up OTP'))
WebUI.click(findTestObject('Object Review Produk/Review Produk/Inquiry Form/X'))

WebUI.click(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Button Share'))

//WebUI.verifyElementVisible(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Pop Up Bagikan'))
WebUI.click(findTestObject('Object Review Produk/Review Produk/PDP Review Produk/Mobil Baru/Icon X'))

