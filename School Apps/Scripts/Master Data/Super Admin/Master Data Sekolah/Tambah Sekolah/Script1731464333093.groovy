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
import com.kms.katalon.core.testobject.ObjectRepository as OR

WebUI.openBrowser('', FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin@gmail.com', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Homepage Menu/Sidebar Menu'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Homepage Menu/Sub Menu Sekolah'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Master Sekolah Dashboard/Button Tambah'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

// Function to fill out the form with different data
// Set NPSN field
// Set Telephone field
// Set Nama Sekolah field
// Set Email field
// List of different data to be filled out in the form
// Fungsi untuk menghasilkan NPSN acak dengan maksimal 10 angka
// Fungsi untuk menghasilkan nama sekolah acak
// Fungsi untuk menghasilkan nomor HP acak
// Fungsi untuk menghasilkan email berdasarkan nama sekolah
// Hapus spasi
// List data sekolah
List<Map> sekolahDataList = [[('NPSN') : generateRandomNPSN(), ('Telephone') : generateRandomNomorHP(), ('NamaSekolah') : generateRandomNamaSekolah()
        , ('Email') : generateRandomEmail(generateRandomNamaSekolah())]]

// Fungsi untuk menghasilkan NPSN acak dengan maksimal 10 angka
// Loop through each data entry and fill the form
for (Map sekolahData : sekolahDataList) {
    fillFormWithData(sekolahData)

    // Optional: Add a delay before the next iteration
    WebUI.delay(1)
}

WebUI.scrollToElement(findTestObject('Master Data/Super Admin/Form Sekolah/Field Email'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Form Sekolah/Dropdown Unit'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Form Sekolah/Isi Dropdown Unit'), FailureHandling.OPTIONAL)

List<Map> logoFilePaths = ['C:\\Users\\henri\\Pictures\\Upload Sekolah\\Logo Sekolah.png']

// Loop through each file path and upload the respective logo
for (String logoFilePath : logoFilePaths) {
    uploadLogo(logoFilePath)

    // Optional: Add a delay before the next iteration to simulate a realistic upload flow
    WebUI.delay(1)
}

// Inisialisasi lokasi file untuk kop surat
String kopSuratFilePath = 'C:/Users/henri/Pictures/Upload Sekolah/Upload Kop Surat.png'

// Klik pada label untuk membuka dialog upload kop surat
WebUI.click(findTestObject('Master Data/Super Admin/Form Sekolah/Button Upload Kop Surat'), FailureHandling.OPTIONAL)

// Tunggu sebentar agar elemen input file muncul
WebUI.delay(5, FailureHandling.OPTIONAL)

// Upload file kop surat ke elemen input file yang tersembunyi
WebUI.uploadFile(findTestObject('Master Data/Super Admin/Form Sekolah/Input Upload File Kop Surat'), kopSuratFilePath, FailureHandling.OPTIONAL)

selectDropdownValue('Master Data/Super Admin/Form Sekolah/Dropdown Provinsi', 'Master Data/Super Admin/Form Sekolah/Isi Dropdown Provinsi', 
    5, 2)

// Select City
selectDropdownValue('Master Data/Super Admin/Form Sekolah/Dropdown Kota', 'Master Data/Super Admin/Form Sekolah/Isi Dropdown Kota', 
    2, 2)

// Fungsi untuk menghasilkan alamat acak
// Contoh penggunaan
String alamatRandom = generateRandomAlamat()

WebUI.setText(findTestObject('Master Data/Super Admin/Form Sekolah/Field Alamat'), alamatRandom, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Form Sekolah/Button Tambahkan'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Form Sekolah/Button YA'), FailureHandling.OPTIONAL)

String generateRandomNamaSekolah() {
    List<Map> namaSekolahList = ['SMA Harapan Bangsa', 'SMA Citra Nusantara', 'SMA Tunas Muda', 'SMA Pelita Harapan', 'SMA Duta Bangsa'
        , 'SMA Bina Insan', 'SMA Mandiri Jaya', 'SMA Cendekia Utama', 'SMA Cahaya Bangsa', 'SMA Kasih Ibu', 'SMA Tunas Bangsa'
        , 'SMA Nusa Jaya', 'SMA Karya Mandiri', 'SMA Pelita Cita', 'SMA Inspirasi Bangsa', 'SMA Sejahtera', 'SMA Bintang Terang'
        , 'SMA Elang Nusantara', 'SMA Gemilang Prestasi', 'SMA Bina Cita', 'SMA Anak Bangsa', 'SMA Prima Nusantara', 'SMA Pertiwi'
        , 'SMA Persada', 'SMA Pionir Harapan', 'SMA Cakra Nusantara', 'SMA Global Mandiri', 'SMA Pelangi Nusantara', 'SMA Bhakti Pertiwi'
        , 'SMA Citra Bangsa', 'SMA Harmoni', 'SMA Tunas Cendekia', 'SMA Unggul Bangsa', 'SMA Bina Generasi', 'SMA Gemilang Jaya'
        , 'SMA Purna Bhakti', 'SMA Nusantara Jaya', 'SMA Wijaya Kusuma', 'SMA Merdeka', 'SMA Pertiwi Sejahtera', 'SMA Pelita Nusantara'
        , 'SMA Cahaya Pertiwi', 'SMA Tunas Harapan', 'SMA Satria Mandiri', 'SMA Bina Utama', 'SMA Pionir Nusantara', 'SMA Mutiara Bangsa'
        , 'SMA Kasih Bangsa', 'SMA Nusa Indah', 'SMA Bina Prestasi']

    return namaSekolahList[new Random().nextInt(namaSekolahList.size())]
}

String generateRandomNomorHP() {
    return '08' + (Math.abs(new Random().nextLong()) % 1000000000).toString().padLeft(9, '0')
}

String generateRandomEmail(String namaSekolah) {
    String namaSekolahFormatted = namaSekolah.toLowerCase().replaceAll('\\s+', '')

    return namaSekolahFormatted + '@sch.id'
}

String generateRandomNPSN() {
    return (Math.abs(new Random().nextLong()) % 10000000000).toString().padLeft(10, '0')
}

String generateRandomAlamat() {
    List<Map> alamatList = ['Head Office. Pondok Indah Office Tower 1 Lantai 8. Jl. Sultan Iskandar Muda Kav. V - TA, Jakarta Selatan 12310. Tel. +62-21 7654466. Fax. +62-21 7507747.'
        , 'Jl. Jenderal Sudirman Kav. 10-11, Jakarta Pusat 10220. Tel. +62-21 1234567. Fax. +62-21 9876543.', 'Kompleks Ruko Grand Galaxy, Blok A5 No. 12, Bekasi Selatan 17148. Tel. +62-21 8855543.'
        , 'Jl. Ahmad Yani No. 45, Surabaya 60234. Tel. +62-31 7894567.', 'Jl. Diponegoro No. 101, Bandung 40132. Tel. +62-22 7651234. Fax. +62-22 9873214.'
        , 'Jl. MT Haryono No. 3, Medan 20234. Tel. +62-61 4321678.', 'Jl. Brigjen Katamso No. 88, Yogyakarta 55212. Tel. +62-274 556789.'
        , 'Jl. Gatot Subroto Kav. 15-17, Jakarta Selatan 12950. Tel. +62-21 7650987.', 'Jl. Pahlawan No. 76, Semarang 50134. Tel. +62-24 7776543.'
        , 'Jl. Imam Bonjol No. 23, Malang 65115. Tel. +62-341 556712.']

    return alamatList[new Random().nextInt(alamatList.size())]
}

def selectDropdownValue(String dropdownXpath, String valueXpath, int delayBefore, int delayAfter) {
    WebUI.click(findTestObject(dropdownXpath))

    WebUI.delay(delayBefore)

    WebUI.click(findTestObject(valueXpath))

    WebUI.delay(delayAfter)
}

def fillFormWithData(Map formData) {
    WebUI.setText(findTestObject('Master Data/Super Admin/Form Sekolah/Field NPSN'), formData['NPSN'])

    WebUI.setText(findTestObject('Master Data/Super Admin/Form Sekolah/Field Telephone'), formData['Telephone'])

    WebUI.setText(findTestObject('Master Data/Super Admin/Form Sekolah/Field Nama Sekolah'), formData['NamaSekolah'])

    WebUI.setText(findTestObject('Master Data/Super Admin/Form Sekolah/Field Email'), formData['Email'])
}

def uploadLogo(String logoFilePath) {
    WebUI.click(findTestObject('Master Data/Super Admin/Form Sekolah/Button Upload Logo'))

    WebUI.delay(1)

    WebUI.uploadFile(findTestObject('Master Data/Super Admin/Form Sekolah/Input File Upload'), logoFilePath)
}

