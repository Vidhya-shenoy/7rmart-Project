package testscript;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.LogoutPage;
import pages.LoginPage;

public class LogoutTest extends Base {
    @Test(retryAnalyzer=retry.Retry.class,description="TEST FOR CHECKING WHETHER THE ADMIN CAN LOGOUT SUCCESSFULLY")
	public void verifyTheUserIsAbleToLogout() throws IOException
	{
	
		
		LoginPage loginpage = new LoginPage(driver);
		String usernamevalue = "admin";
		loginpage.enterUsername(usernamevalue);
		String passwordvalue = "admin";
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSignInButton();
		
		LogoutPage logoutpage=new LogoutPage(driver);
		logoutpage.clickOnadminButton();
		logoutpage.clickOnLogOutButton();
		
		
		
	}
}


