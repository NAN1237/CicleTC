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

//Mobile.startApplication(GlobalVariable.G_AndroidApp, false)
//
//Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('Application/CicleStaging/GC/KelasA'), 0)
//
//Mobile.delay(13, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('Application/CicleStaging/Blast/BL101android.widget.TextView - Blast'), 0)
//
//Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.verifyElementVisible(findTestObject('Application/CicleStaging/Blast/BL101android.widget.TextView - Blast (1)'), 0)
//
//Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('2BL/BL204'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Blast/BL205android.widget.TextView -'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(200, 600)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Blast/BL205android.widget.EditText - Add new comment'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Blast/BL205android.widget.ImageView'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(60, 200)

Mobile.tap(findTestObject('Application/CicleStaging/Blast/BL205android.widget.ImageView2'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

