package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseClass;

public class LoginPage extends BaseClass{
	 
	@FindBy(id = "userId")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "button")
	WebElement submitButton;

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String userNAme) 
	{
		userName.sendKeys(userNAme);
	}
	
	public void setPassword(String passWOrd) 
	{
		password.sendKeys(passWOrd);
	}
	
	public void clickOnButton() 
	{
		submitButton.click();
	}
	
}
