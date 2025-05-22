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

// Mulai sesi browser dan buka URL login
WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit.siprusedu.com/login')

// Login ke aplikasi
WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Field Email'), 'admin.gudangsolusi@digiform.co.id')

WebUI.setText(findTestObject('Master Data/Admin Sekolah/Login/Input Password'), 'Test1234')

WebUI.click(findTestObject('Master Data/Admin Sekolah/Login/Button Submit'))

WebUI.click(findTestObject('Delete/Menu User Management'))

// Fungsi untuk menghapus data dengan melakukan looping
// Klik tombol aksi untuk membuka opsi penghapusan
// Klik tombol hapus
// Tunggu beberapa detik jika diperlukan untuk memastikan proses penghapusan selesai
// (Opsional) Verifikasi bahwa data telah dihapus
// WebUI.verifyElementNotPresent(findTestObject('Delete/SomeElement'), 5)  // Misalnya untuk memastikan elemen tidak ada lagi setelah dihapus
// Panggil fungsi untuk menghapus 100 data
deleteMultipleData(247)

def deleteMultipleData(int numberOfData) {
    for (int i = 1; i <= numberOfData; i++) {
        WebUI.click(findTestObject('Delete/Button Action'))

        WebUI.click(findTestObject('Delete/Button Delete'))

        WebUI.click(findTestObject('Delete/Button Ya'))

        WebUI.delay(1)

        println("Data ke-$i telah dihapus.")
    }
}

