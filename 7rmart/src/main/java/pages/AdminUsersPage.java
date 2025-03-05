package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	
	WebDriver driver;
	
	public AdminUsersPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement adnewbutton;
	@FindBy(xpath="//input[@id='username']") private WebElement adusernamefield;
	@FindBy(xpath="//input[@id='password']") private WebElement adpasswordfield;
	@FindBy(xpath="//select[@id='user_type']") private WebElement adusertypefield;
	@FindBy(xpath="//button[@name='Create']") private WebElement adsavebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement adgreenalert;
	@FindBy(xpath="//i[@class='fa fa-save']") private WebElement adsavebutton2;
	
	
	public AdminUsersPage  clickOnNewButton()
	{
		adnewbutton.click();
		return this;
	}
	
	public AdminUsersPage  enterNewUserName(String newusernamevalue)
	{
		adusernamefield.sendKeys(newusernamevalue);
		return this;
	}
	
	public AdminUsersPage  enterNewPassWord(String newpasswordvalue)
	{
		adpasswordfield.sendKeys(newpasswordvalue);
		return this;
	}
	
	public AdminUsersPage  selectUserType()
	{
		Select select= new Select(adusertypefield);
		select.selectByIndex(4);
		return this;
	}
	
	public AdminUsersPage  clickOnSaveButton()
	{
		adsavebutton.click();
		return this;
	}
	
	public boolean isGreenAlertDisplayed()
	{
		return adgreenalert.isDisplayed();
	}
	
	public boolean  isSaveButtonDisplayed()
	{
		 return adsavebutton2.isDisplayed();
	}

}
