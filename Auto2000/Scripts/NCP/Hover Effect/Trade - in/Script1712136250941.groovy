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

WebUI.navigateToUrl('https://pre.auto2000.co.id/c/mobil-baru-toyota')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.scrollToPosition(0, 197)

WebUI.mouseOver(findTestObject('Object Repository/NCP/hover effect/Page_Daftar Harga Mobil Baru Toyota Indones_71eda5/a_LIHAT DETAIL'))

WebUI.delay(3)

try {
    if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Trade-In'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')

        WebUI.click(findTestObject('NCP/hover effect/Trade-In'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

WebUI.scrollToPosition(0, 158)

WebUI.delay(5)

try {
    if (WebUI.waitForElementVisible(findTestObject('Object Repository/NCP/hover effect/Pop Up Lokasi'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')

        WebUI.click(findTestObject('Object Repository/NCP/hover effect/Pop Up Lokasi Close'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

WebUI.delay(3)

WebUI.scrollToPosition(0, 158)

try {
    if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Button Merek'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')

        WebUI.click(findTestObject('NCP/hover effect/Button Merek'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

try {
    if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Merek Mobil'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')

        WebUI.click(findTestObject('NCP/hover effect/Merek Mobil'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

WebUI.delay(3)

WebUI.scrollToPosition(0, 158)

try {
    if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Button Model Mobil'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')

        WebUI.click(findTestObject('NCP/hover effect/Button Model Mobil'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

WebUI.delay(3)

WebUI.click(findTestObject('NCP/hover effect/Model Mobil'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 158)

try {
    if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Cylinder'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')

        WebUI.click(findTestObject('NCP/hover effect/Cylinder'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

try {
    if (WebUI.waitForElementVisible(findTestObject('NCP/hover effect/Silinder Mobil'), 0)) {
        WebUI.comment('Elemen ini terlihat dan dapat di klik')

        WebUI.click(findTestObject('NCP/hover effect/Silinder Mobil'), FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.comment('Elemen tidak terlihat dan tidak dapat di klik')
    }
}
catch (Exception e) {
    WebUI.comment("Terjadi kesalahan saat klik element: $e.message")
} 

WebUI.delay(5)

WebUI.click(findTestObject('NCP/hover effect/Tipe Mobil'))

WebUI.click(findTestObject('NCP/hover effect/Car Type'))

WebUI.delay(3)

WebUI.click(findTestObject('NCP/hover effect/Transmisi'))

WebUI.click(findTestObject('NCP/hover effect/Jenis Transmisi'))

WebUI.delay(3)

WebUI.click(findTestObject('NCP/hover effect/Tahun Pembuatan'))

WebUI.click(findTestObject('NCP/hover effect/Tahun Terbit Pembuatan'))

WebUI.delay(3)

WebUI.click(findTestObject('NCP/hover effect/Bahan bakar'))

WebUI.click(findTestObject('NCP/hover effect/Jenis Bahan Bakar'))

WebUI.delay(3)

WebUI.click(findTestObject('NCP/hover effect/Sistem Penggerak Mobil'))

WebUI.click(findTestObject('NCP/hover effect/Jenis Penggerak mobil'))

WebUI.scrollToPosition(0, 573)

//WebUI.click(findTestObject('NCP/hover effect/Provinsi Tradein'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('NCP/hover effect/City Tradein'))
WebUI.delay(5)

WebUI.setText(findTestObject('NCP/hover effect/Name Tradein'), 'ibnu')

WebUI.setText(findTestObject('NCP/hover effect/Number Tradein'), '81934158282')

WebUI.setText(findTestObject('NCP/hover effect/Email Tradein'), 'ibnualdi3004@gmail.com')

WebUI.delay(2)

