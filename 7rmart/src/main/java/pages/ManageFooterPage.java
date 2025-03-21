package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {
	WebDriver driver;

	public ManageFooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'  and  @class='small-box-footer']")
	//private WebElement managefooterext;
	@FindBy(xpath = "//i[@class='fas fa-edit']")
	private WebElement actionbutton;
	@FindBy(xpath = "//textarea[@id='content']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement update;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertbox;


//public void clickTheManagefooterTextMoreInfo() {
	//managefooterext.click();
//}

public ManageFooterPage clickTheActionButton() {
	actionbutton.click();
	return this;
}

public ManageFooterPage clearandenteraddress(String address1) {
	address.clear();
	address.sendKeys(address1);
	return this;
}
public ManageFooterPage enterEmail(String emailid)
{
	email.clear();
	email.sendKeys(emailid);
	return this;
}
public ManageFooterPage enterphonenumber(String phoneno)
{
	phone.clear();
	phone.sendKeys(phoneno);
	return this;
}


public ManageFooterPage clickTheUpdateButton() {
	update.click();
	return this;
}

public boolean isAlertDisplayed() {
	return alertbox.isDisplayed();
}
public boolean isUpdatebuttonDisplayed()
{
	return update.isDisplayed();
}
}