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

WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota')

WebUI.maximizeWindow()

//WebUI.click(findTestObject('Salesman Object/Dealer toyota'))
WebUI.scrollToPosition(0, 244)

WebUI.delay(2)

//WebUI.verifyElementVisible(findTestObject('Location Map'))
WebUI.click(findTestObject('Salesman Object/Cempaka Putih'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 1104)

WebUI.delay(2)

WebUI.click(findTestObject('Salesman Object/span_Lihat Semua'))

WebUI.delay(5)

WebUI.click(findTestObject('Salesman Object/Rizaldi Salesman'))

WebUI.click(findTestObject('Salesman Object/Button Penawaran'))

WebUI.delay(3)

WebUI.setText(findTestObject('Salesman Object/Nama Customer'), 'Budi Hartono')

WebUI.setText(findTestObject('Salesman Object/Nomer Customer'), '819')

WebUI.clearText(findTestObject('Salesman Object/Nomer Customer'))

WebUI.setText(findTestObject('Salesman Object/Nomer Customer'), '81934158282')

WebUI.delay(2)

WebUI.click(findTestObject('Salesman Object/Jenis Mobil'))

WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('Salesman Object/Tipe Mobil'), 10, FailureHandling.OPTIONAL)) {
    // Step 2: If the element exists, click on it
    WebUI.click(findTestObject('Salesman Object/Tipe Mobil')) // Add any additional steps you want to perform after clicking the element
    // Add a failure message or alternative steps if the element does not exist
} else {
    WebUI.delay(30)

    WebUI.click(findTestObject('Salesman Object/Jenis Mobil'))

    println('Element not found.')
}

WebUI.delay(2)

WebUI.click(findTestObject('Salesman Object/Waktu Perkiraan'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Salesman Object/Waktu Perkiraan Mobil'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Salesman Object/Robot Ceklis'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Salesman Object/Robot Close Inquiry'), FailureHandling.OPTIONAL)

