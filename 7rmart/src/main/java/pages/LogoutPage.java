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
	
	public void clickOnadminButton() {
	admin.click();
}
	public void clickOnLogOutButton() {
		WaitUtility wait=new WaitUtility();
		wait.waitForClick(driver, logout);
		logout.click();
	}


	}
