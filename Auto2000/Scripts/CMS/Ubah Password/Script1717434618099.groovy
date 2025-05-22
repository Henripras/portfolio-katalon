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


def newpasswordField = findTestObject('Object Repository/CMS/Change Password/input_Password Baru_newPassword')
def confirmField = findTestObject('Object Repository/CMS/Change Password/input_Konfirmasi Password_confirmNewPassword')

def initialUsername = 'panjitest'
def initialPassword = 'Panjitest@1'

def currentPassword = initialPassword

def numberOfIterations = 3

WebUI.openBrowser('')

numberOfIterations.times({ def iteration ->
    
    def newPassword = currentPassword + 'a'

    
    WebUI.navigateToUrl('https://sit.auto2000.co.id/cms')
    WebUI.maximizeWindow()
    WebUI.waitForPageLoad(5)
    WebUI.setText(findTestObject('CMS/Change Password/input_Username_title'), initialUsername)
    WebUI.setText(findTestObject('CMS/Change Password/input_Password_desc'), currentPassword)
//	WebUI.click(findTestObject('Object Repository/CMS/Change Password/show pass login'))
//	WebUI.delay(2)
    WebUI.click(findTestObject('CMS/Change Password/button Login'))
    WebUI.waitForElementVisible(findTestObject('CMS/Change Password/icon profile'), 5)

    
    if (WebUI.verifyElementPresent(findTestObject('CMS/Change Password/icon profile'), 5, FailureHandling.CONTINUE_ON_FAILURE)) {
        WebUI.click(findTestObject('CMS/Change Password/icon profile'))
        WebUI.delay(2)
        WebUI.click(findTestObject('CMS/Change Password/Ubah Password'))
        WebUI.delay(2)
        
        WebUI.setText(newpasswordField, newPassword)
//        WebUI.click(findTestObject('Object Repository/CMS/Change Password/show confirm password'))
        WebUI.delay(2)
        WebUI.setText(confirmField, newPassword)
//        WebUI.click(findTestObject('Object Repository/CMS/Change Password/show password'))
        WebUI.delay(2)
        WebUI.click(findTestObject('Object Repository/CMS/Change Password/button_SIMPAN KATA SANDI'))
        WebUI.delay(2)

        
        WebUI.click(findTestObject('CMS/Change Password/icon profile'))
        WebUI.click(findTestObject('CMS/Change Password/sign out'))

        
        currentPassword = newPassword
    } else {
        println "Login gagal pada iterasi ${iteration + 1} dengan username: $initialUsername dan password: $currentPassword"
    }
	
	
})

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://sit.auto2000.co.id/cms')
		WebUI.maximizeWindow()
		WebUI.waitForPageLoad(5)
		WebUI.setText(findTestObject('CMS/Change Password/input_Username_title'), initialUsername)
		WebUI.setText(findTestObject('CMS/Change Password/input_Password_desc'), currentPassword)
//		WebUI.click(findTestObject('Object Repository/CMS/Change Password/show pass login'))
//		WebUI.delay(2)
		WebUI.click(findTestObject('CMS/Change Password/button Login'))
		WebUI.delay(2)
