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
import org.openqa.selenium.WebDriver.Navigation as Navigation
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pre.auto2000.co.id/mobil-baru-toyota/p/agya')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.scrollToPosition(0, 1248)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Lihat Detail Interior'))

WebUI.delay(3)

String previousUrl = WebUI.getUrl()

int maxTries = 5

int currentTry = 0

while (currentTry < maxTries) {
    WebUI.back()

    if (WebUI.getUrl() != previousUrl) {
        break
    }
    
    currentTry++

    if (currentTry >= maxTries) {
        println("Tidak bisa kembali ke halaman sebelumnya setelah $maxTries percobaan.")
    } else {
        WebUI.delay(2)
    }
}

//WebUI.back()
WebUI.delay(2)

WebUI.scrollToPosition(0, 1247)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Next Interior'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Prev Interior'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 1725)

// Klik tombol "Lihat Detail Eksterior"
WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Lihat Detail Eksterior'))

// Tunda selama 3 detik
WebUI.delay(3)

// Kembali ke halaman sebelumnya
//WebUI.back()
int maxAttempts = 1

boolean success = false

for (int i = 0; i < maxAttempts; i++) {
    // Kembali ke halaman sebelumnya
    WebUI.back()

    // Validasi apakah berhasil kembali ke halaman sebelumnya
    if (WebUI.getUrl().equals('pre.auto2000.co.id/mobil-baru-toyota/p/agya')) {
        println('Berhasil kembali ke halaman sebelumnya.')

        success = true

        break
    } else {
        println('Gagal kembali ke halaman sebelumnya. Melakukan percobaan ke-' + (i + 1))

        WebUI.delay(3)
    }
}

WebUI.delay(2)

WebUI.scrollToPosition(0, 1733)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Next Eksterior'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Prev Eksterior'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 2208)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Dimensi'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Dimensi'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Mesin'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Mesin'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Chassis'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Chassis'))

WebUI.scrollToPosition(0, 2427)

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Fitur Keamanan'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Fitur Keamanan'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Fitur Kenyamanan'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Fitur Kenyamanan'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Informasi Lainnya'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Informasi Lainnya'))

WebUI.delay(2)

//WebUI.scrollToElement(findTestObject('NCP/PDP NCP/OVERVIEW/Desain Interior/Interior Informasi Lainnya'), 0)
WebUI.scrollToPosition(0, 2898)

//WebUI.scrollToPosition(0, 3000)
WebUI.mouseOver(findTestObject('NCP/PDP NCP/OVERVIEW/Button Play Video'))

WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/Button Play Video'))

WebUI.delay(10)

