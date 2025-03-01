package testscript;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.LoginPage;
import pages.ManageNewsPage;



public class ManageNewsTest extends Base {
	@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to create News Successfully ")
	public void verifyThatUserCanCreateNewsSuccessfully() {
		{	
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		String news="AUTOMATION TESTING";

	LoginPage loginpageobject=new LoginPage(driver);
	loginpageobject.enterUsername(usernamevalue);
	loginpageobject.enterPassword(passwordvalue);
	loginpageobject.clickOnSignInButton();
	
	ManageNewsPage newspageobject=new ManageNewsPage(driver);
	newspageobject.clickManageNewsInfo();
	newspageobject.clickManageNewsNewButton();
	newspageobject.enterTheNews(news);
	newspageobject.clickTheSaveButton();
	boolean isAlertDisplayed =newspageobject.isAlertDisplayed();
	Assert.assertTrue(isAlertDisplayed);
	
		}	
}
}
