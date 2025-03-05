package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	LogoutPage logoutpage;
	ManageContactPage managecontactpage;
	@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to change Phonenumber And DeliveryTime SUCCESSFULLY")
public void verifyThatUserIsAbleToChangePhonenumberAndDeliveryTime() throws IOException {
	{
		String username=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		String phoneno=ExcelUtility.getIntegerData(1, 0, "Manage_Contact");
		String delivrytime=ExcelUtility.getIntegerData(1, 1, "Manage_Contact");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(passwordvalue).clickOnSignInButton();
		//loginpage.enterPassword(passwordvalue);
		//loginpage.clickOnSignInButton();
		
		//ManageContactPage managecontact=new ManageContactPage(driver);
		managecontactpage=logoutpage.clickTheManageContactMoreInfo();
		managecontactpage.clickTheEditButton().enterThePhoneNumber(phoneno).enterTheDeliveryTime(delivrytime).clickUpdateButton();
		//managecontact.enterThePhoneNumber(phoneno);
		//managecontactpage.enterTheDeliveryTime(delivrytime);
		//managecontactpage.clickUpdateButton();
		boolean isAlertmessageDisplayed=managecontactpage.isAlertDisplayed();
		Assert.assertTrue(isAlertmessageDisplayed, Constants.MANAGECONTACTEDIT);
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
		managecontactpage=logoutpage.clickTheManageContactMoreInfo();
		managecontactpage.clickTheEditButton().clickUpdateButton();
		//managecontact.clickUpdateButton();
		boolean isupdatebuttonEnabled = managecontact.isUpdateButtonDisplayed();
		Assert.assertTrue(isupdatebuttonEnabled);

	}

	
}


