package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageProductPage;

public class ManageProductTest extends Base{
	@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to delete Products from ManageProduct Successfully")
	public void verifyThatProductCanBeDeletedFromManageProduct() {
		String usernamevalue = "admin";
		String passwordvalue = "admin";
		
		LoginPage loginpageobject=new LoginPage(driver);
		loginpageobject.enterUsername(usernamevalue);
		loginpageobject.enterPassword(passwordvalue);
		loginpageobject.clickOnSignInButton();
		
		ManageProductPage manageproduct=new ManageProductPage(driver);
		manageproduct.clickTheManageProductInfo();
		manageproduct.clickThedeleteButton();
		boolean isAlertMessageDisplayed=manageproduct.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed);
		
		
	}

}

