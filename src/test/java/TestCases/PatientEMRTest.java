package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Generic.BaseClass;
import TestActions.CommonActions;



public class PatientEMRTest extends BaseClass{
	

	CommonActions commonActions;
	@DataProvider
	public String[] MrNoProvider()
	{
		return Mr_Nos;
	}
	
	
	@BeforeClass
//	@Parameters({"builderName"})
	public void setUp()
	{
//		Value = builderName;
		commonActions = new CommonActions(USERNAME,PASSWORD,"Y");
	}
	
	@Test(priority = 1,dataProvider = "MrNoProvider")
	public void test(String MRNo)
	{
		boolean results = true;
		String defectLinksNames = "";
		List<String> defectLinks = commonActions.Test(MRNo);
		if(defectLinks.size()>0) results = false;
		for(int i=0;i<defectLinks.size();i++) {
		defectLinksNames = "The links in which exception occored are :- \""+defectLinks.get(i)+", \"";
		}
		
		System.out.println(defectLinksNames);
		//assertTrue(results, defectLinksNames);
		driver.get("http://10.8.55.122/instanmc/home.do");
		assertEquals(results, true, defectLinksNames);
		
	}
	
}
