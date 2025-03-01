package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;

public class AdminUsersTest extends Base {
	
	@Test
	public void verifyIfNewAdminCanBeAddedWithValidCredentials()
	{
		String usernamevalue= "admin";
		String passwordvalue= "admin";
		String newusernamevalue= "vidhya";
		String newpasswordvalue= "welcome123";
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);	
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSignInButton();
		
		AdminUsersPage adminuserspage= new AdminUsersPage(driver);
		adminuserspage.clickOnMoreInfo();
		adminuserspage.clickOnNewButton();
		adminuserspage.enterNewUserName(newusernamevalue);
		adminuserspage.enterNewPassWord(newpasswordvalue);
		adminuserspage.selectUserType();
		adminuserspage.clickOnSaveButton();
		Boolean isalertdisplayed= adminuserspage.isGreenAlertDisplayed();
		Assert.assertTrue(isalertdisplayed);
		
	}
	
	@Test
	public void verifyWhetherSaveButtonIsDisplayed()
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);	
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSignInButton();
		
		AdminUsersPage adminuserspage= new AdminUsersPage(driver);
		adminuserspage.clickOnMoreInfo();
		adminuserspage.clickOnNewButton();
		adminuserspage.isSaveButtonDisplayed();
		
	}
	

}