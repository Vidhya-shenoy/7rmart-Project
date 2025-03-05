package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageFooterPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;


public class ManageFooterTest extends Base {
	LogoutPage logoutpage;
	ManageFooterPage managefooterPage;
	
	@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to update manage footer successfully")
	public void verifyThatuserIsAbleToUpadateManageFooterSuccessfully() throws IOException {
	
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		
		String address=ExcelUtility.getStringData(1, 0, "Manage_Footer");
		String email=ExcelUtility.getStringData(1, 1, "Manage_Footer");
	    String phonenumber=ExcelUtility.getIntegerData(1, 2, "Manage_Footer");
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue).enterPassword(passwordvalue);
		logoutpage=loginpage.clickOnSignInButton();
		
		
		managefooterPage=logoutpage.clickTheManagefooterTextMoreInfo();
		managefooterPage.clickTheActionButton();
		managefooterPage.clearandenteraddress(address);
		//managefootertest.enterEmail(address);
		//managefootertest.enterphonenumber(address);
		//managefootertest.clickTheUpdateButton();
		boolean TheAlertBoxisdisplayed=managefooterPage.isAlertDisplayed();
		Assert.assertTrue(TheAlertBoxisdisplayed, Constants.MANAGEFOOTERTEXT);

}
	@Test
	public void verifyThatTheUpdateButtonIsDisplayed() throws IOException {
		
		String username=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		
        LoginPage loginpage = new LoginPage(driver);
        loginpage.enterUsername(username).enterPassword(passwordvalue);
		logoutpage=loginpage.clickOnSignInButton();
		
		ManageFooterPage managefooterpage= new ManageFooterPage(driver);
		managefooterPage=logoutpage.clickTheManagefooterTextMoreInfo();
		managefooterpage.clickTheActionButton().isUpdatebuttonDisplayed();
		boolean isupdateButtonDispalyed = managefooterpage.isUpdatebuttonDisplayed();
		Assert.assertTrue(isupdateButtonDispalyed);

	}
}