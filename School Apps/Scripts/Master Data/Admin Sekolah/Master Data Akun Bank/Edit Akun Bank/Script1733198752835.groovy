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

// Fungsi untuk menghapus teks dari sebuah field dan mengatur teks baru
// Fungsi untuk menghasilkan nama acak
// Memilih nama depan dan nama belakang secara acak
// Mulai sesi browser dan buka URL login
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

// Login ke aplikasi
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

// Navigasi ke menu Akun Bank
WebUI.click(findTestObject('Master Data/Admin Sekolah/Tagihan/Master Data Menu'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Menu Akun Bank'))

// Klik tombol Edit pada akun bank
WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Button Action'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Button Edit'))

// Pilih dropdown untuk akun bank
WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Dropdown Akun Bank'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Value Dropdown Akun Bank'))

// Fungsi untuk menghasilkan nama dan nomor rekening acak
// Menambahkan angka acak 0-9
// Isi field "Nama Akun Bank" dan "Nomor Rekening Bank" dengan data acak
clearAndSetText(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Field Nama Akun Bank'), generateRandomBankAccountName())

String initialAccountNumber = generateRandomData('64', 10)

int attempt = 0

boolean isSaved = false

int maxAttempts = 5

while (!(isSaved) && (attempt < maxAttempts)) {
    attempt++

    println("Percobaan ke-$attempt")

    // Isi field "Nomor Rekening Bank" dan klik Simpan
    clearAndSetText(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Field Nomor Rekening Bank'), initialAccountNumber)

    WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Button Simpan'))

    // Cek apakah nomor rekening sudah terdaftar
    if (WebUI.verifyElementVisible(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Toast Notification Error Nomor Rekening Sudah Terdaftar'), 
        FailureHandling.OPTIONAL)) {
        println('Error: Nomor rekening sudah terdaftar.')

        initialAccountNumber = generateRandomData('64', 10 // Generate nomor rekening baru
            )
    } else {
        isSaved = true

        println('Data berhasil disimpan.')
    }
}

if (isSaved) {
    WebUI.verifyElementVisible(findTestObject('Master Data/Admin Sekolah/Akun Bank/Edit Akun Bank/Toast Notification Data Berhasil Diubah'), 
        FailureHandling.STOP_ON_FAILURE)
} else {
    println("Gagal menyimpan data setelah $maxAttempts percobaan.")
}

// Tutup browser setelah tes selesai
WebUI.closeBrowser()

void clearAndSetText(TestObject testObject, String newText) {
    WebUI.sendKeys(testObject, Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(testObject, Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(testObject, newText)
}

String generateRandomBankAccountName() {
    List<String> firstNames = ['Pandu', 'Budi', 'Siti', 'Andi', 'Joko', 'Rina', 'Ari', 'Maya']

    List<String> lastNames = ['Wibisana', 'Sari', 'Pratama', 'Santoso', 'Putra', 'Gunawan', 'Sudarmaji', 'Amir']

    Random random = new Random()

    String firstName = firstNames[random.nextInt(firstNames.size())]

    String lastName = lastNames[random.nextInt(lastNames.size())]

    return (firstName + ' ') + lastName
}

String generateRandomData(String prefix, int length) {
    Random random = new Random()

    String result = prefix

    for (int i = 0; i < length; i++) {
        result += random.nextInt(10)
    }
    
    return result
}

