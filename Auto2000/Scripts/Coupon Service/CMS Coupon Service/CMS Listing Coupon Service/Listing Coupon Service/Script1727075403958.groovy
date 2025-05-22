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

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Menu Kupon Servis'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Menu Listing Produk'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 563)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Hapus Banner'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Tambah Banner'))

WebUI.delay(2)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Close Pilih Promo'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Tambah Banner'))

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Search Banner'), 'Promo')

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Daftar Promo'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Menampilkan'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Menampilkan 10'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Menampilkan'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Menampilkan 15'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Pilih Promo'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Button Tambahkan'))

WebUI.scrollToElement(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Tambah Banner'), 0)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Link Banner'), '123!@#')

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Link Banner'), 'https://sit.auto2000.co.id/kupon-service/p/agya')

WebUI.scrollToElement(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Link Banner'), 0)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Judul Informasi Halaman'), 'Kupon Servis Toyota Atas')

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Deskripsi Informasi Halaman'), 
    'Kenapa harus pakai KUPON SERVIS TOYOTA? Karena kondisi mobil berbagai jenis dapat selalu terjaga dengan cara yang praktis dan ekonomis! Test')

WebUI.scrollToElement(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Deskripsi Informasi Halaman'), 
    0)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Judul Informasi Bawah'), 'Kupon Servis Toyota Bawah')

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Deskripsi Informasi Bawah'), 
    'Kami menyediakan Kupon Servis untuk perawatan mobil Toyota yang lebih praktis dan ekonomis. Tersedia juga Kupon Ganti Oli yang memastikan mesin mobil Toyota beragam model dan jenis selalu prima. Segera pilih Kupon yang cocok untuk kebutuhan mobil Anda.Kenapa harus pakai KUPON SERVIS TOYOTA? Karena kondisi mobil berbagai jenis dapat selalu terjaga dengan cara yang praktis dan ekonomis! Test')

WebUI.scrollToElement(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Deskripsi Informasi Bawah'), 
    0)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/FAQ'), 'FAQ KUPON SERVIS TOYOTA Test')

WebUI.scrollToElement(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/FAQ'), 0)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Slider SEO'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Slider SEO'))

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Title Tag'), 'Kupon Servis untuk setiap Model Mobil pada Tahun 2024 Test')

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Kata Kunci'), 'Kupon Servis Test')

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Robot Tag'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Robot Tag Noarchive'))

WebUI.delay(2)

//WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Robot Tag'))

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Robot Tag Noarchive'))

WebUI.delay(2)

WebUI.setText(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Field Meta Description'), 'Kupon servis untuk setiap model mobil pada tahun 2024 Test')

WebUI.delay(5)

WebUI.click(findTestObject('Coupon Service/CMS Coupon Service/CMS Listing Coupon Service/Button Terbitkan'))

