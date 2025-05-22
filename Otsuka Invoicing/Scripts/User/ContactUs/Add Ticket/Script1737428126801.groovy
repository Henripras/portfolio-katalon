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

WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564/', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

// Login
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo41@gmail.com', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Login/Button Submit Email Password'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/OTP 1'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/OTP 1'), '673432', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/Submit OTP'), FailureHandling.OPTIONAL)

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Add_Ticket/Sidebar menu Contact us'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Add_Ticket/Add Ticket'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Add_Ticket/Add Subject'), FailureHandling.OPTIONAL)

// Daftar subjek untuk permintaan barang/jasa
List<String> subjects = ['Permintaan Barang Elektronik', 'Permintaan Alat Tulis Kantor', 'Permintaan Jasa Kebersihan', 'Permintaan Jasa IT'
    , 'Permintaan Bahan Makanan', 'Permintaan Jasa Konsultasi', 'Permintaan Barang Kesehatan', 'Permintaan Jasa Transportasi']

// Pilih subjek secara acak
String randomSubject = subjects[new Random().nextInt(subjects.size())]

// Masukkan subjek yang dipilih ke dalam form
WebUI.setText(findTestObject('Contact Us/Add_Ticket/Add Subject'), randomSubject, FailureHandling.OPTIONAL)

String question

switch (randomSubject) {
    case 'Permintaan Barang Elektronik':
        question = 'Apakah barang elektronik ini membutuhkan garansi tambahan?'

        break
    case 'Permintaan Alat Tulis Kantor':
        question = 'Berapa banyak unit alat tulis yang diperlukan?'

        break
    case 'Permintaan Jasa Kebersihan':
        question = 'Untuk area berapa luas jasa kebersihan diperlukan?'

        break
    case 'Permintaan Jasa IT':
        question = 'Apakah jasa IT ini mencakup pengembangan perangkat lunak atau dukungan teknis?'

        break
    case 'Permintaan Bahan Makanan':
        question = 'Apa jenis bahan makanan yang dibutuhkan dan dalam jumlah berapa?'

        break
    case 'Permintaan Jasa Konsultasi':
        question = 'Bidang apa yang membutuhkan jasa konsultasi (misalnya keuangan, hukum, atau manajemen)?'

        break
    case 'Permintaan Barang Kesehatan':
        question = 'Apakah barang kesehatan ini termasuk obat-obatan atau peralatan medis?'

        break
    case 'Permintaan Jasa Transportasi':
        question = 'Apakah jasa transportasi ini diperlukan untuk pengiriman barang atau perjalanan penumpang?'

        break
    default:
        question = 'Subjek tidak ditemukan. Harap pilih subjek yang valid.'}

// Klik pada elemen pertanyaan dan masukkan pertanyaan yang relevan
WebUI.click(findTestObject('Contact Us/Add_Ticket/Question'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Contact Us/Add_Ticket/Question'), question, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

// Tunggu elemen Attachment bisa diklik
WebUI.waitForElementClickable(findTestObject('Contact Us/Add_Ticket/Attachment'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Add_Ticket/Attachment'), FailureHandling.OPTIONAL)

WebUI.executeJavaScript('document.querySelector("input[type=\'file\']").style.display = "block";', null, FailureHandling.OPTIONAL)

// Tunggu beberapa detik agar elemen dapat diakses
WebUI.delay(2, FailureHandling.OPTIONAL)

// Mengunggah file menggunakan WebUI.uploadFile ke input file yang tersembunyi
String filePath = 'C:\\Users\\akmal\\Downloads\\BERKAS TEST PDF YA.pdf'

WebUI.uploadFile(findTestObject('Contact Us/Add_Ticket/Attachment'), filePath, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Contact Us/Add_Ticket/Submit'), FailureHandling.OPTIONAL)

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

