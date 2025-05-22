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

WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564')

WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo210@gmail.com')

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123')

WebUI.click(findTestObject('Login/Button Submit Email Password'))

WebUI.setText(findTestObject('Login/OTP Page/Kode OTP 1'), '1')

WebUI.setText(findTestObject('Login/OTP Page/Kode OTP 2'), '1')

WebUI.setText(findTestObject('Login/OTP Page/Kode OTP 3'), '1')

WebUI.setText(findTestObject('Login/OTP Page/Kode OTP 4'), '1')

WebUI.setText(findTestObject('Login/OTP Page/Kode OTP 5'), '1')

WebUI.setText(findTestObject('Login/OTP Page/Kode OTP 6'), '1')

WebUI.click(findTestObject('Login/Button Submit OTP'))

WebUI.click(findTestObject('Dashboard/Menu Payment'))

WebUI.click(findTestObject('Payment/Checkbox Payment'))

WebUI.click(findTestObject('Payment/Button Next Bayar'))

// Function to click the upload button and upload the file with delay
// Click on the upload file button
// Wait for the upload dialog to appear (optional, adjust based on your scenario)
// Delay in seconds
// Upload the file (you can modify this if the file upload dialog requires specific interactions)
// Optionally, add another delay after the upload
// Wait for the file to upload (you can adjust this delay as needed)
// Function to generate a random payment comment
// Generate a random comment from the list
// Set the random comment into the payment field
WebUI.setText(findTestObject('Payment/Field Comment'), generateRandomPaymentComment())

WebUI.click(findTestObject('Payment/Button Bayar'))

WebUI.click(findTestObject('Payment/Button Ya'))

void uploadFileWithDelay(String filePath, int delayInSeconds) {
    WebUI.click(findTestObject('Payment/Button Upload File Attachment'))

    WebUI.delay(delayInSeconds)

    WebUI.uploadFile(findTestObject('Payment/Upload File Dialog'), filePath)

    WebUI.delay(2)
}

String generateRandomPaymentComment() {
    String[] comments = ['Pembayaran untuk invoice #1234. Terima kasih.', 'Pembayaran telah dilakukan sesuai dengan instruksi.'
        , 'Mohon konfirmasi jika pembayaran sudah diterima.', 'Pembayaran berhasil, harap diproses segera.', 'Ini adalah pembayaran untuk transaksi bulan ini.'
        , 'Pembayaran dilakukan sesuai kesepakatan.', 'Terima kasih atas layanan yang cepat dan profesional.', 'Mohon cek pembayaran ini dan informasikan statusnya.'
        , 'Pembayaran untuk produk yang dipesan, terima kasih.', 'Pembayaran telah diselesaikan, mohon diproses.']

    Random random = new Random()

    String randomComment = comments[random.nextInt(comments.length)]

    return randomComment
}

