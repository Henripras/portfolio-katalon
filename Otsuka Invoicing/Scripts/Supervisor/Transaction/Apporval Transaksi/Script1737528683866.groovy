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

// Navigate to the URL
WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564', FailureHandling.OPTIONAL)

// Login
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo220@gmail.com', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Login/Button Submit Email Password'), FailureHandling.OPTIONAL)

// Input OTP
(1..6).each({ def index ->
        WebUI.setText(findTestObject("Login/OTP Page/Kode OTP $index"), '1')
    })

WebUI.click(findTestObject('Login/Button Submit OTP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Dashboard/Menu Transaksi'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Transaction/Approval/Sub Menu Approval'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Transaction/Approval/Button Authorize'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Transaction/Approval/Authorize/Button History'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Transaction/Approval/Authorize/Button Close History'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Transaction/Approval/Authorize/Button Approve'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Transaction/Approval/Authorize/Button Yes Approve'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Transaction/Approval/Button Authorize'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Transaction/Approval/Authorize/Button Reject'), FailureHandling.OPTIONAL)

// Daftar komentar acak
def comments = ['Transaction has missing information.', 'Approval denied due to incorrect details.', 'Transaction requires further verification.'
    , 'Please review the transaction details before proceeding.', 'Transaction did not meet approval criteria.', 'Rejecting due to non-compliance with policy.'
    , 'Transaction rejected for insufficient documentation.']

// Pilih komentar acak
def randomComment = comments[new Random().nextInt(comments.size())]

// Isi kolom komentar dengan komentar acak
WebUI.setText(findTestObject('Transaction/Approval/Authorize/Field Comment Reject'), randomComment, FailureHandling.OPTIONAL)

// Tentukan jumlah maksimal percobaan (untuk mencegah loop tak terbatas)
// Klik tombol "Yes Reject"
// Verifikasi apakah toast notification muncul
// Tunggu beberapa saat sebelum mencoba lagi
// Panggil fungsi untuk mengeksekusi
clickUntilToastVisible()

def clickUntilToastVisible() {
    int maxAttempts = 5

    int attempt = 0

    while (attempt < maxAttempts) {
        WebUI.click(findTestObject('Transaction/Approval/Authorize/Button Yes Reject'), FailureHandling.STOP_ON_FAILURE)

        if (WebUI.verifyElementVisible(findTestObject('Transaction/Approval/Toast Rejected'), FailureHandling.OPTIONAL)) {
            println('Toast notification terlihat, transaksi ditolak.')

            break
        } else {
            println('Toast notification belum terlihat, mencoba lagi.')

            attempt++
        }
        
        WebUI.delay(2)
    }
    
    if (attempt >= maxAttempts) {
        println("Toast notification tidak terlihat setelah $maxAttempts percobaan.")
    }
}

