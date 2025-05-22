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
    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Detail News by landing page city'), [:] )
	
	WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Detail Promo by landing page city'), [:] )

    //WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Direct Map'), [:] )

    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Filter Showroom'), [:] )

    WebUI.callTestCase(findTestCase('Landing Page/CIty Landing Page/Inquiry Mobil Baru Promo City'), [:] )

    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Inquiry News City'), [:] )

    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Landing Page City'), [:] )

    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/List View'), [:] )

    WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Minta Penawaran'), [:] )

	WebUI.callTestCase(findTestCase('Landing Page/City Landing Page/Negative Case Minta Penawaran'), [:] )

	
	println("============================= Loop Again ===============================")
}

