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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.exception.StepFailedException

int retryCount = 0
int maxRetry = 3
boolean elementFound = false

        WebUI.openBrowser('')

        WebUI.navigateToUrl('https://pre.auto2000.co.id/dealer-toyota/jakarta-pusat')
        
        WebUI.maximizeWindow()

//while (retryCount < maxRetry && !elementFound) {
    //try {
        //try {
            //WebUI.scrollToPosition(0, 300)
        
           // if (WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Full screen map'))) {
              //  WebUI.comment('Elemen terlihat setelah di-scroll')
        
              //  WebUI.click(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Full screen map'), FailureHandling.CONTINUE_ON_FAILURE)
           // } else {
              //  WebUI.comment('Elemen tidak terlihat setelah di-scroll')
            //}
       // }
        //catch (Exception e) {
           // WebUI.comment("Terjadi kesalahan saat scrolling atau klik elemen: $e.message")
       // } 
       // elementFound = true
        
   // } catch (Exception e) {
      //  retryCount++
       // WebUI.delay(2)
  //  }
//}

//if (!elementFound) {
    //WebUI.comment("Element not found after ${maxRetry} retries")
    //throw new StepFailedException("Element not found")
//}

    //WebUI.delay(3)
    
    //try {
    
      //  if (WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/MInimize Map'))) {
        //    WebUI.comment('Elemen ini terlihat')
    
        //    WebUI.click(findTestObject('Landing Page/City Landing Page/Section Listing Branch/MInimize Map'), FailureHandling.CONTINUE_ON_FAILURE)
       // } else {
        //    WebUI.comment('Elemen tidak terlihat')
      //  }
   // }
  //  catch (Exception e) {
   //     WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
    //}
    
   // WebUI.delay(3)
    
    try {
        
        if (WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Pin Point Cempaka Putih'))) {
            WebUI.comment('Elemen ini terlihat')
        
            WebUI.click(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Pin Point Cempaka Putih'), FailureHandling.CONTINUE_ON_FAILURE)
        } else {
            WebUI.comment('Elemen tidak terlihat')
        }
    }
    catch (Exception e) {
        WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
    }
    
    WebUI.delay(3)
    
    try {
        WebUI.scrollToPosition(0, 681)
        
        if (WebUI.verifyElementVisible(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Direct cempaka putih by map'))) {
            WebUI.comment('Elemen ini terlihat')
        
            WebUI.click(findTestObject('Landing Page/City Landing Page/Section Listing Branch/Direct cempaka putih by map'), FailureHandling.CONTINUE_ON_FAILURE)
        } else {
            WebUI.comment('Elemen tidak terlihat')
        }
    }
    catch (Exception e) {
        WebUI.comment("Terjadi kesalahan saat klik elemen: $e.message")
    }
    
    
//    WebUI.switchToWindowUrl('https://pre.auto2000.co.id/dealer-toyota')



