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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.model.FailureHandling as FailureHandling

// Open Browser
WebUI.openBrowser('')

// Navigate to URL
WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat/auto2000cempakaputih')

// Maximize Window
WebUI.maximizeWindow()

// Tunggu hingga halaman selesai dimuat
WebUI.waitForPageLoad(10)

// Scroll To Position
WebUI.scrollToPosition(0, 1750)

// Buat TestObject dinamis untuk section
TestObject sectionToCheck = new TestObject('dynamicSection')
sectionToCheck.addProperty('xpath', ConditionType.EQUALS, "//section[@class='border-b-[5px] py-4 md:py-16 border-reliableBlack5 lg:border-reliableBlack10']")

// Verifikasi apakah section muncul
boolean sectionExists = WebUI.waitForElementVisible(sectionToCheck, 10, FailureHandling.OPTIONAL)

if (sectionExists) {
    // Jika section ada, lanjutkan ke langkah berikutnya
    WebUI.mouseOver(findTestObject('Object Repository/Branch Landing Page/Katalog Mobil Baru/Hover Effect Lihat Detail'))

    WebUI.click(findTestObject('Object Repository/Branch Landing Page/Katalog Mobil Baru/Card 1'))

    // Tunggu hingga halaman selesai dimuat
    WebUI.waitForPageLoad(10)

    WebUI.delay(3)

    // Kembali ke halaman sebelumnya
    WebUI.back()

    WebUI.scrollToElement(findTestObject('Object Repository/Branch Landing Page/Katalog Mobil Baru/Scroll Katalog Mobil Baru'), 0)

    // Klik "Lihat Semua Mobil Baru"
    WebUI.click(findTestObject('Object Repository/Branch Landing Page/Katalog Mobil Baru/Lihat Semua MB'))

    // Tunggu hingga halaman selesai dimuat
    WebUI.waitForPageLoad(10)

    // Kembali ke halaman sebelumnya
    WebUI.back()
} else {
    WebUI.comment('Section mobil baru tidak ditemukan')
}

// Tutup Browser
WebUI.closeBrowser()

