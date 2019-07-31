package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Generic.BaseClass;
import TestActions.CommonActions;



public class PatientEMRTest extends BaseClass{
	

	CommonActions commonActions;
	
	
	@BeforeMethod
//	@Parameters({"builderName"})
	public void setUp()
	{
//		Value = builderName;
		commonActions = new CommonActions(USERNAME,PASSWORD,"Y");
	}
	
	@Test(priority = 1)
	public void test()
	{
		commonActions.Test();
	}
	
}
