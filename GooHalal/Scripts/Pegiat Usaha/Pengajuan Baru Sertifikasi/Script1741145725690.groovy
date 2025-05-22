import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import java.awt.Robot as Robot
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.Toolkit as Toolkit
import java.awt.event.KeyEvent as KeyEvent
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
import org.openqa.selenium.WebElement as WebElement

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

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Guide Selesai'))

WebUI.click(findTestObject('Homepage/Menu Sertifikasi'))

WebUI.click(findTestObject('Homepage/Menu Pengajuan (Self Declare)'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Dashboard Self Declare/Button Tambah Sertifikasi Baru'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Kuisioner/Button Berikutnya Guide'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Kuisioner/Button Selesai Guide'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Kuisioner/Radio Button Yes Daging'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Kuisioner/Field Dropdown RPH'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Kuisioner/Value Dropdown RPH'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Kuisioner/Button Ajukan'))

WebUI.delay(2)

// Klik tombol "Guide Pengajuan" sebanyak 6 kali
for (int i = 0; i < 6; i++) {
    WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Guide Pengajuan'))
}

// Klik tombol "Guide Selesai" sekali
WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Guide Selesai'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Radio Button Penjelasan Proses Produksi'))

// Fungsi untuk menyalin path file ke clipboard
// Fungsi untuk meng-upload file menggunakan Robot
// Salin path file ke clipboard
// Menunggu beberapa detik agar clipboard dapat memproses
// Membuat objek Robot untuk mengontrol keyboard dan mouse
// Tekan CTRL+V untuk menempelkan path file dari clipboard
// Tekan ENTER untuk mengonfirmasi pemilihan file
// Daftar file path untuk bahan baku, video, dan foto kemasan produk
def bahanBakuFile = 'C:\\Users\\henri\\Documents\\Upload Data Sihalal\\Luna Bites\\Bahan Baku & Proses Pembuatan.pdf'

def videoFile = 'C:\\Users\\henri\\Documents\\Upload Data Sihalal\\Luna Bites\\Video Pembuatan Luna Bites.mp4'

def fotoKemasanFile = 'C:\\Users\\henri\\Documents\\Upload Data Sihalal\\Luna Bites\\Luna Bites Kemasan.jpg'

// Mengklik tombol Unggah Berkas Bahan Baku dan meng-upload file menggunakan Robot
WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Unggah Berkas Bahan Baku'))

WebUI.delay(5 // Menunggu dialog upload file terbuka
    )

// Menggunakan Robot untuk meng-upload file bahan baku
uploadFileUsingRobot(bahanBakuFile)

WebUI.delay(5 // Menunggu beberapa detik untuk memastikan file bahan baku ter-upload
    )

// Mengklik tombol "Upload Rekam Video" dan meng-upload file video menggunakan Robot
WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Upload Rekam Video'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Pilih File Rekam Video'))

WebUI.delay(5 // Menunggu dialog file upload muncul
    )

// Menggunakan Robot untuk meng-upload file video
uploadFileUsingRobot(videoFile)

WebUI.delay(15 // Menunggu beberapa detik untuk memastikan video ter-upload
    )

// Menggunakan scroll untuk memastikan elemen foto kemasan produk terlihat
WebUI.scrollToElement(findTestObject('Pegiat Usaha/Page Pengajuan/Label Foto Kemasan Produk'), 0)

// Mengklik tombol "Upload Kemasan Produk" dan meng-upload foto kemasan produk menggunakan Robot
WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Upload Kemasan Produk'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Pilih File Perangkat Kemasan Produk'))

WebUI.delay(5 // Menunggu dialog file upload muncul
    )

// Menggunakan Robot untuk meng-upload foto kemasan produk
uploadFileUsingRobot(fotoKemasanFile)

WebUI.delay(5 // Menunggu beberapa detik untuk memastikan foto kemasan ter-upload
    )

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Kirim Pengajuan'))

WebUI.scrollToElement(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Checkbox'), 0)

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Checkbox'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Kirim Pengajuan Pop Up'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Page Jenis Pengajuan/Radio Button Self Declare'))

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Page Jenis Pengajuan/Button Lanjutkan'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Simpan Data'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Pegiat Usaha/Page Pengajuan/Page Pengajuan/Button Oke Pengajuan Berhasil'), FailureHandling.OPTIONAL)

WebUI.delay(2)

def copyToClipboard(String text) {
    StringSelection stringSelection = new StringSelection(text)

    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null)
}

def uploadFileUsingRobot(String filePath) {
    copyToClipboard(filePath)

    WebUI.delay(1)

    Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)
}

