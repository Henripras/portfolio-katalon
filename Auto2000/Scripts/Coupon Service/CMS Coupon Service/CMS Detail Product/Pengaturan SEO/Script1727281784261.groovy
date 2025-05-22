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

WebUI.delay(4)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Kupon Service'))

WebUI.delay(4)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Detail Product'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Create'))

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Pengaturan SEO'))

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Pop up Yes'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Pengaturan kupon SEO'))

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Dropdown SEO'))

if (WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Field Model mobil'), 
    FailureHandling.OPTIONAL)) {
    WebUI.delay(2)

    WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Cuopon Pengaturan SEO'))

    WebUI.delay(2)
} else {
    println('Cuopon tidak ada')
}

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Title tag SEO'))

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Title tag SEO'), 'Mobil Toyota terbaru 2024')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Meta Deskripsi SEO'))

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Meta Deskripsi SEO'), 'Kami menyediakan Kupon Servis untuk perawatan mobil Toyota yang lebih praktis dan ekonomis. Tersedia juga Kupon Ganti Oli yang memastikan mesin mobil Toyota beragam model dan jenis selalu prima. Segera pilih Kupon yang cocok untuk kebutuhan mobil Anda. ')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Robot Tag SEO'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Button Dropdown Robot tag Seo'))

if (WebUI.verifyElementVisible(findTestObject('Coupon Service/CMS Coupon Service/CMS FAQ/Tambah FAQ/Dropdown Field Model mobil'), 
    FailureHandling.OPTIONAL)) {
    WebUI.delay(2)

    WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Robot Tag Index'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Detail Product/Robot Tag Follow'))

    WebUI.delay(2)
} else {
    println('Robot tag tidak ada')
}

WebUI.delay(5)

