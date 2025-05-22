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

// Buka browser dan navigasi ke URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat/auto2000cempakaputih')
WebUI.maximizeWindow()

// Scroll ke posisi yang ditentukan
WebUI.scrollToPosition(0, 1412)
WebUI.delay(2)

// Klik "Minta Penawaran AE"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Button Minta Penawaran AE'))
WebUI.delay(3)

// Isi formulir "Minta Penawaran AE"
WebUI.setText(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Input Nama AE'), 'Budi Hartono')
WebUI.setText(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Input No HP AE'), '81296973563')

// Buka daftar model mobil
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Model Mobil AE'))
WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Isi Model Mobil'), 30, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Isi Model Mobil'))
} else {
    WebUI.delay(30)
    WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Model Mobil AE'))
    println('Element not found.')
}

// Isi perkiraan waktu
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Perkiraan Mobil AE'))
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/1-2 Bulan Ae'))

// Centang checkbox
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Checkbox AE'))

// Tutup formulir "Minta Penawaran AE"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Minta Penawaran AE/Close Minta Penawaran AE'))

// Navigasi melalui slider
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Slider Kanan AE'))
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Slider Kiri AE'))
WebUI.delay(2)

// Klik "Lihat Semua AE"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/Button Lihat Semua AE'))
WebUI.waitForPageLoad(5)

// Scroll ke posisi yang ditentukan
WebUI.scrollToPosition(0, 8584)

// Klik "Lihat Selengkapnya AE"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/AE Listing/Lihat Selengkapnya AE'))

// Klik "Lihat Lebih Sedikit AE"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/AE Listing/Lihat Lebih Sedikit AE'))

// Scroll ke posisi yang ditentukan
WebUI.scrollToPosition(0, 8959)

// Buka FAQ
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Section Ingin Konsultasi/AE Listing/FAQ Open AE'))

// Kembali ke halaman sebelumnya
WebUI.back()

