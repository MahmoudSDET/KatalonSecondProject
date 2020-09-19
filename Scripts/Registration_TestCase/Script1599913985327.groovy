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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Page_Registeration- My Store/input_Email address_email_create'), 'matest9536@test.com')

WebUI.click(findTestObject('Page_Registeration- My Store/i_Create an account_icon-user left'))

WebUI.click(findTestObject('Page_Registeration- My Store/input_Mr._id_gender'))

WebUI.setText(findTestObject('Page_Registeration- My Store/input__customer_firstname'), 'mahmoud')

WebUI.setText(findTestObject('Page_Registeration- My Store/input__customer_lastname'), 'abdelfattah')

WebUI.setEncryptedText(findTestObject('Page_Registeration- My Store/input__passwd'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Page_Registeration- My Store/form_Your personal informationTitleMr.Mrs.F_0dfd37'))

WebUI.selectOptionByValue(findTestObject('Page_Registeration- My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '14', true)

WebUI.selectOptionByValue(findTestObject('Page_Registeration- My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Page_Registeration- My Store/select_-20202019201820172016201520142013201_ed0939'), 
    '2000', true)

WebUI.click(findTestObject('Page_Registeration- My Store/input_July_newsletter'))

WebUI.click(findTestObject('Page_Registeration- My Store/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Page_Registeration- My Store/input__address1'), 'test')

WebUI.setText(findTestObject('Page_Registeration- My Store/input_Address (Line 2)_address2'), 'wfed')

WebUI.setText(findTestObject('Page_Registeration- My Store/input__city'), 'testcity')

WebUI.selectOptionByValue(findTestObject('Page_Registeration- My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '12', true)

WebUI.setText(findTestObject('Page_Registeration- My Store/textarea_Additional information_other'), 'test')

WebUI.setText(findTestObject('Page_Registeration- My Store/input_Home phone_phone'), '4362655635')

WebUI.setText(findTestObject('Page_Registeration- My Store/input__phone_mobile'), '53529665567')

WebUI.setText(findTestObject('Page_Registeration- My Store/input__alias'), 'My addresste')

WebUI.setEncryptedText(findTestObject('Page_Registeration- My Store/input__passwd'), 'qeJ0sjJnwEs=')

WebUI.setEncryptedText(findTestObject('Page_Registeration- My Store/input__passwd'), 'qeJ0sjJnwEs=')

WebUI.setText(findTestObject('Page_Registeration- My Store/input__postcode'), '34435')

WebUI.click(findTestObject('Page_Registeration- My Store/form_Your personal informationTitleMr.Mrs.F_4c6c68'))

WebUI.click(findTestObject('Page_Registeration- My Store/span_Register'))

WebUI.closeBrowser()

WebUI.delay(5)

