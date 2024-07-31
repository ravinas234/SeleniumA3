package TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;

public class TestScipt001 extends BaseClass{
	@Test
	public void executeScript1() {
		Reporter.log("ExecuteScript1", true);
	}
	
	@Test
	public void executeScript2() {
		Reporter.log("ExecuteScript2", true);
	}
}
