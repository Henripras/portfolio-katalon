import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import java.util.Random as Random

// Fungsi untuk verifikasi elemen dengan retry
// Buka browser dan navigasi ke URL
WebUI.openBrowser('', FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.OPTIONAL)

// Login
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin@gmail.com', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

// Navigasi ke halaman edit sekolah
WebUI.click(findTestObject('Master Data/Super Admin/Homepage Menu/Sidebar Menu'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Homepage Menu/Sub Menu Sekolah'), FailureHandling.OPTIONAL)

// Klik tombol aksi
WebUI.click(findTestObject('Master Data/Super Admin/Edit Sekolah/Master Data Sekolah Dashboard/Button Action'), FailureHandling.OPTIONAL)

// Jika elemen terlihat, lanjutkan ke langkah selanjutnya
WebUI.click(findTestObject('Master Data/Super Admin/Edit Sekolah/Master Data Sekolah Dashboard/Button Edit'), FailureHandling.OPTIONAL)

/**
 * Fungsi untuk memverifikasi elemen terlihat dengan retry
 * @param testObject - Test Object yang ingin diverifikasi
 * @param maxAttempts - Jumlah maksimum percobaan
 * @param delaySeconds - Waktu delay antar percobaan (dalam detik)
 * @return boolean - true jika elemen terlihat, false jika tidak
 */
// Bersihkan field menggunakan kombinasi tombol
WebUI.sendKeys(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field NPSN'), Keys.chord(Keys.CONTROL, 'a'), 
    FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field NPSN'), Keys.chord(Keys.DELETE), FailureHandling.OPTIONAL)

// Fungsi untuk menghasilkan NPSN acak
// Menghasilkan NPSN acak
String randomNPSN = generateRandomNPSN()

// Mengisi kolom NPSN dengan data acak
WebUI.setText(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field NPSN'), randomNPSN, FailureHandling.OPTIONAL)

// Bersihkan field Nomor Telepon
WebUI.sendKeys(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Nomor Telfon'), Keys.chord(Keys.CONTROL, 
        'a'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Nomor Telfon'), Keys.chord(Keys.DELETE), 
    FailureHandling.OPTIONAL)

// Fungsi untuk menghasilkan nomor telepon acak
// Menghasilkan nomor telepon acak
String randomNomorTelepon = generateRandomNomorTelepon()

// Mengisi kolom Nomor Telepon dengan data acak
WebUI.setText(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Nomor Telfon'), randomNomorTelepon, FailureHandling.OPTIONAL)

// Bersihkan field Nama Sekolah
WebUI.sendKeys(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Nama Sekolah'), Keys.chord(Keys.CONTROL, 
        'a'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Nama Sekolah'), Keys.chord(Keys.DELETE), 
    FailureHandling.OPTIONAL)

// Fungsi untuk menghasilkan nama sekolah acak
// Menghasilkan nama sekolah acak
String randomNamaSekolah = generateRandomNamaSekolah()

// Mengisi kolom Nama Sekolah dengan data acak
WebUI.setText(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Nama Sekolah'), randomNamaSekolah, FailureHandling.OPTIONAL)

// Bersihkan field Email Sekolah
WebUI.sendKeys(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Email Sekolah'), Keys.chord(Keys.CONTROL, 
        'a'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Email Sekolah'), Keys.chord(Keys.DELETE), 
    FailureHandling.OPTIONAL)

// Fungsi untuk menghasilkan email berdasarkan nama sekolah
// Mengubah nama sekolah menjadi huruf kecil dan mengganti spasi dengan titik
// Menghasilkan nama sekolah dan email acak
String randomEmail = generateEmailFromNamaSekolah(randomNamaSekolah)

// Mengisi kolom Email Sekolah dengan data acak sesuai nama sekolah
WebUI.setText(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Email Sekolah'), randomEmail, FailureHandling.OPTIONAL)

// Pilih Provinsi
WebUI.click(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Dropdown Provinsi'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Value Dropdown Provinsi'), FailureHandling.OPTIONAL)

// Pilih Kota
WebUI.click(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Dropdown Kota'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Value Dropdown Kota'), FailureHandling.OPTIONAL)

// Submit form
WebUI.click(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Field Button Simpan'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master Data/Super Admin/Edit Sekolah/Edit Page/Button Ya'), FailureHandling.OPTIONAL)

// Tutup browser
WebUI.closeBrowser(FailureHandling.OPTIONAL)

String generateRandomNPSN() {
    return (Math.abs(new Random().nextLong()) % 10000000000).toString().padLeft(10, '0')
}

String generateRandomNomorTelepon() {
    return '08' + (Math.abs(new Random().nextLong()) % 1000000000).toString().padLeft(9, '0')
}

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

String generateEmailFromNamaSekolah(String namaSekolah) {
    String emailPrefix = namaSekolah.toLowerCase().replaceAll(' ', '.')

    return emailPrefix + '@sch.co.id'
}

