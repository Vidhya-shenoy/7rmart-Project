package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	WebDriver driver;
	public ManageNewsPage(WebDriver driver) 
	{
			this.driver = driver;
			PageFactory.initElements(driver, this);

}
	
	//@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	//private WebElement newsMoreInfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	private WebElement newNews;
	@FindBy(xpath="//textarea[@id='news']")
	private WebElement enterNews;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickSave;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertBox;
	//public void clickManageNewsInfo()
	//{
	//	newsMoreInfo.click();
	//}
public ManageNewsPage clickManageNewsNewButton()
{
	newNews.click();
	return this;
}
public ManageNewsPage enterTheNews(String news)
{
	enterNews.sendKeys(news);
	return this;
}
public ManageNewsPage  clickTheSaveButton()
{
	clickSave.click();
	return this;
}
public boolean isAlertDisplayed()
{
	return alertBox.isDisplayed();
}
}
