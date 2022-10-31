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

Mobile.startApplication(GlobalVariable.G_AndroidApp, false)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Board/BD101android.widget.TextView - Kelas A'), 0)

Mobile.delay(13, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Board/BD101android.widget.TextView - Board'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Application/CicleStaging/Board/BD101android.widget.TextView - Board1'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('3BD/BD104'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Board/BD105android.widget.TextView -'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Board/BD105android.widget.TextView - Add Card'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Board/BD105android.widget.TextView - Please Select'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/CicleStaging/Board/BD105android.widget.TextView - Nanda'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Application/CicleStaging/Board/BD105android.widget.TextView - Nanda1'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

