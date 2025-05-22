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

WebUI.openBrowser('', FailureHandling.OPTIONAL)

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Page_Beranda/Menu Pengaturan sistem'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Page_Pengaturan Sistem - Pengaturan Sistem/Menu Informasi Sekolah'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/NPSN (Nomor Pokok Sekolah Nasional)/input_Edit Sekolah_npsn'), 
    FailureHandling.OPTIONAL)

WebUI.executeJavaScript('document.querySelector(\'input[name="npsn"]\').value=\'\'', null, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/NPSN (Nomor Pokok Sekolah Nasional)/input_Edit Sekolah_npsn'), 
    '20025002', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Nama Sekolah/input_Edit Sekolah_schoolName'), 
    FailureHandling.OPTIONAL)

WebUI.executeJavaScript('document.querySelector(\'input[name="schoolName"]\').value=\'\'', null, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Pengaturan Sistem/Admin Sekolah/Nama Sekolah/input_Edit Sekolah_schoolName'), 'PT Aigen Global Teknologi', 
    FailureHandling.OPTIONAL)

// Provinsi 
WebUI.click(findTestObject('Pengaturan Sistem/Admin Sekolah/Dropdown_Provinsi/dropdown_provinsi'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pengaturan Sistem/Admin Sekolah/Isi_Provinsi/p_BANTEN'), FailureHandling.OPTIONAL)

// Provinsi
WebUI.click(findTestObject('Pengaturan Sistem/Admin Sekolah/Dropdown_Kota/dropdown_kota'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pengaturan Sistem/Admin Sekolah/Isi_Kota/p_KOTA TANGERANG SELATAN'), FailureHandling.OPTIONAL)

// Alamat
WebUI.click(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Alamat Sekolah/TextArea Alamat sekolah'), 
    FailureHandling.OPTIONAL)

// Menghapus isi field textarea menggunakan JavaScript
WebUI.executeJavaScript('document.querySelector(\'textarea[name="schoolAddress"]\').value=\'\'', null, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Alamat Sekolah/TextArea Alamat sekolah'), 
    'Jl. Raya Rawa Buntu No 18D', FailureHandling.OPTIONAL)

// PhoneNumber
WebUI.click(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Phone/input_Edit Sekolah_schoolPhone'), FailureHandling.OPTIONAL)

WebUI.executeJavaScript('document.querySelector(\'input[name="schoolPhone"]\').value=\'\'', null, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Phone/input_Edit Sekolah_schoolPhone'), 
    '081332924555', FailureHandling.OPTIONAL)

// Email
WebUI.click(findTestObject('Pengaturan Sistem/Admin Sekolah/Email/input_Edit Sekolah_schoolMail'), FailureHandling.OPTIONAL)

WebUI.executeJavaScript('document.querySelector(\'input[name="schoolMail"]\').value=\'\'', null, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Pengaturan Sistem/Admin Sekolah/Email/input_Edit Sekolah_schoolMail'), 'reach.us@aigen-global.com', 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pengaturan Sistem/Admin Sekolah/Email/input_Edit Sekolah_schoolMail'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

// File Upload logo
// untuk menampilkan elment input file yang tersembunyi
WebUI.executeJavaScript('document.querySelector("input[type=\'file\']").style.display = "block";', null, FailureHandling.OPTIONAL)

// Tunggu beberapa detik agar elemen dapat diakses
WebUI.delay(2, FailureHandling.OPTIONAL)

// Mengunggah file menggunakan WebUI.uploadFile ke input file yang tersembunyi
String filePath = 'C:\\Users\\Khairul Pandunata\\Desktop\\Aigen_Logo.jpeg'

WebUI.uploadFile(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Page_Upload/Input_UnggahFile'), filePath, 
    FailureHandling.OPTIONAL)

// File Upload Kop Surat
// untuk menampilkan elment input file yang tersembunyi
WebUI.executeJavaScript('document.querySelector("input[type=\'file\']").style.display = "block";', null, FailureHandling.OPTIONAL)

// Tunggu beberapa detik agar elemen dapat diakses
WebUI.delay(2, FailureHandling.OPTIONAL)

// Mengunggah file menggunakan WebUI.uploadFile ke input file yang tersembunyi
String filePathKop = 'C:\\Users\\Khairul Pandunata\\Desktop\\Aigen_Kop.png'

WebUI.uploadFile(findTestObject('Object Repository/Pengaturan Sistem/Admin Sekolah/Page_Upload_Kop/Input_UnggahFileKop'), 
    filePathKop, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pengaturan Sistem/Admin Sekolah/button_simpan/button_Simpan'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pengaturan Sistem/Admin Sekolah/Button_konfirm/div_Ya'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

