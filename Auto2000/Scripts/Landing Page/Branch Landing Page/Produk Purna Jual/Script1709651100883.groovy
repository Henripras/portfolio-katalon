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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

// Buka browser
WebUI.openBrowser('')

// Navigasi ke URL
WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat/auto2000cempakaputih')

// Maksimalkan jendela
WebUI.maximizeWindow()

// Tunggu hingga halaman selesai dimuat
WebUI.waitForPageLoad(10)

// Scroll ke posisi
WebUI.scrollToElement(findTestObject('Branch Landing Page/Produk Purna Jual/Scroll To Position'), 0)

// Verifikasi dan fokus pada elemen
TestObject targetElement = findTestObject('Branch Landing Page/Produk Purna Jual/Scroll To Position')

WebUI.scrollToElement(targetElement, 0)

WebUI.delay(1)

WebUI.focus(targetElement)

// Verifikasi teks
WebUI.verifyTextPresent('PRODUK PURNA JUAL TOYOTA AUTO2000 CEMPAKA PUTIH', false)

WebUI.verifyTextPresent('PAKET SERVIS', false)

// Klik "Paket Servis"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Button Paket Servis'))

WebUI.delay(2)

WebUI.back()

// Verifikasi dan klik "Kupon Servis"
WebUI.verifyTextPresent('KUPON SERVIS', false)

WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Button Kupon Servis'))

WebUI.delay(2)

WebUI.back()

// Scroll dan verifikasi "Layanan Bengkel"
WebUI.scrollToElement(findTestObject('Branch Landing Page/Produk Purna Jual/Scroll To Layanan Bengkel'), 0)

WebUI.verifyTextPresent('LAYANAN BENGKEL', false)

WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Button Layanan Bengkel'))

WebUI.delay(3)

// Isi formulir "Layanan Bengkel"
WebUI.setText(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Nama LB'), 'Budi Hartono')

WebUI.clearText(findTestObject('Branch Landing Page/Produk Purna Jual/Layanan Bengkel/No Hp LB'))

WebUI.setText(findTestObject('Branch Landing Page/Produk Purna Jual/Layanan Bengkel/No Hp LB'), '81296913674')

WebUI.setText(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Email LB'), 'budihartono@gmail.com')

// Pilih jenis mobil
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Jenis Mobil LB'))

WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Isi Mobil LB'), 
    30, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Isi Mobil LB'))
} else {
    WebUI.delay(30)

    WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Jenis Mobil LB'))

    println('Element not found.')
}

// Isi Nopol dan pilih waktu
WebUI.setText(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Nopol LB'), 'B3155SYK')

WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Pilih Waktu LB'))

WebUI.delay(3)

String strDate = '31'

WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Date LB/Tanggal', [('date') : strDate]))

WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Date LB/Jam'))

WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Date LB/Button Simpan LB'))

WebUI.delay(3)

// Tutup pop-up "Layanan Bengkel"
WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Layanan Bengkel/Close Pop Up LB'))

// Scroll dan verifikasi "Aksesoris"
WebUI.scrollToElement(findTestObject('Branch Landing Page/Produk Purna Jual/Scroll To Position'), 0)

WebUI.verifyTextPresent('AKSESORIS', false)

WebUI.click(findTestObject('Object Repository/Branch Landing Page/Produk Purna Jual/Button Aksesoris'))

WebUI.delay(2)

WebUI.back()

