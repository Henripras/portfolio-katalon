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

// Function to clear the field (CTRL + A and DELETE)
// CTRL + A
// DELETE
// Function to generate random phone number (max 13 digits)
// Adding random digits (maximum 13 digits)
// Function to generate random full name
// Function to generate random email based on first and last name
// First name in lowercase
// Last name in lowercase
// Adding 3 random digits at the end
// Adding domain to the email
// Start of the main script
// Open browser and navigate to the URL
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://goohalal.ihtekno.tech/login')

// Fungsi untuk klik dengan waktu tunggu opsional
def clickWithTimeout(Optional<Integer> timeout = Optional.of(3000)) {
    try {
        // Jika timeout diberikan (dalam milidetik), maka tunggu sebelum melakukan klik
        if (timeout.isPresent()) {
            WebUI.delay(timeout.get() / 1000)  // delay dalam detik
        }
        
        // Melakukan klik pada objek
        WebUI.click(findTestObject('Existing To Sihalal/Pop Up Chrome Later Subscription'))
    } catch (Exception e) {
        println("Error: ${e.message}")
    }
}

// Memanggil fungsi dengan waktu tunggu 3 detik (opsional)
clickWithTimeout(Optional.of(3000))

// Memanggil fungsi tanpa waktu tunggu (langsung klik)
clickWithTimeout(Optional.empty())

WebUI.click(findTestObject('Login/Field Dropdown Masuk Sebagai'))

WebUI.click(findTestObject('Pendamping Halal/Value Masuk Sebagai Pendamping Halal'))

WebUI.click(findTestObject('Login/Button Konfirmasi Masuk Sebagai'))

WebUI.click(findTestObject('Login/Button Masuk To Login Page'))

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.setText(findTestObject('Login/Field Email Login'), '081279699119')

WebUI.click(findTestObject('Login/Field Password Login'))

WebUI.setText(findTestObject('Login/Field Password Login'), 'Admin.123')

WebUI.click(findTestObject('Login/Field Email Login'))

WebUI.click(findTestObject('Login/Button Masuk Login'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Pendamping Halal/Homepage/Button Mengerti Pop Up Informasi'))

WebUI.click(findTestObject('Pendamping Halal/Homepage/Menu Sertifikasi'))

WebUI.click(findTestObject('Pendamping Halal/Homepage/Sub Menu Profile Pendamping Halal'))

WebUI.delay(2)

// Clearing and filling email field with random email
WebUI.click(findTestObject('Pendamping Halal/Page Profile Pendamping Halal/Field Email'))

clearField(findTestObject('Pendamping Halal/Page Profile Pendamping Halal/Field Email'))

String randomEmail = generateRandomEmail('Fajar', 'Sukmara')

WebUI.setText(findTestObject('Pendamping Halal/Page Profile Pendamping Halal/Field Email'), randomEmail)

// Clearing and filling name field with random full name
WebUI.click(findTestObject('Pendamping Halal/Page Profile Pendamping Halal/Field Nama Lengkap'))

clearField(findTestObject('Pendamping Halal/Page Profile Pendamping Halal/Field Nama Lengkap'))

String randomName = generateRandomFullName()

WebUI.setText(findTestObject('Pendamping Halal/Page Profile Pendamping Halal/Field Nama Lengkap'), randomName)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

def clearField(TestObject testObject) {
    WebUI.sendKeys(testObject, Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(testObject, Keys.chord(Keys.DELETE))
}

def generateRandomFullName() {
    String[] firstNames = ['Andi', 'Budi', 'Citra', 'Dewi', 'Eka', 'Farhan', 'Gita', 'Hendra', 'Indah', 'Joko']

    String[] lastNames = ['Pratama', 'Sutrisno', 'Raharjo', 'Tirta', 'Sari', 'Kusuma', 'Aditya', 'Wijaya', 'Putri', 'Mulyani']

    Random rand = new Random()

    String firstName = firstNames[rand.nextInt(firstNames.length)]

    String lastName = lastNames[rand.nextInt(lastNames.length)]

    return (firstName + ' ') + lastName
}

def generateRandomEmail(String firstName, String lastName) {
    StringBuilder email = new StringBuilder()

    Random rand = new Random()

    email.append(firstName.toLowerCase())

    email.append(lastName.toLowerCase())

    for (int i = 0; i < 3; i++) {
        email.append(rand.nextInt(10))
    }
    
    email.append('@example.com')

    return email.toString()
}

