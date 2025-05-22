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

// Function to generate a random name
// Defining lists for first and last names
// Select a random first name and last name from the list
// Function to generate random account number
// Function to clear text from a field until it is empty
// Function to input an account number into the field
// Function to select ownership from the dropdown
// Test case starts here
WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sit.siprusedu.com/login', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Tagihan/Master Data Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Menu Akun Bank'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Button Tambah Akun Bank'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Tambah Akun Bank/Dropdown Pilih Nama Bank'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Tambah Akun Bank/Pilih Dropdown Nama Bank'), FailureHandling.CONTINUE_ON_FAILURE)

// Generating a random name
String randomName = generateRandomName()

println('Generated random name: ' + randomName)

// Use the generated name for the account holder's name
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Akun Bank/Tambah Akun Bank/Set Text Nama Rekening'), randomName, 
    FailureHandling.CONTINUE_ON_FAILURE)

// Generating random account numbers with a maximum of 10 digits
List<String> nomorRekeningList = []

// Generate 5 random account numbers and add them to the list
for (int i = 0; i < 5; i++) {
    nomorRekeningList.add(generateRandomAccountNumber(10 // Generates a 10-digit account number
            ))
}

boolean isErrorPresent = true

// Try alternative account numbers
for (String nomorRekening : nomorRekeningList) {
    inputNomorRekening(nomorRekening)

    pilihKepemilikanDropdown()

    WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Tambah Akun Bank/Button Submit'), FailureHandling.CONTINUE_ON_FAILURE)

    // Check if error is present
    isErrorPresent = WebUI.verifyTextPresent('Nomor rekening sudah terdaftar', false, FailureHandling.OPTIONAL)

    if (!(isErrorPresent)) {
        WebUI.verifyElementVisible(findTestObject('Master Data/Admin Sekolah/Akun Bank/Akun Bank Dashboard'), FailureHandling.CONTINUE_ON_FAILURE)

        break
    }
}

// Final validation
if (isErrorPresent) {
    WebUI.comment('Semua nomor rekening yang dicoba sudah terdaftar. Silakan gunakan nomor rekening baru.')
} else {
    WebUI.comment('Nomor rekening berhasil didaftarkan.')
}

String generateRandomName() {
    List<String> firstNames = ['John', 'Jane', 'Michael', 'Sarah', 'David', 'Emily', 'Rafael', 'Sophia']

    List<String> lastNames = ['Doe', 'Smith', 'Johnson', 'Williams', 'Brown', 'Davis', 'Taylor', 'Wilson']

    Random random = new Random()

    String firstName = firstNames[random.nextInt(firstNames.size())]

    String lastName = lastNames[random.nextInt(lastNames.size())]

    return (firstName + ' ') + lastName
}

String generateRandomAccountNumber(int length) {
    Random random = new Random()

    StringBuilder accountNumber = new StringBuilder()

    for (int i = 0; i < length; i++) {
        accountNumber.append(random.nextInt(10))
    }
    
    return accountNumber.toString()
}

void clearTextUntilEmpty(TestObject field, int maxAttempts = 5) {
    int attempt = 0

    while (attempt < maxAttempts) {
        WebUI.clearText(field, FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.delay(0.5)

        String currentText = WebUI.getAttribute(field, 'value', FailureHandling.CONTINUE_ON_FAILURE)

        if (currentText.isEmpty()) {
            WebUI.comment(('Field berhasil dikosongkan setelah ' + (attempt + 1)) + ' percobaan.')

            break
        }
        
        attempt++

        if (attempt == maxAttempts) {
            WebUI.comment(('Field tidak bisa dikosongkan setelah ' + maxAttempts) + ' percobaan.')
        }
    }
}

void inputNomorRekening(String nomorRekening) {
    TestObject fieldNomorRekening = findTestObject('Master Data/Admin Sekolah/Akun Bank/Tambah Akun Bank/Set Text Nomor Rekening')

    clearTextUntilEmpty(fieldNomorRekening)

    WebUI.setText(fieldNomorRekening, nomorRekening)
}

void pilihKepemilikanDropdown() {
    WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Tambah Akun Bank/Dropdown Kepemilikan'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Master Data/Admin Sekolah/Akun Bank/Tambah Akun Bank/Pilih Dropdown Kepemilikan'), FailureHandling.CONTINUE_ON_FAILURE)
}

