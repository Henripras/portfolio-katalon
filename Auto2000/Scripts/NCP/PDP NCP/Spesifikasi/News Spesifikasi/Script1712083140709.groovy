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

WebUI.navigateToUrl('https://pre.auto2000.co.id/mobil-baru-toyota/p/agya/spesifikasi')

WebUI.waitForPageLoad(2)

WebUI.scrollToPosition(0, 950)

WebUI.click(findTestObject('NCP/PDP NCP/SPESIFIKASI/News/Lihat Semua News'))

WebUI.waitForPageLoad(2)

WebUI.doubleClick(findTestObject('NCP/PDP NCP/SPESIFIKASI/News/Listing News/Scroll Ke Bawah'))

WebUI.click(findTestObject('NCP/PDP NCP/SPESIFIKASI/News/Listing News/Konten Card'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Promosi Nasional/Promo Semua/Section Inquiry Form'), 10, 
    FailureHandling.OPTIONAL)) {
    // Jika Inquiry Form ada, lanjut ke langkah selanjutnya
    WebUI.comment('Inquiry Form ditemukan. Lanjut ke langkah selanjutnya.' // Jika Inquiry Form tidak ada, kembali ke halaman sebelumnya
        )

    WebUI.scrollToPosition(0, 200)

    WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'), '1234')

    WebUI.verifyTextPresent('Hanya boleh diisi dengan huruf', false)

    WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'), '748363')

    WebUI.verifyTextPresent('Mohon Masukkan Nomor Handphone Yang Valid', false)

    WebUI.clearText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'))

    WebUI.clearText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'))

    WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'), 'Lutfi ')

    WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'), '81275379260')

    WebUI.scrollToPosition(0, 352)

    WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Model Mobil'))

    //Isi Model Mobil
    if (WebUI.verifyElementPresent(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Isi Model Mobil'), 30, FailureHandling.OPTIONAL)) {
        // Step 2: If the element exists, click on it
        WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Isi Model Mobil' // Add any additional steps you want to perform after clicking the element
                // Add a failure message or alternative steps if the element does not exist
                ))

        WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Checkbox'))

        WebUI.scrollToElement(findTestObject('NCP/PDP NCP/OVERVIEW/Promo/Scroll Share Button'), 0)

        WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Whatsapp'))

        WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Facebook'))

        WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share X'))

        //WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Tiktok'))
        WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Link'))

        WebUI.comment('Form berhasil diisi dan dikirim.')

        WebUI.closeBrowser()
    } else {
        WebUI.click(findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Field Model Mobil'))

        println('Element not found.')
    }
    
    //Ceklis Checkbox
    WebUI.click(findTestObject('Promosi Nasional/Promo Semua/Minta Penawaran Semua/Checkbox'), FailureHandling.OPTIONAL) //WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Tiktok'))
} else {
    WebUI.comment('Inquiry Form tidak ditemukan. Kembali ke halaman sebelumnya.')

    WebUI.back()

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/NCP/News NCP/Konten Card News 2'))

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Promosi Nasional/Promo Semua/Section Inquiry Form'), 
        10, FailureHandling.OPTIONAL)) {
        WebUI.comment('Inquiry Form ditemukan. Lanjut ke langkah selanjutnya.')

        WebUI.scrollToPosition(0, 200)

        WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'), '1234')

        WebUI.verifyTextPresent('Hanya boleh diisi dengan huruf', false)

        WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'), '748363')

        WebUI.verifyTextPresent('Mohon Masukkan Nomor Handphone Yang Valid', false)

        WebUI.clearText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'))

        WebUI.clearText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'))

        WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'), 'Lutfi ')

        WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'), '81275379260')

        WebUI.scrollToPosition(0, 352)

        WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Model Mobil'))

        if (WebUI.verifyElementPresent(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Isi Model Mobil'), 30, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Isi Model Mobil'))

            WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Checkbox'))

            WebUI.scrollToElement(findTestObject('NCP/PDP NCP/OVERVIEW/Promo/Scroll Share Button'), 0)

            WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Whatsapp'))

            WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Facebook'))

            WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share X'))

            WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Link'))

            WebUI.comment('Form berhasil diisi dan dikirim.')

            WebUI.closeBrowser()
        } else {
            WebUI.click(findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Field Model Mobil'))

            println('Element not found.')
        }
    } else {
        WebUI.comment('Inquiry Form tidak ditemukan. Kembali ke halaman sebelumnya.')

        WebUI.back()

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/NCP/News NCP/Konten Card News 3'))

        if (WebUI.verifyElementPresent(findTestObject('Object Repository/Promosi Nasional/Promo Semua/Section Inquiry Form'), 
            10, FailureHandling.OPTIONAL)) {
            WebUI.comment('Inquiry Form ditemukan. Lanjut ke langkah selanjutnya.')

            WebUI.scrollToPosition(0, 200)

            WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'), '1234')

            WebUI.verifyTextPresent('Hanya boleh diisi dengan huruf', false)

            WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'), '748363')

            WebUI.verifyTextPresent('Mohon Masukkan Nomor Handphone Yang Valid', false)

            WebUI.clearText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'))

            WebUI.clearText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'))

            WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Nama Lengkap'), 'Lutfi ')

            WebUI.setText(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/No Hp'), '81275379260')

            WebUI.scrollToPosition(0, 352)

            WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Model Mobil'))

            if (WebUI.verifyElementPresent(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Isi Model Mobil'), 30, 
                FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Isi Model Mobil'))

                WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Checkbox'))

                WebUI.scrollToElement(findTestObject('NCP/PDP NCP/OVERVIEW/Promo/Scroll Share Button'), 0)

                WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Whatsapp'))

                WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Facebook'))

                WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share X'))

                WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Tiktok'))

                WebUI.click(findTestObject('NCP/PDP NCP/OVERVIEW/News/Detail Card/Share Link'))

                WebUI.comment('Form berhasil diisi dan dikirim.')

                WebUI.closeBrowser()
            } else {
                WebUI.click(findTestObject('Promosi Nasional/Promo Mobil Baru/Minta Penawaran/Field Model Mobil'))

                println('Element not found.')
            }
        }
    }
}

WebUI.delay(2)

