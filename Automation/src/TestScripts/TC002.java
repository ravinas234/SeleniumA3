package TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC002 {
	@Test(invocationCount = 5)
	public void TestExecuteScript1() //Testcase
	{
		//System.out.println("Hello Test NG script");
		Reporter.log("Executing test case 1" , true);  //printing msg on report
	}	
	
	@Test(priority = -5)
	public void TestExecuteScript2()
	{
		Reporter.log("Executing test case 2" , true);  //Test_Steps
	}	
}


