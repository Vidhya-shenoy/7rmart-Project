package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {
	WebDriver driver;
	
	public ManageContactPage(WebDriver driver)
	{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")
	private WebElement managecontact;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")
	private WebElement editbutton;
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phonenumber;
	@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']")
	private WebElement deliverytime;
	@FindBy(xpath="//button[@name='Update']")
	private WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement greenalertbox;
	
	public void clickTheManageContact() {
		managecontact.click();
	}
	public void clickTheEditButton() {
		editbutton.click();
	}
	public void enterThePhoneNumber(String phone) {
		phonenumber.clear();
		phonenumber.sendKeys(phone);
	}
	public void enterTheDeliveryTime(String delivery_time) {
		deliverytime.clear();
		deliverytime.sendKeys(delivery_time);
	}
	public void clickUpdateButton() {
		updatebutton.click();
		}
	public boolean isAlertDisplayed()
	{
		return greenalertbox.isDisplayed();
	}
	public boolean isUpdateButtonDisplayed() {
		return updatebutton.isEnabled();
		
	}
}


