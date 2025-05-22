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
import java.text.DecimalFormat as DecimalFormat
import java.util.Random as Random
import java.util.UUID as UUID

// Open browser and navigate to the URL
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564/')

// Login process
login('henriprasetyo210@gmail.com', 'Admin.123')

// Access menu and input data
accessTransactionMenu()
fillTransactionDetails()

// Function to log in
void login(String email, String password) {
    WebUI.setText(findTestObject('Login/Field Email'), email)
    WebUI.setText(findTestObject('Login/Field Password'), password)
    WebUI.click(findTestObject('Login/Button Submit Email Password'))

    // Enter OTP
    for (int i = 1; i <= 6; i++) {
        WebUI.setText(findTestObject("Login/OTP Page/Kode OTP $i"), '1')
    }
    WebUI.click(findTestObject('Login/Button Submit OTP'))
}

// Function to access Transaction Menu
void accessTransactionMenu() {
    WebUI.click(findTestObject('Dashboard/Menu Transaksi'))
    WebUI.click(findTestObject('Dashboard/Sub Menu Non Trade'))
}

// Function to fill transaction details
void fillTransactionDetails() {
    WebUI.setText(findTestObject('Transaction/Non Trade/Field Invoice'), generateRandomInvoiceNumber())
    selectDateManually('Transaction/Non Trade/Field Start Date', 5)
    selectDateManually('Transaction/Non Trade/Field Due Date', 5)
    
    String randomName = generateRandomName()
    fillAttentionTo(randomName)

    // Select Bill To
    WebUI.click(findTestObject('Transaction/Non Trade/Field Bill To'))
    WebUI.click(findTestObject('Transaction/Non Trade/Value Dropdown Bill To'))

    // Fill random email
    String randomEmail = generateRandomEmail()
    WebUI.setText(findTestObject('Transaction/Non Trade/Field Pic Email'), randomEmail)

    // Select Currency and Recurring options
    WebUI.click(findTestObject('Transaction/Non Trade/Dropdown Currency'))
    WebUI.waitForElementVisible(findTestObject('Transaction/Non Trade/Value Dropdown Currency'), 30)
    WebUI.click(findTestObject('Transaction/Non Trade/Value Dropdown Currency'))

    WebUI.click(findTestObject('Transaction/Non Trade/Dropdown Method Recurring'))
    WebUI.waitForElementVisible(findTestObject('Transaction/Non Trade/Value Dropdown Method Recurring'), 30)
    WebUI.click(findTestObject('Transaction/Non Trade/Value Dropdown Method Recurring'))

    // Ensure Recurring option is visible before clicking
    WebUI.waitForElementVisible(findTestObject('Transaction/Non Trade/Radio Button Recurring Yes'), 30)
    WebUI.scrollToElement(findTestObject('Transaction/Non Trade/Radio Button Recurring Yes'), 30)
    WebUI.click(findTestObject('Transaction/Non Trade/Radio Button Recurring Yes'))

    // Select Due Date for Recurring
    selectDueDateForRecurring('Transaction/Non Trade/Field Due Date Recurring', 5)

    // Add Item Details
    WebUI.click(findTestObject('Transaction/Non Trade/Detail Item/Button Add New Row'))
    fillRandomItemDetails()
    WebUI.click(findTestObject('Transaction/Non Trade/Detail Item/Button Submit Detail Item'))
    
    // Scroll down after submitting item details
    WebUI.scrollToElement(findTestObject('Transaction/Non Trade/Section Upload Image/Upload FIle Invoice'), 30)
    
    // Upload files
    uploadFiles()
}

// Function to generate a random name
String generateRandomName() {
    String[] firstNames = ['Henri', 'Budi', 'Ayu', 'Siti', 'Joko', 'Dewi', 'Rahmat', 'Lina', 'Agus', 'Intan']
    String[] lastNames = ['Prasetyo', 'Santoso', 'Wijaya', 'Setiawan', 'Haryanto', 'Putri', 'Susilo', 'Nugroho', 'Yulianti', 'Wahyudi']
    Random random = new Random()
    return firstNames[random.nextInt(firstNames.length)] + ' ' + lastNames[random.nextInt(lastNames.length)]
}

// Function to fill Attention To field
void fillAttentionTo(String attentionTo) {
    if (attentionTo?.trim()) {
        WebUI.setText(findTestObject('Transaction/Non Trade/Field Attention To'), attentionTo)
        WebUI.comment('Field Attention To berhasil diisi dengan nilai: ' + attentionTo)
    } else {
        WebUI.comment('Attention To tidak dapat dikosongkan.')
    }
}

// Function to select date manually
void selectDateManually(String testObjectPath, int delayInSeconds) {
    try {
        WebUI.waitForElementVisible(findTestObject(testObjectPath), 30)
        WebUI.scrollToElement(findTestObject(testObjectPath), 30)
        WebUI.click(findTestObject(testObjectPath))
        WebUI.comment("Silakan pilih tanggal secara manual dalam waktu $delayInSeconds detik.")
        WebUI.delay(delayInSeconds)
    } catch (Exception e) {
        WebUI.comment("Error memilih tanggal pada elemen $testObjectPath: $e.message")
    }
}

// Function to generate a random invoice number
String generateRandomInvoiceNumber() {
    int randomNum = new Random().nextInt(999) + 1
    DecimalFormat df = new DecimalFormat('000')
    return "INV - " + df.format(randomNum)
}

// Function to generate a random email
String generateRandomEmail() {
    String username = UUID.randomUUID().toString().substring(0, 8)
    return "$username@example.com"
}

// Function to fill random item details
void fillRandomItemDetails() {
    String[] items = ['Laptop', 'Mouse', 'Keyboard', 'Monitor', 'Printer', 'Tablet', 'Headphone', 'Smartphone', 'Charger', 'Webcam']
    Random random = new Random()

    String randomItem = items[random.nextInt(items.length)]
    int randomQuantity = random.nextInt(100) + 1
    int randomPrice = random.nextInt(10000000) + 1

    WebUI.setText(findTestObject('Transaction/Non Trade/Detail Item/Field Deskripsi'), randomItem)
    WebUI.setText(findTestObject('Transaction/Non Trade/Detail Item/Field Quantity'), randomQuantity.toString())
    WebUI.setText(findTestObject('Transaction/Non Trade/Detail Item/Field Price'), randomPrice.toString())

    WebUI.comment("Random Item Details: Item: $randomItem, Quantity: $randomQuantity, Price: $randomPrice")
}

// Function to upload files with delay
void uploadFiles() {
    // Define the paths to the upload buttons
    String[] uploadPaths = [
        'Object Repository/Transaction/Non Trade/Section Upload Image/Upload FIle Invoice',
        'Object Repository/Transaction/Non Trade/Section Upload Image/Upload Delivery Order',
        'Object Repository/Transaction/Non Trade/Section Upload Image/Upload Goods',
        'Object Repository/Transaction/Non Trade/Section Upload Image/Upload Others'
    ]
    
    // Iterate over each upload path and call the clickUploadFileButton function
    uploadPaths.each { uploadButtonTestObjectPath ->
        clickUploadFileButton(uploadButtonTestObjectPath)
        
        // Add a delay of 5 seconds after each file upload
        WebUI.delay(5)
    }

    // Click Submit button after uploading all files
    clickUploadFileButton('Object Repository/Transaction/Non Trade/Section Upload Image/Button Submit')
	
	WebUI.click(findTestObject('Transaction/Non Trade/Section Upload Image/Button Ya'))
}

// Function to click upload file button
void clickUploadFileButton(String uploadButtonTestObjectPath) {
    try {
        WebUI.click(findTestObject(uploadButtonTestObjectPath))
        WebUI.comment('Berhasil mengklik tombol upload pada: ' + uploadButtonTestObjectPath)
    } catch (Exception e) {
        WebUI.comment('Terjadi error saat mengklik tombol upload pada: ' + uploadButtonTestObjectPath + ' - ' + e.message)
    }
}

// Function to select the due date for recurring
void selectDueDateForRecurring(String testObjectPath, int delayInSeconds) {
    try {
        WebUI.waitForElementVisible(findTestObject(testObjectPath), 30)
        WebUI.scrollToElement(findTestObject(testObjectPath), 30)
        WebUI.click(findTestObject(testObjectPath))
        WebUI.comment("Silakan pilih tanggal jatuh tempo secara manual dalam waktu $delayInSeconds detik.")
        WebUI.delay(delayInSeconds)
    } catch (Exception e) {
        WebUI.comment("Error memilih tanggal jatuh tempo pada elemen $testObjectPath: $e.message")
    }
}
