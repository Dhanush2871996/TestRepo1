package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="/html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[1]/dl/dt[6]/span")
	WebElement medicalRecords;
	
	@FindBy(linkText = "Patient EMR")
	WebElement patientEMR;
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}

	//***********Action on elements************//
	
	public void clickOnMedicalRecordsDropDown()
	{
		medicalRecords.click();
	}
	
	public void clickOnPatientEMRlink()
	{
		patientEMR.click();
	}
	
}
