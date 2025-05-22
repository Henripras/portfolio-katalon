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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

// Buka browser dan navigasi ke URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat/auto2000cempakaputih')
WebUI.maximizeWindow()

// Tunggu hingga halaman selesai dimuat
WebUI.waitForPageLoad(5)

// Klik Dropdown Cabang
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Atas/Dropdown Branch'))
WebUI.delay(2)

// Klik Booking Servis
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Atas/Button Booking Servis'))
WebUI.delay(3)

// Kembali ke halaman sebelumnya
WebUI.back()

// Klik tombol Minta Penawaran
WebUI.click(findTestObject('Branch Landing Page/Section Atas/Button Minta Penawaran'))
WebUI.delay(3)

// Isi nama
WebUI.setText(findTestObject('Object Repository/Branch Landing Page/Section Atas/Field Nama'), 'Budi Hartono')

// Buka dropdown Model Mobil
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Atas/Field Model Mobil'))
WebUI.delay(5)

// Isi Model Mobil jika elemen ada, jika tidak klik ulang dropdown
if (WebUI.verifyElementPresent(findTestObject('Branch Landing Page/Section Atas/Isi Model Mobil'), 30, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Branch Landing Page/Section Atas/Isi Model Mobil'))
} else {
    WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Atas/Field Model Mobil'))
    println('Element not found.')
}

// Ceklis Checkbox
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Atas/Checkbox'), FailureHandling.OPTIONAL)
WebUI.delay(10)

// Tutup form Minta Penawaran
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Atas/Close Minta Penawaran'))

// Scroll ke posisi yang ditentukan
WebUI.scrollToPosition(0, 1000)
WebUI.delay(2)

// Tunggu hingga halaman selesai dimuat
WebUI.waitForPageLoad(5)
