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

// Navigate to the URL
WebUI.navigateToUrl('https://staging-otsukaportal.aio.co.id:31564')

// Login
WebUI.setText(findTestObject('Login/Field Email'), 'henriprasetyo220@gmail.com')

WebUI.setText(findTestObject('Login/Field Password'), 'Admin.123')

WebUI.click(findTestObject('Login/Button Submit Email Password'))

// Input OTP
(1..6).each({ def index ->
        WebUI.setText(findTestObject("Login/OTP Page/Kode OTP $index"), '1')
    })

WebUI.click(findTestObject('Login/Button Submit OTP'))

WebUI.click(findTestObject('Dashboard/Menu Transaksi'))

WebUI.click(findTestObject('Transaction/Approval/Sub Menu Approval'))

// Fungsi untuk mengatur filter
def applyFilter(String amountFrom, String amountTo, String termsFrom, String termsTo) {
    WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Button Filter'))
    WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Radio Button Non Trade'))
    WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Radio Button Trade'))
    WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Dropdown Currency'))
    WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Value Dropdown Currency'))
    WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Dropdown Company'))
    WebUI.setText(findTestObject('Transaction/Approval/Filter Approval/Field Amount From'), amountFrom)
    WebUI.setText(findTestObject('Transaction/Approval/Filter Approval/Field Amount To'), amountTo)
    WebUI.setText(findTestObject('Transaction/Approval/Filter Approval/Filed Terms From'), termsFrom)
    WebUI.setText(findTestObject('Transaction/Approval/Filter Approval/Filed Terms To'), termsTo)
    WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Button Submit Filter'))
}

// Panggil fungsi untuk menerapkan filter
applyFilter('1000000', '100000000000', '10', '1000')

// Tambahkan jeda
WebUI.delay(2)

// Reset filter
WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Button Filter'))
WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Button Reset Filter'))
WebUI.click(findTestObject('Transaction/Approval/Filter Approval/Button Submit Filter'))


// Daftar elemen sorting
List<TestObject> sortingOptions = [
    findTestObject('Transaction/Approval/Sorting Payment/Due Date Newest To Oldest'),
    findTestObject('Transaction/Approval/Sorting Payment/Due Date Oldest To Newest'),
    findTestObject('Transaction/Approval/Sorting Payment/Currency A-Z'),
    findTestObject('Transaction/Approval/Sorting Payment/Currency Z-A'),
    findTestObject('Transaction/Approval/Sorting Payment/PO A-Z'),
    findTestObject('Transaction/Approval/Sorting Payment/PO Z-A'),
    findTestObject('Transaction/Approval/Sorting Payment/Terms A-Z'),
    findTestObject('Transaction/Approval/Sorting Payment/Terms Z-A')
]

// Klik tombol sorting dan opsi sorting secara berurutan
WebUI.click(findTestObject('Transaction/Approval/Sorting Payment/Button Sorting'))

for (TestObject option : sortingOptions) {
    WebUI.click(option)
}

// Klik tombol submit sorting
WebUI.click(findTestObject('Transaction/Approval/Sorting Payment/Button Submit Sorting'))

// Tambahkan jeda
WebUI.delay(3)

// Reset sorting
WebUI.click(findTestObject('Transaction/Approval/Sorting Payment/Button Sorting'))
WebUI.click(findTestObject('Transaction/Approval/Sorting Payment/Button Reset Sorting'))
WebUI.click(findTestObject('Transaction/Approval/Sorting Payment/Button Submit Sorting'))
