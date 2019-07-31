package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic.AutomationData;

public class Test1 implements AutomationData{
	
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
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "/home/debjyoti/Desktop/Driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://10.8.55.122/instanmc/loginForm.do");
				
		
	}
}
