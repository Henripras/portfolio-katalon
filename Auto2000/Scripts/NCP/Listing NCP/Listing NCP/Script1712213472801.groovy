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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pre.auto2000.co.id/c/mobil-baru-toyota')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Kategori NCP/Hatchback'))

WebUI.waitForElementVisible(findTestObject('NCP/Mobil/Agya'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('NCP/Mobil/Agya'))) {
    println('Mobil tersebut muncul')
} else {
    println('Mobil tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Kategori NCP/Hybrid'))

WebUI.waitForElementVisible(findTestObject('NCP/Mobil/Innova Zenix'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('NCP/Mobil/Innova Zenix'))) {
    //println('Mobil tersebut muncul')
} else {
    //println('Mobil tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Kategori NCP/Komersial'))

WebUI.waitForElementVisible(findTestObject('NCP/Mobil/Dyna'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('NCP/Mobil/Dyna'))) {
    println('Mobil tersebut muncul')
} else {
    println('Mobil tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Kategori NCP/MPV'))

WebUI.waitForElementVisible(findTestObject('NCP/Mobil/Alphard'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('NCP/Mobil/Alphard'))) {
    println('Mobil tersebut muncul')
} else {
    println('Mobil tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Kategori NCP/SUV'))

WebUI.waitForElementVisible(findTestObject('NCP/Mobil/Fortuner'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('NCP/Mobil/Fortuner'))) {
    println('Mobil tersebut muncul')
} else {
    println('Mobil tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Kategori NCP/Sedan'))

WebUI.waitForElementVisible(findTestObject('NCP/Mobil/Altis'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('NCP/Mobil/Altis'))) {
    println('Mobil tersebut muncul')
} else {
    println('Mobil tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Kategori NCP/Sports'))

WebUI.waitForElementVisible(findTestObject('NCP/Mobil/Supra'), 20, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('NCP/Mobil/Supra'))) {
    println('Mobil tersebut muncul')
} else {
    println('Mobil tersebut tidak muncul')
}

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Kategori NCP/Semua'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 161)

WebUI.delay(2)

WebUI.scrollToPosition(0, 544)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1454)

WebUI.delay(2)

WebUI.scrollToPosition(0, 2112)

WebUI.delay(2)

WebUI.scrollToPosition(0, 2478)

WebUI.delay(2)

WebUI.click(findTestObject('NCP/Listing NCP/Lihat Selengkapnya'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 2729)

WebUI.click(findTestObject('NCP/Listing NCP/FAQ'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 3058)

