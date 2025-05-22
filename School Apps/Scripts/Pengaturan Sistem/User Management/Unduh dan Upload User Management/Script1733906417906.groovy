import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
// Membuka browser dan menavigasi ke URL login
// Login
// Mengakses menu User Management
// Mengunduh template User Management
// Klik tombol untuk membuka dialog upload file
import java.io.File as File

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Tambah User Management/Menu User Management'))

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Unduh dan Upload User Management/Button Unduh'))

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Unduh dan Upload User Management/Button Upload'))

WebUI.click(findTestObject('Pengaturan Sistem/User Managemet/Unduh dan Upload User Management/Unggah File'))

// Path file Excel yang ingin diupload
String excelUserManagement = 'C:\\\\Users\\\\user\\\\Bulk.xlsx'

println('File path: ' + excelUserManagement)

// Periksa jika file path valid dan dapat diakses
if (new File(excelUserManagement).exists()) {
    TestObject inputFile = findTestObject('Pengaturan Sistem/User Managemet/Unduh dan Upload User Management/Input File')

    if (inputFile != null) {
        WebUI.uploadFile(inputFile, excelUserManagement)

        println('File berhasil diupload.')
    } else {
        println('Test Object tidak ditemukan. Periksa lokasi di Object Repository.')
    }
} else {
    println('File tidak ditemukan di path: ' + excelUserManagement)
}

// Tutup browser
WebUI.closeBrowser()

