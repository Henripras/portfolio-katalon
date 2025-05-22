import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import java.util.Random as Random
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.io.File as File
import com.kms.katalon.core.testobject.TestObject as TestObject

// Open Browser and Navigate to URL
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564/')

WebUI.waitForPageLoad(10)

// Login
login('henriprasetyo210@gmail.com', 'Admin.123')

// Navigate to Trade Menu
navigateToTradeMenu()

// Generate and Set Invoice Number
setInvoiceNumber()

// Set Start Date and Due Date
setInvoiceDates()

// Generate and Set PO Number
setPONumber()

// Set Bill To
setBillTo()

// Upload Tax Form
uploadTaxForm()

// Set Ship To Address
setShipToAddress()

// Select Currency
selectCurrency()

// Scroll to Detail Item Section
scrollToElement(findTestObject('Transaction/Trade/Detail Item/Button Add Detail Item'))

// Add Detail Item
addDetailItem()

// Scroll to Total Amount Section after filling out Detail Item
scrollToElement(findTestObject('Transaction/Trade/Total Amount Section'))

// Upload Supporting Files
uploadSupportingFiles()

// Submit Form
WebUI.click(findTestObject('Transaction/Trade/Section Upload Image/Button Submit')) // Logika untuk mengklik tombol upload dan memilih file secara manual
// Tunggu tombol upload terlihat
// Scroll ke elemen untuk memastikan tombol terlihat
// Klik tombol upload untuk membuka dialog pemilihan file
// Tambahkan delay 5 detik untuk memberi waktu memilih file secara manual

WebUI.click(findTestObject('Transaction/Trade/Button Ya') // Logika untuk mengklik tombol upload dan memilih file secara manual
    )

void login(String email, String password) {
    WebUI.waitForElementVisible(findTestObject('Login/Field Email'), 10)

    WebUI.setText(findTestObject('Login/Field Email'), email)

    WebUI.waitForElementVisible(findTestObject('Login/Field Password'), 10)

    WebUI.setText(findTestObject('Login/Field Password'), password)

    WebUI.waitForElementClickable(findTestObject('Login/Button Submit Email Password'), 10)

    WebUI.click(findTestObject('Login/Button Submit Email Password'))

    List<String> otpFields = ['Object Repository/Login/OTP Page/Kode OTP 1', 'Object Repository/Login/OTP Page/Kode OTP 2'
        , 'Object Repository/Login/OTP Page/Kode OTP 3', 'Object Repository/Login/OTP Page/Kode OTP 4', 'Object Repository/Login/OTP Page/Kode OTP 5'
        , 'Object Repository/Login/OTP Page/Kode OTP 6']

    otpFields.each({ def field ->
            WebUI.waitForElementVisible(findTestObject(field), 10)

            WebUI.setText(findTestObject(field), '1')
        })

    WebUI.waitForElementClickable(findTestObject('Login/Button Submit OTP'), 10)

    WebUI.click(findTestObject('Login/Button Submit OTP'))

    WebUI.delay(3)
}

void navigateToTradeMenu() {
    WebUI.click(findTestObject('Dashboard/Menu Transaksi'))

    WebUI.click(findTestObject('Dashboard/Sub Menu Trade'))
}

void setInvoiceNumber() {
    String randomInvoiceNumber = generateRandomInvoiceNumber()

    WebUI.setText(findTestObject('Transaction/Trade/Field Invoice'), randomInvoiceNumber)

    println("Generated Invoice Number: $randomInvoiceNumber")
}

void setInvoiceDates() {
    WebUI.click(findTestObject('Transaction/Trade/Field Start Date Invoice'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Transaction/Trade/Field Due Date Invoice'))

    WebUI.delay(5)
}

void setPONumber() {
    String randomPONumber = generateRandomPONumber()

    WebUI.setText(findTestObject('Transaction/Trade/Field PO'), randomPONumber)

    println("Generated PO Number: $randomPONumber")
}

void setBillTo() {
    WebUI.click(findTestObject('Transaction/Trade/Field Bill To'))

    WebUI.click(findTestObject('Transaction/Trade/Value Dropdown Bill To'))
}

void uploadTaxForm() {
    WebUI.click(findTestObject('Transaction/Trade/Button Upload Tax Form'))

    String filePath = 'C:\\Users\\henri\\Documents\\Upload Data Otsuka\\Tax Form.png'

    TestObject uploadField = findTestObject('Transaction/Trade/Input File Upload')

    if (uploadField == null) {
        WebUI.comment('Error: Test object for file upload input not found!')

        return null
    }
    
    WebUI.uploadFile(uploadField, filePath)

    WebUI.comment('File successfully uploaded: ' + filePath)
}

void setShipToAddress() {
    WebUI.setText(findTestObject('Transaction/Trade/Field Ship To'), 'Alamat: Tower A, 18 Office Park, Jl. TB Simatupang No.18')
}

void selectCurrency() {
    WebUI.click(findTestObject('Transaction/Trade/Dropdown Currency'))

    WebUI.click(findTestObject('Transaction/Trade/Value Dropdown Currency'))
}

void addDetailItem() {
    WebUI.click(findTestObject('Transaction/Trade/Detail Item/Button Add Detail Item'))

    String randomDescription = generateRandomDescription()

    WebUI.setText(findTestObject('Transaction/Trade/Detail Item/Field Deskripsi'), randomDescription)

    int randomQuantity = generateRandomQuantity()

    WebUI.setText(findTestObject('Transaction/Trade/Detail Item/Field Quantity'), String.valueOf(randomQuantity))

    int randomPricePerUnit = generateRandomPricePerUnit()

    WebUI.setText(findTestObject('Transaction/Trade/Detail Item/Field Price Per Unit'), String.valueOf(randomPricePerUnit))

    WebUI.click(findTestObject('Transaction/Trade/Detail Item/Button Submit Add Details Item'))

    println("Generated Item Details: Description: $randomDescription, Quantity: $randomQuantity, Price Per Unit: $randomPricePerUnit")
}

void uploadSupportingFiles() {
    clickUploadButton('Transaction/Trade/Section Upload Image/Upload File Purchase Order')

    clickUploadButton('Transaction/Trade/Section Upload Image/Upload File Invoice')

    clickUploadButton('Transaction/Trade/Section Upload Image/Upload File Delivery Order')

    clickUploadButton('Transaction/Trade/Section Upload Image/Upload File Service Received')
}

void clickUploadButton(String testObjectPath) {
    try {
        WebUI.waitForElementVisible(findTestObject(testObjectPath), 30)

        WebUI.scrollToElement(findTestObject(testObjectPath), 30)

        WebUI.click(findTestObject(testObjectPath))

        WebUI.delay(5)

        WebUI.comment('Tombol upload diklik, silakan pilih file secara manual.')
    }
    catch (Exception e) {
        WebUI.comment((('Error mengklik tombol upload ' + testObjectPath) + ': ') + e.message)
    } 
}

void scrollToElement(TestObject testObject) {
    try {
        WebUI.scrollToElement(testObject, 5)

        println("Successfully scrolled to the element: $testObject.getObjectId()")
    }
    catch (Exception e) {
        println("Error scrolling to element: $e.message")
    } 
}

String generateRandomDescription() {
    String[] descriptions = ['Laptop', 'Mouse', 'Keyboard', 'Monitor', 'Printer', 'Headset', 'Webcam']

    return descriptions[new Random().nextInt(descriptions.length)]
}

int generateRandomQuantity() {
    return new Random().nextInt(100) + 1
}

int generateRandomPricePerUnit() {
    return (new Random().nextInt(10000) + 100) * 10
}

String generateRandomInvoiceNumber() {
    SimpleDateFormat sdf = new SimpleDateFormat('yyyyMMddHHmmss')

    return ('INV-' + sdf.format(new Date())) + new Random().nextInt(1000)
}

String generateRandomPONumber() {
    return 'PO-' + new Random().nextInt(10000)
}

