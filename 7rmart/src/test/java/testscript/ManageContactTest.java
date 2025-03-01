package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to change Phonenumber And DeliveryTime SUCCESSFULLY")
public void verifyThatUserIsAbleToChangePhonenumberAndDeliveryTime() throws IOException {
	{
		String username=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		String phoneno=ExcelUtility.getIntegerData(1, 0, "Manage_Contact");
		String delivrytime=ExcelUtility.getIntegerData(1, 1, "Manage_Contact");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSignInButton();
		
		ManageContactPage managecontact=new ManageContactPage(driver);
		managecontact.clickTheManageContact();
		managecontact.clickTheEditButton();
		managecontact.enterThePhoneNumber(phoneno);
		managecontact.enterTheDeliveryTime(delivrytime);
		managecontact.clickUpdateButton();
		boolean isAlertmessageDisplayed=managecontact.isAlertDisplayed();
		Assert.assertTrue(isAlertmessageDisplayed);
	}
	}
   
    @Test
	public void verifyThatTheUpdateButtonIsDisplayed() throws IOException {
    	
		String username=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSignInButton();
		
		ManageContactPage managecontact=new ManageContactPage(driver);
		managecontact.clickTheManageContact();
		managecontact.clickTheEditButton();
		//managecontact.clickUpdateButton();
		boolean isupdatebuttonEnabled = managecontact.isUpdateButtonDisplayed();
		Assert.assertTrue(isupdatebuttonEnabled);

	}

	
}


