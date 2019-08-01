package TestActions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import Generic.BaseClass;
import Pages.HomePage;
import Pages.PatientEMR;

public class CommonActions extends BaseClass{
	
	HomePage homePage;
	PatientEMR patientEMR;

	public CommonActions(String userName,String passWord, String shouldInitlization){
		
		LoginActions testLoginPage = new LoginActions(userName,passWord,shouldInitlization);
		homePage = new HomePage(driver);
		patientEMR = new PatientEMR(driver);
	}

//Test Case 1
	public List<String> Test(String Mr_No){
		
		List<String> defectLinks = new ArrayList<String>();
		homePage.clickOnMedicalRecordsDropDown();
		homePage.clickOnPatientEMRlink();
		patientEMR.enterMrNumberOfPatient(Mr_No);//MR No.should take from data provider
		patientEMR.clickOnGetDetailsButton();
		patientEMR.clickOnExpandAllLink();
		
		List<WebElement> links = new ArrayList<WebElement>();
		links = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> a = links.iterator();
		
		
		
		while(a.hasNext()) {
			WebElement link = a.next();
			String linkText = link.getText();
			if(!(linkText.equals("")|linkText.equals(" ")|linkText.equals("My Notifications (0)")|linkText.equals("My Page")|linkText.equals("Search")|linkText.equals("Registration")|linkText.equals("Registration")|linkText.equals("Billing")|linkText.equals("Payments")|linkText.equals("Patient")|linkText.equals("Medical Records")|linkText.equals("Laboratory")|linkText.equals("ExpandAll")|linkText.equals("Lab Report EMR")|linkText.equals("EMR Audit Log")|linkText.equals("Test Trend Report")|linkText.equals("Vitals Trend Report")|linkText.equals("Medicine Prescription History")|linkText.equals("< Prev")|linkText.equals("Next >")|linkText.equals("Release Notes")|linkText.equals("Acknowledgement")|linkText.equals("Help")|linkText.equals("Customer Support"))) {
			link.click();
			
			try {
					driver.switchTo().frame(0);
					if(driver.findElement(By.xpath("//h1[contains(text(),'Exception')]")).isDisplayed()) {
						
					System.out.println(linkText+" =========> "+ " Getting Exception fro this link");
					defectLinks.add(linkText);	
				}

			}
			catch (NoSuchElementException e) {
				System.out.println("No Exceptions");
			}
			catch (StaleElementReferenceException e) {
				
			}
			driver.switchTo().parentFrame();		
			}
		}
		return defectLinks;
	} 
	
	
	
}
