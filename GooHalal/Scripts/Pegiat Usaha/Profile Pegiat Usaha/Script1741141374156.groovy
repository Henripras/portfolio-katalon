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
import java.util.Random as Random

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://goohalal.ihtekno.tech/login')

WebUI.click(findTestObject('Login/Field Dropdown Masuk Sebagai'))

WebUI.click(findTestObject('Login/Value Dropdown Pegiat Usaha'))

WebUI.click(findTestObject('Login/Button Konfirmasi Masuk Sebagai'))

WebUI.click(findTestObject('Login/Button Masuk To Login Page'))

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.setText(findTestObject('Login/Field Email Login'), '0895360988041')

WebUI.click(findTestObject('Login/Field Password Login'))

WebUI.setText(findTestObject('Login/Field Password Login'), '123456')

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.click(findTestObject('Login/Button Masuk Login'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Pegiat Usaha/Homepage/Checkbox Autentikasi Akun'))

WebUI.click(findTestObject('Pegiat Usaha/Homepage/Button Lanjutkan Autentikasi Akun'))

WebUI.click(findTestObject('Homepage/Selesai Guideance Homepage'))

WebUI.click(findTestObject('Homepage/Menu Sertifikasi'))

WebUI.click(findTestObject('Homepage/Menu Profile Pegiat Usaha'))

WebUI.click(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/Informasi Personal/Button Ubah Informasi Personal'))

WebUI.click(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/Informasi Personal/Field Email Informasi Personal'))

// Fungsi untuk menghasilkan email acak berdasarkan nama orang
// Menambahkan nama orang ke email
// Menambahkan angka acak
// Menambahkan domain email
// Mengambil nama orang sebagai input, misalnya "John Doe"
String name = 'John Doe'

// Menghasilkan email acak menggunakan nama orang
String randomEmail = generateRandomEmail(name)

// Membersihkan field email terlebih dahulu
WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/Informasi Personal/Field Email Informasi Personal'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/Informasi Personal/Field Email Informasi Personal'), 
    Keys.chord(Keys.DELETE))

// Mengisi field email dengan email acak yang dihasilkan
WebUI.setText(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/Informasi Personal/Field Email Informasi Personal'), 
    randomEmail)

WebUI.click(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/Informasi Personal/Button Simpan Informasi Personal'))

WebUI.click(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Button Ubah Informasi NIB'))

// Fungsi untuk menghasilkan nama toko kue acak
// Menambahkan "Toko Kue" ke nama usaha
// Menambahkan kata acak untuk jenis toko kue
// Menambahkan angka acak di akhir
// Menghasilkan nama toko kue acak
String randomCakeShopName = generateRandomCakeShopName()

// Membersihkan field nama usaha terlebih dahulu
WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Nama Usaha NIB'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Nama Usaha NIB'), Keys.chord(Keys.DELETE))

// Mengisi field nama usaha dengan nama toko kue acak yang dihasilkan
WebUI.setText(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Nama Usaha NIB'), randomCakeShopName)

// Fungsi untuk menghasilkan nomor NIB acak dengan maksimal 10 angka
// Menghasilkan nomor NIB acak dengan maksimal 10 angka
// Menambahkan angka acak antara 0-9
// Menghasilkan nomor NIB acak
String randomNIB = generateRandomNIB()

// Membersihkan field nomor izin usaha terlebih dahulu
WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Nomor Izin Usaha NIB'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Nomor Izin Usaha NIB'), Keys.chord(Keys.DELETE))

// Mengisi field dengan nomor NIB acak yang dihasilkan
WebUI.setText(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Nomor Izin Usaha NIB'), randomNIB)

// Fungsi untuk menghasilkan alamat acak di Tangerang Selatan
// Menambahkan jalan acak
// Menambahkan nomor rumah atau blok acak
// Menambahkan RT/RW acak
// Menambahkan area (kecamatan) acak
// Menambahkan kode pos acak (kode pos Tangerang Selatan berkisar antara 15410 - 15420)
// Menghasilkan alamat acak
String randomAddress = generateRandomAddress()

// Membersihkan field alamat terlebih dahulu
WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Alamat NIB'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Alamat NIB'), Keys.chord(Keys.DELETE))

// Mengisi field alamat dengan alamat acak yang dihasilkan
WebUI.setText(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Field Alamat NIB'), randomAddress)

WebUI.click(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NIB/Button Simpan Informasi NIB'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 1000)

WebUI.delay(2)

WebUI.click(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Button Ubah Informasi NPWP'))

// Fungsi untuk menghasilkan nama lengkap acak
// Menambahkan nama depan acak
// Menambahkan nama belakang acak
// Menghasilkan nama lengkap acak
String randomFullName = generateRandomFullName()

// Membersihkan field nama lengkap NPWP terlebih dahulu
WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Nama Lengkap NPWP'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Nama Lengkap NPWP'), Keys.chord(Keys.DELETE))

// Mengisi field nama lengkap NPWP dengan nama acak yang dihasilkan
WebUI.setText(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Nama Lengkap NPWP'), randomFullName)

// Fungsi untuk menghasilkan nomor NPWP acak dengan maksimal 10 angka
// Menghasilkan nomor NPWP acak dengan maksimal 10 angka
// Menambahkan angka acak antara 0-9
// Menghasilkan nomor NPWP acak
String randomNPWP = generateRandomNPWP()

// Membersihkan field nomor NPWP terlebih dahulu
WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Nomor NPWP'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Nomor NPWP'), Keys.chord(Keys.DELETE))

// Mengisi field nomor NPWP dengan nomor acak yang dihasilkan
WebUI.setText(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Nomor NPWP'), randomNPWP)

// Fungsi untuk menghasilkan alamat NPWP acak
// Menambahkan jalan acak
// Menambahkan nomor rumah atau blok acak
// Menambahkan RT/RW acak
// Menambahkan kota acak
// Menambahkan kode pos acak (kode pos berkisar antara 10000 hingga 19999)
// Menghasilkan alamat NPWP acak
String randomAddressNPWP = generateRandomAddressNPWP()

// Membersihkan field alamat NPWP terlebih dahulu
WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Alamat NPWP'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Alamat NPWP'), Keys.chord(Keys.DELETE))

// Mengisi field alamat NPWP dengan alamat acak yang dihasilkan
WebUI.setText(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Field Alamat NPWP'), randomAddressNPWP)

WebUI.click(findTestObject('Pegiat Usaha/Page Profile Pegiat Usaha/NPWP/Button Simpan Informasi NPWP'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

def clickWithTimeout(Optional<Integer> timeout = Optional.of(3000)) {
    try {
        if (timeout.isPresent()) {
            WebUI.delay(timeout.get() / 1000)
        }
        
        WebUI.click(findTestObject('Existing To Sihalal/Pop Up Chrome Later Subscription'))
    }
    catch (Exception e) {
        println("Error: $e.message")
    } 
}

String generateRandomAddressNPWP() {
    String[] streets = ['Jl. Raya Jakarta', 'Jl. Merdeka', 'Jl. Sudirman', 'Jl. Kemerdekaan', 'Jl. Sederhana', 'Jl. Cempaka'
        , 'Jl. Kenanga', 'Jl. Raya Pondok Indah']

    String[] cities = ['Tangerang Selatan', 'Jakarta Selatan', 'Depok', 'Bekasi', 'Bogor']

    Random rand = new Random()

    StringBuilder address = new StringBuilder()

    address.append(streets[rand.nextInt(streets.length)])

    address.append(' No. ').append(rand.nextInt(100) + 1)

    address.append(', RT ').append(rand.nextInt(10) + 1).append('/RW ').append(rand.nextInt(10) + 1)

    address.append(', ').append(cities[rand.nextInt(cities.length)])

    address.append(' - ').append(rand.nextInt(10000) + 10000)

    return address.toString()
}

String generateRandomNPWP() {
    StringBuilder npwp = new StringBuilder()

    Random rand = new Random()

    for (int i = 0; i < 10; i++) {
        npwp.append(rand.nextInt(10))
    }
    
    return npwp.toString()
}

String generateRandomFullName() {
    String[] firstNames = ['Andi', 'Budi', 'Citra', 'Dewi', 'Eka', 'Farhan', 'Gita', 'Hendra', 'Indah', 'Joko']

    String[] lastNames = ['Pratama', 'Sutrisno', 'Raharjo', 'Tirta', 'Sari', 'Kusuma', 'Aditya', 'Wijaya', 'Putri', 'Mulyani']

    Random rand = new Random()

    StringBuilder fullName = new StringBuilder()

    fullName.append(firstNames[rand.nextInt(firstNames.length)])

    fullName.append(' ').append(lastNames[rand.nextInt(lastNames.length)])

    return fullName.toString()
}

String generateRandomAddress() {
    String[] streets = ['Jl. Raya Bintaro', 'Jl. Ciputat Raya', 'Jl. Ir. H. Juanda', 'Jl. Pondok Cabe', 'Jl. Bintaro Utama'
        , 'Jl. Cireundeu', 'Jl. Kemandoran', 'Jl. Muncul', 'Jl. Raya Sawangan']

    String[] areas = ['Bintaro', 'Ciputat', 'Pondok Aren', 'Setu', 'Tangerang Selatan']

    Random rand = new Random()

    StringBuilder address = new StringBuilder()

    address.append(streets[rand.nextInt(streets.length)])

    address.append(' No. ').append(rand.nextInt(100) + 1)

    address.append(', RT ').append(rand.nextInt(10) + 1).append('/RW ').append(rand.nextInt(10) + 1)

    address.append(', ').append(areas[rand.nextInt(areas.length)])

    address.append(' - ').append(rand.nextInt(11) + 15410)

    return address.toString()
}

String generateRandomNIB() {
    StringBuilder nib = new StringBuilder()

    Random rand = new Random()

    for (int i = 0; i < 10; i++) {
        nib.append(rand.nextInt(10))
    }
    
    return nib.toString()
}

String generateRandomCakeShopName() {
    String[] cakeTypes = ['Manis', 'Lezat', 'Enak', 'Klasik', 'Mewah', 'Sederhana', 'Jajan', 'Kreatif']

    StringBuilder shopName = new StringBuilder()

    Random rand = new Random()

    shopName.append('Toko Kue ')

    shopName.append(cakeTypes[rand.nextInt(cakeTypes.length)])

    shopName.append(' ')

    for (int i = 0; i < 3; i++) {
        shopName.append(rand.nextInt(10))
    }
    
    return shopName.toString()
}

String generateRandomEmail(String name) {
    String chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'

    StringBuilder email = new StringBuilder()

    Random rand = new Random()

    email.append(name.toLowerCase().replaceAll(' ', ''))

    for (int i = 0; i < 3; i++) {
        email.append(rand.nextInt(10))
    }
    
    email.append('@example.com')

    return email.toString()
}

