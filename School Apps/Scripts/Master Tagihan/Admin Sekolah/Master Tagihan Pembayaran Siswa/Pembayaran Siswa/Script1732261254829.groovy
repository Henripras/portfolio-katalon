import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling

// Open Browser
WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

WebUI.maximizeWindow()

// Login
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.sekolah@gmail.com')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

// Navigate to Payment Page
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Menu Tagihan'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa'))

// Search for Student
WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Field Pencarian Siswa'), 
    'adam')

WebUI.delay(2)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Value Rekomendasi Siswa'))

// Open Payment History
WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Page Pembayaran Siswa/Button Riwayat Pembayaran'))

WebUI.verifyElementVisible(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Verifikasi Nama Siswa'))

// Return to Payment Menu and Search Again
WebUI.back()

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Field Pencarian Siswa'), 
    'adam')

WebUI.delay(2)

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Value Rekomendasi Siswa'))

// Click Table Rows
['Nama Tagihan', 'Tipe Tagihan', 'Tanggal Tagihan', 'Jumlah Tagihan'].each({ def row ->
        3.times({ 
                WebUI.click(findTestObject("Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Data in Table/Row $row"))
            })
    })

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Data in Table/Pilih Checkbox'))

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Data in Table/Button Bayar Sekarang'))

WebUI.setText(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Pop Up Konfirmasi Pembayaran/Field Uang Yang Dibayarkan'), 
    '5000000')

// Function to handle the looping click and error verification
// Click on the 'Lanjut Bayar' button
// Set a flag to indicate whether error message is displayed
// Initialize the attempt counter
// Loop for checking error message every 5 seconds with a maximum of 5 attempts
// Verify if the error message is displayed
// If error message appears, click again and wait for 5 seconds before the next check
// If no error message, break the loop and continue to the next step
// Increment the attempt counter
// Once the error message is not displayed or max attempts reached, verify the success message
// Call the function to execute the logic
handlePaymentErrorLoop()

WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Page Sukses Pembayaran Siswa/Button Cetak'))

WebUI.delay(5)

def handlePaymentErrorLoop() {
    WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Pop Up Konfirmasi Pembayaran/Button Lanjut Bayar'))

    boolean isErrorDisplayed = false

    int attemptCount = 0

    int maxAttempts = 5

    while (attemptCount < maxAttempts) {
        isErrorDisplayed = WebUI.verifyElementPresent(findTestObject('//Toast[@type=\'error\' and @message=\'Gagal Melakukan Pembayaran!\' and @toastId=\'failed-billing-page\']'), 
            5, FailureHandling.OPTIONAL)

        if (isErrorDisplayed) {
            WebUI.delay(5)

            WebUI.click(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Pop Up Konfirmasi Pembayaran/Button Lanjut Bayar'))
        } else {
            break
        }
        
        attemptCount++
    }
    
    WebUI.verifyElementVisible(findTestObject('Master Tagihan/Admin Sekolah/Pembayaran Siswa/Homepage/Sub Menu Pembayaran Siswa (1)/Page Sukses Pembayaran Siswa/Toast Notification Berhasil'))
}

