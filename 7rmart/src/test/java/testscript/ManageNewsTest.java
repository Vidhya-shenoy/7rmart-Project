package testscript;

import org.testng.annotations.Test;

import constants.Constants;

import org.testng.Assert;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageNewsPage;



public class ManageNewsTest extends Base {
	LogoutPage logoutpage;
	ManageNewsPage managenewspage;
	@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to create News Successfully ")
	public void verifyThatUserCanCreateNewsSuccessfully() {
		{	
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		String news="AUTOMATION TESTING";

	LoginPage loginpageobject=new LoginPage(driver);
	loginpageobject.enterUsername(usernamevalue).enterPassword(passwordvalue);
	//loginpageobject.enterPassword(passwordvalue);
	logoutpage=loginpageobject.clickOnSignInButton();
	
	//ManageNewsPage newspageobject=new ManageNewsPage(driver);
	//newspageobject.clickManageNewsInfo();
	managenewspage=logoutpage.clickManageNewsInfo();
	managenewspage.clickManageNewsNewButton().enterTheNews(news).clickTheSaveButton();
	//newspageobject.enterTheNews(news);
	//newspageobject.clickTheSaveButton();
	boolean isAlertDisplayed =managenewspage.isAlertDisplayed();
	Assert.assertTrue(isAlertDisplayed,Constants.MANAGENEWS);
	
		}	
}
}
