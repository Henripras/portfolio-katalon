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
import org.openqa.selenium.WebDriver as WebDriver

// Buka browser dan navigasi ke URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat/auto2000cempakaputih')
WebUI.maximizeWindow()

// Tunggu hingga halaman selesai dimuat
WebUI.waitForPageLoad(5)

// Scroll ke posisi yang ditentukan
WebUI.scrollToElement(findTestObject('Branch Landing Page/Event Branch/Scroll Position'), 0)

// Verifikasi teks pada elemen "Event Auto2000 Cempaka Putih"
WebUI.verifyTextPresent('EVENT AUTO2000 CEMPAKA PUTIH', false)

// Verifikasi teks pada tombol "Lihat Semua Event"
WebUI.verifyTextPresent('LIHAT SEMUA', false)
WebUI.delay(2)

// Klik tombol "Lihat Semua Event"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Event Branch/Button Lihat Semua Event'))
WebUI.delay(2)

// Klik detail event
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Event Branch/Detail Event'))
WebUI.waitForPageLoad(5)
WebUI.delay(3)

// Isi nama pada formulir "Minta Penawaran"
WebUI.setText(findTestObject('Object Repository/Branch Landing Page/Event Branch/Minta Penawaran Event Branch/Field Nama'), 'Budi Hartono')

// Isi nomor handphone pada formulir "Minta Penawaran"
WebUI.setText(findTestObject('Object Repository/Branch Landing Page/Event Branch/Minta Penawaran Event Branch/Field No Hp'), '812748365449')

// Scroll ke posisi yang ditentukan
WebUI.scrollToPosition(0, 400)

// Verifikasi teks dan buka dropdown "Model Mobil"
WebUI.verifyTextPresent('Model Mobil', false)
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Event Branch/Minta Penawaran Event Branch/Field Model Mobil'))
WebUI.delay(5)

// Pilih model mobil
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Event Branch/Minta Penawaran Event Branch/Isi Model Mobil'))
WebUI.delay(5)

// Verifikasi teks pada elemen "Provinsi" dan "Kota"
WebUI.verifyTextPresent('Provinsi', false)
WebUI.verifyTextPresent('Kota', false)

// Centang checkbox pada formulir "Minta Penawaran"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Event Branch/Minta Penawaran Event Branch/Checkbox Event'))

