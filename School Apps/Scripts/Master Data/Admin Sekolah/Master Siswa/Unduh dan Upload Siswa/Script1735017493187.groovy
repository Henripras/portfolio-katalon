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

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

// Login
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

// Navigasi ke menu "Kelola Siswa"
WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Data Menu'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Filter Dan Search Siswa/Page_Beranda/Sub Menu Kelola Siswa'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Unduh dan Upload Siswa/Button Unduh'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Unduh dan Upload Siswa/Unduh Data Siswa'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Unduh dan Upload Siswa/Button Unduh'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Unduh dan Upload Siswa/Unduh Format File'))

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Unduh dan Upload Siswa/Button Upload'))

// Define the updated file path
String filePath = 'C:\\Users\\henri\\Downloads\\Upload Siswa 5.xlsx'

// Find the Upload File button and click it
WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Unduh dan Upload Siswa/Button Upload File'))

// Check if the file input field is available
TestObject uploadInputField = findTestObject('Master Data/Admin Sekolah/Master Siswa/Upload File Input')

if (uploadInputField != null) {
    WebUI.waitForElementVisible(uploadInputField, 10 // Wait for the file input to be visible
        )

    WebUI.uploadFile(uploadInputField, filePath // Upload the file
        )
} else {
    println('Upload file input field not found!')
}

WebUI.click(findTestObject('Master Data/Admin Sekolah/Master Siswa/Unduh dan Upload Siswa/Button Kirim'))

WebUI.delay(5)

