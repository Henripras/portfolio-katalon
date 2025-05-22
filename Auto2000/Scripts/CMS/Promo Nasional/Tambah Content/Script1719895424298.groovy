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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('uat.auto2000.co.id/cms')

WebUI.setText(findTestObject('CMS/Login CMS/Username'), 'admin.head.office')

WebUI.setText(findTestObject('CMS/Login CMS/Password'), 'Admin.head.office123!')

WebUI.click(findTestObject('CMS/Login CMS/Button Submit'))

WebUI.delay(4)

WebUI.click(findTestObject('CMS/Promo Nasional/Menu Promo'))

WebUI.click(findTestObject('CMS/Promo Nasional/Sub Menu Nasional'))

WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Button Tambah'))

// Memastikan path file tidak mengandung karakter tak terlihat atau tidak valid
WebUI.uploadFile(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Upload Image'), 'D:\\Downloads\\Konten Upload Promo.png')

WebUI.delay(2)

WebUI.setText(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Judul Konten'), 'Promo Serbu Auto2000 Calya')

WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Input Promo Mulai'))

String strStartDate = '16'

String strEndDate = '29'

// Fungsi untuk memilih tanggal pada datepicker
// Tambahkan penundaan jika diperlukan untuk memastikan proses stabil
// Fungsi untuk memilih tanggal promo mulai
selectDate(strStartDate)

// Klik pada field promo berakhir untuk membuka datepicker
WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Input Promo Berakhir'))

// Tunggu sampai datepicker muncul
WebUI.delay(2)

// Memilih tanggal promo berakhir
selectDate(strEndDate)

WebUI.scrollToElement(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Scroll To Detail'), 
    0)

WebUI.setText(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Detail Promo'), 'Mulai perjalanan mu bersama Toyota Calya, Kini makin untung dengan SERBU Auto2000 loh! kamu bisa mendapatkan kesempatan untuk memenangkan Hadiah 5 unit Toyota Raize 1.2 G CVT & 500 unit sepeda motor Honda BeAT CBS untuk setiap pembelian mobil di Auto2000.')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Scroll To Category'), 
    0)

// Pilih Kategori
String kategori = 'MOBIL BARU'

// Klik pada field dropdown kategori untuk membuka dropdown
WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Field Kategori'))

// Tunggu sampai dropdown muncul
WebUI.delay(1)

// Buat TestObject dinamis untuk memilih kategori
TestObject kategoriToSelect = new TestObject()

kategoriToSelect.addProperty('xpath', ConditionType.EQUALS, ('//div[@class="dropdown-menu"]//a[text()="' + kategori) + '"]')

// Klik pada kategori yang diinginkan
WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Isi Kategori'))

WebUI.delay(2)

WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Field Produk'))

WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Isi Produk - 1'))

WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Isi Produk - 2'))

WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Isi Produk - 3'))

WebUI.delay(3)

WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Button Terbitkan'))

WebUI.click(findTestObject('CMS/Promo Nasional/Tambah Konten/Field CMS Tambah Content Promo/Button YA'))

WebUI.delay(3)

def selectDate(String strDate) {
    TestObject dateToSelect = new TestObject()

    dateToSelect.addProperty('xpath', ConditionType.EQUALS, ('//div[contains(@class, \'react-datepicker__day\') and not(contains(@class, \'react-datepicker__day--outside-month\')) and text()=\'' + 
        strDate) + '\']')

    WebUI.click(dateToSelect)

    WebUI.delay(1)
}

