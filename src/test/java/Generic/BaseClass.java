package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass implements AutomationData{

	
	public static WebDriver driver;
	 
	 static
	 {
		// System.setProperty(CHROME_KEY, CHROME_VALUE);
		 System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	 }
	 
	public static void Initlization()
	{
		//driver  = new ChromeDriver();
		driver  = new FirefoxDriver(); //This starts Web Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	
		driver.get(URL);
	}
	
}
