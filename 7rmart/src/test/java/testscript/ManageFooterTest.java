package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;


public class ManageFooterTest extends Base {
	
	@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to update manage footer successfully")
	public void verifyThatuserIsAbleToUpadateManageFooterSuccessfully() throws IOException {
	
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		
		String address=ExcelUtility.getStringData(1, 0, "Manage_Footer");
		String email=ExcelUtility.getStringData(1, 1, "Manage_Footer");
	    String phonenumber=ExcelUtility.getIntegerData(1, 2, "Manage_Footer");
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSignInButton();
		
		ManageFooterPage managefooterpage= new ManageFooterPage(driver);
		managefooterpage.clickTheManagefooterTextMoreInfo();
		managefooterpage.clickTheActionButton();
		managefooterpage.clearandenteraddress(address);
		managefooterpage.enterEmail(address);
		managefooterpage.enterphonenumber(address);
		managefooterpage.clickTheUpdateButton();
		boolean TheAlertBoxisdisplayed=managefooterpage.isAlertDisplayed();
		Assert.assertTrue(TheAlertBoxisdisplayed);

}
	@Test
	public void verifyThatTheUpdateButtonIsDisplayed() throws IOException {
		
		String username=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		
        LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSignInButton();
		
		ManageFooterPage managefooterpage= new ManageFooterPage(driver);
		managefooterpage.clickTheManagefooterTextMoreInfo();
		managefooterpage.clickTheActionButton();
		managefooterpage.isUpdatebuttonDisplayed();
		boolean isupdateButtonDispalyed = managefooterpage.isUpdatebuttonDisplayed();
		Assert.assertTrue(isupdateButtonDispalyed);

	}
}