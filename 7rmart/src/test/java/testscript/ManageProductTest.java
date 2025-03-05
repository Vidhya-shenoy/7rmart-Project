package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageProductPage;

public class ManageProductTest extends Base{
	LogoutPage logoutpage;
	ManageProductPage manageproductpage;
	@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to delete Products from ManageProduct Successfully")
	public void verifyThatProductCanBeDeletedFromManageProduct() {
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		
		LoginPage loginpageobject=new LoginPage(driver);
		loginpageobject.enterUsername(usernamevalue).enterPassword(passwordvalue);
	    logoutpage=loginpageobject.clickOnSignInButton();
		
		ManageProductPage manageproduct=new ManageProductPage(driver);
		manageproductpage=logoutpage.clickTheManageProductInfo();
		manageproduct.clickThedeleteButton();
		boolean isAlertMessageDisplayed=manageproduct.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed);
		
		
	}

}

