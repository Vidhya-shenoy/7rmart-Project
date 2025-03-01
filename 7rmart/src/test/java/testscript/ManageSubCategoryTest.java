package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageSubCategoryPage;
import utilities.ExcelUtility;



public class ManageSubCategoryTest extends Base {
@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to add products in ManageSubCategory Successfully")	
public void verifyThatManageCategorycandelete() throws IOException, AWTException {
		
		String username=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		String subcategory1=ExcelUtility.getStringData(1, 0, "Manage_Subcategory");
	
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(passwordvalue);
		loginpage.clickOnSignInButton();
		
		ManageSubCategoryPage managesubcategorypage= new ManageSubCategoryPage(driver);
		managesubcategorypage.clickTheSubCategoryMoreInfo();
		managesubcategorypage.clickTheNew_Button();
		managesubcategorypage.selectcategory_Dropdown();
		managesubcategorypage.enterSubcategory(subcategory1);
		managesubcategorypage.uploadTheImage();
		managesubcategorypage.clickTheSaveButton();
		boolean isGreenalertmessageDispalyed=managesubcategorypage.isGreenAlertboxDispalyed();
		Assert.assertTrue(isGreenalertmessageDispalyed);
		

}
}