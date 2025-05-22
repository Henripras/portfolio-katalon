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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564')

WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo210@gmail.com')

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123')

WebUI.click(findTestObject('Login/Button Submit Email Password'))

// Isi kode OTP
(1..6).each { index ->
    WebUI.setText(findTestObject("Login/OTP Page/Kode OTP ${index}"), '1')
}

// Klik tombol submit OTP
WebUI.click(findTestObject('Login/Button Submit OTP'))

WebUI.click(findTestObject('Dashboard/Menu Payment'))

WebUI.click(findTestObject('Payment/Filter Payment/Button Filter'))

WebUI.click(findTestObject('Payment/Filter Payment/Radio Button Non Trade'))

WebUI.click(findTestObject('Payment/Filter Payment/Radio Button Trade'))

WebUI.click(findTestObject('Payment/Filter Payment/Dropdown Currency'))

WebUI.click(findTestObject('Payment/Filter Payment/Value Dropdown Currency'))

WebUI.click(findTestObject('Payment/Filter Payment/Dropdown Company'))

WebUI.setText(findTestObject('Payment/Filter Payment/Field Amount From'), '1000')

WebUI.setText(findTestObject('Payment/Filter Payment/Field Amount To'), '100000000000')

WebUI.setText(findTestObject('Payment/Filter Payment/Filed Terms From'), '10')

WebUI.setText(findTestObject('Payment/Filter Payment/Filed Terms To'), '1000')

WebUI.click(findTestObject('Payment/Filter Payment/Button Submit Filter'))

WebUI.click(findTestObject('Payment/Filter Payment/Button Filter'))

WebUI.click(findTestObject('Payment/Filter Payment/Button Reset Filter'))

WebUI.click(findTestObject('Payment/Filter Payment/Button Submit Filter'))

// Daftar objek yang akan diklik
def sortingOptions = [
    'PO A-Z', 'PO Z-A',
    'Due Date Newest To Oldest', 'Due Date Oldest To Newest',
    'Currency A-Z', 'Currency Z-A',
    'Terms A-Z', 'Terms Z-A'
]

// Klik tombol sorting
WebUI.click(findTestObject('Payment/Sorting Payment/Button Sorting'))

// Klik semua opsi sorting
sortingOptions.each { option ->
    WebUI.click(findTestObject("Payment/Sorting Payment/${option}"))
}
