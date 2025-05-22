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

WebUI.click(findTestObject('CMS/Master Data/Kota Tampilan Konten/Button Master Data'))

WebUI.click(findTestObject('CMS/Master Data/Kota Tampilan Konten/Button Kota Tampilan Konten'))

WebUI.click(findTestObject('CMS/Master Data/Kota Tampilan Konten/Field Provinsi'))

WebUI.click(findTestObject('CMS/Master Data/Kota Tampilan Konten/Dropdown DKI Jakarta'))

WebUI.click(findTestObject('CMS/Master Data/Kota Tampilan Konten/Field Kota'))

WebUI.click(findTestObject('CMS/Master Data/Kota Tampilan Konten/Dropdown Jakarta Pusat'))

WebUI.clearText(findTestObject('CMS/Master Data/Kota Tampilan Konten/Judul Informasi Halaman'))

WebUI.delay(1)

WebUI.setText(findTestObject('CMS/Master Data/Kota Tampilan Konten/Judul Informasi Halaman'), 'Dealer & Bengkel Toyota Jakarta Pusat')

WebUI.clearText(findTestObject('CMS/Master Data/Kota Tampilan Konten/Deskripsi Informasi Halaman'))

WebUI.delay(1)

WebUI.setText(findTestObject('CMS/Master Data/Kota Tampilan Konten/Deskripsi Informasi Halaman'), 'Dealer dan bengkel toyota resmi terdekat di Indonesia. Dapatkan informasi mobil, promo terbaru, layanan servis, alamat, dan jam operasional di sini.')

WebUI.scrollToElement(findTestObject('CMS/Master Data/Kota Tampilan Konten/Deskripsi Informasi Halaman'), 0)

WebUI.clearText(findTestObject('CMS/Master Data/Kota Tampilan Konten/Judul Informasi Promo'))

WebUI.delay(1)

WebUI.setText(findTestObject('CMS/Master Data/Kota Tampilan Konten/Judul Informasi Promo'), 'PROMO AUTO2000 Jakarta Pusat')

WebUI.clearText(findTestObject('CMS/Master Data/Kota Tampilan Konten/Deskripsi Informasi Promo'))

WebUI.delay(1)

WebUI.setText(findTestObject('CMS/Master Data/Kota Tampilan Konten/Deskripsi Informasi Promo'), 'Berikut adalah promo yang berlaku di cabang Auto2000 Jakarta Pusat')

