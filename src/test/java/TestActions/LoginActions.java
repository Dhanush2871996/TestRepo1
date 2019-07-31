package TestActions;

import Generic.BaseClass;
import Pages.LoginPage;

public class LoginActions extends BaseClass{

static LoginPage loginObj;
	
    public LoginActions(String userNAme,String passWOrd,String shouldInitlization)
    {
    	if(shouldInitlization.equals("Y"))
    		{
    		Initlization();
    		loginObj= new LoginPage(driver);
    		}
    	
		 
		loginObj.setUserName(userNAme);
		loginObj.setPassword(passWOrd);
		loginObj.clickOnButton();
    }
	
    static public void logIn(String userNAme,String passWOrd)
    {
    	loginObj= new LoginPage(driver);
		 
		loginObj.setUserName(userNAme);
		loginObj.setPassword(passWOrd);
		loginObj.clickOnButton();
    }
    
	
}
