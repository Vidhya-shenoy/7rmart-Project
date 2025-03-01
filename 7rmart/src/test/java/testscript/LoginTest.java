package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import pages.LoginPage;

public class LoginTest extends Base {
	@Test(groups= {"regression"})
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {
		String usernamevalue = "admin";
		String passwordvalue = "admin";
	LoginPage loginpageobject=new LoginPage(driver);
	loginpageobject.enterUsername(usernamevalue);
	loginpageobject.enterPassword(passwordvalue);
	loginpageobject.clickOnSignInButton();
	boolean ishomepageavailable =loginpageobject.isDashboardLoaded();//boolean variable=ishomepageavailable
	Assert.assertTrue(ishomepageavailable);//boolean variable passed to assertTrue method
}
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidUsernameInvalidPassword()
	{
		String usernamevalue = "admin";
        String passwordvalue = "HELLO";
	     LoginPage loginpageobject=new LoginPage(driver);
		loginpageobject.enterUsername(usernamevalue);
		loginpageobject.enterPassword(passwordvalue);
		loginpageobject.clickOnSignInButton();
		boolean isAlertMessageDisplayed=loginpageobject.isAlertDisplayed();
		AssertJUnit.assertTrue(isAlertMessageDisplayed);
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidUsernamevalidPassword()
	{
		String usernamevalue = "HELLO";
		String passwordvalue = "admin";
		LoginPage loginpageobject=new LoginPage(driver);
		loginpageobject.enterUsername(usernamevalue);
		loginpageobject.enterPassword(passwordvalue);
		loginpageobject.clickOnSignInButton();
		boolean isAlertMessageDisplayed=loginpageobject.isAlertDisplayed();
		AssertJUnit.assertTrue(isAlertMessageDisplayed);
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidUsernameInvalidPassword()
	{
		String usernamevalue = "HELLO";
		String passwordvalue = "admin1";
		LoginPage loginpageobject=new LoginPage(driver);
		loginpageobject.enterUsername(usernamevalue);
		loginpageobject.enterPassword(passwordvalue);
		loginpageobject.clickOnSignInButton();
		boolean isAlertMessageDisplayed=loginpageobject.isAlertDisplayed();
		AssertJUnit.assertTrue(isAlertMessageDisplayed);
	}
}