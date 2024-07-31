package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bikes {
	@Test
	public void continentalGT650() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/royalenfield-bikes/continental-gt/");
		driver.quit();
	}
	
	@Test //dependsOnMethods = "jawa"
	public void harleyDavidson() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/harleydavidson-bikes/x440/");
		driver.quit();
	}
	
	@Test (timeOut = 18000)//invocationCount = 2,enabled = false
	public void jawa() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://autos.maxabout.com/bikes/jawa/42/42-galactic-green");
		//Assert.fail();
		driver.quit();
	}
}
