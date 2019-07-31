package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseClass;

public class PatientEMR extends BaseClass{

	@FindBy(id = "ps_mrNo")
	WebElement patientMRno;
	
	@FindBy(xpath= "//input[@value=\"Get Details\"]")
	WebElement getDetailsButton;
	
	@FindBy(linkText = "ExpandAll")
	WebElement expandAllLink;
	
	
	public PatientEMR(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterMrNumberOfPatient(String MR_No)
	{
		patientMRno.clear();
		patientMRno.sendKeys(MR_No);
	}
	
	public void clickOnGetDetailsButton()
	{
		getDetailsButton.click();
	}
	
	public void clickOnExpandAllLink()
	{
		expandAllLink.click();
	}
	
	public List<WebElement> getAllLinksInThePage()
	{
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 return links;
	}
	
}
