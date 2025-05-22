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

for (int i = 1; i <= GlobalVariable.maxLoop; i++) {
    WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Ae By Branch'), [:] //23
        )

    WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Event Branch'), [:] //24
        )

	WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Katalog Mobil Baru By Branch'), [:] //25
		)

	WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Produk Purna Jual'), [:] //26
		)

	WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Promo Branch'), [:] //27
		)

	WebUI.callTestCase(findTestCase('Landing Page/Branch Landing Page/Section Atas Branch Landing Page'), [:] //28
		)
		
		
	println("============================= Loop Again ===============================")

}