package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LogoutPage {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath ="//a[@data-toggle='dropdown']")
	private WebElement admin;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")
	private WebElement logout;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']")
	private WebElement admoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")
	private WebElement managecontact;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'  and  @class='small-box-footer']")
	private WebElement managefooterext;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product' and @class='small-box-footer']")
	private WebElement manageproductinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']")
	private WebElement moreinfo;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	private WebElement newsMoreInfo;
	
	public AdminUsersPage clickOnMoreInfoAdminPage()
	{
		admoreinfo.click();
		return new AdminUsersPage(driver);
	}
	public ManageContactPage clickTheManageContactMoreInfo() {
		managecontact.click();
		return new ManageContactPage(driver);
	}
	public ManageFooterPage clickTheManagefooterTextMoreInfo() {
		managefooterext.click();
		return new ManageFooterPage(driver);
	}
	public ManageProductPage clickTheManageProductInfo() {
		manageproductinfo.click();
		return new ManageProductPage(driver);
	}
	public ManageSubCategoryPage clickTheSubCategoryMoreInfo() {
		moreinfo.click();
		return new ManageSubCategoryPage(driver);
	}
	public ManageNewsPage clickManageNewsInfo()
	{
		newsMoreInfo.click();
		return new ManageNewsPage(driver) ;
	}

	public void clickOnadminButton() {
	admin.click();
}
	public void clickOnLogOutButton() {
		WaitUtility wait=new WaitUtility();
		wait.waitForClick(driver, logout);
		logout.click();
	}


	}
