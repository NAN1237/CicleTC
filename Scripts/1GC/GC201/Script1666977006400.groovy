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
//Mobile.tap(findTestObject('Application/CicleStaging/GC/KelasA'), 0)
//
//Mobile.verifyElementVisible(findTestObject('Application/CicleStaging/GC/KelasA_GC'), 0, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('Application/CicleStaging/GC/KelasA_GC'), 0)
//
//Mobile.verifyElementVisible(findTestObject('Application/CicleStaging/GC/KelasA_Text'), 0)
//
//Mobile.tap(findTestObject('Application/CicleStaging/GC/AddMemberObject (1)'), 0)
//
//Mobile.verifyElementVisible(findTestObject('Application/CicleStaging/GC/AddRemove_Member'), 0)
//
//Mobile.tapAtPosition(73, 1371)
//
//Mobile.tap(findTestObject('Application/CicleStaging/GC/GC_AddRemove_SearchColumn'), 0)
//
//Mobile.setText(findTestObject('Application/CicleStaging/GC/GC_AddRemove_SearchColumn'), 'Nanda Dwi Mahendra', 0)
//
//Mobile.verifyElementVisible(findTestObject('Application/CicleStaging/GC/GC_Assertion_Nanda_Dwi_Mahendra'), 0)

//WebUI.callTestCase(findTestCase('1GC/GC104'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Application/CicleStaging/GC/android.widget.EditText - Nanda Dwi Mahendra'), '' + 'Ronaldo', 
    0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Application/CicleStaging/GC/No_item_to_display'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

