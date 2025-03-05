package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageSubCategoryPage;
import utilities.ExcelUtility;



public class ManageSubCategoryTest extends Base {
	 LogoutPage logout;
	 ManageSubCategoryPage managesubcategorypage;
@Test(retryAnalyzer=retry.Retry.class,description="Test to check whether the  User is able to add products in ManageSubCategory Successfully")	
public void verifyThatManageCategorycandelete() throws IOException, AWTException {
		
		String username=ExcelUtility.getStringData(1, 0, "Login_Page");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login_Page");
		String subcategory1=ExcelUtility.getStringData(1, 0, "Manage_Subcategory");
	
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(passwordvalue);
		loginpage.enterPassword(passwordvalue);
		
		
		//ManageSubCategoryPage managesubcategorypage= new ManageSubCategoryPage(driver);
		managesubcategorypage=logout.clickTheSubCategoryMoreInfo();
		managesubcategorypage.clickTheNew_Button().selectcategory_Dropdown().enterSubcategory(subcategory1).uploadTheImage().clickTheSaveButton();
		//managesubcategorypage.selectcategory_Dropdown();
		//managesubcategorypage.enterSubcategory(subcategory1);
		//managesubcategorypage.uploadTheImage();
		//managesubcategorypage.clickTheSaveButton();
		boolean isGreenalertmessageDispalyed=managesubcategorypage.isGreenAlertboxDispalyed();
		Assert.assertTrue(isGreenalertmessageDispalyed,Constants.MANAGESUBCATEGORY);
		

}
}