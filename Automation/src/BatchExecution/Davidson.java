package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Davidson {
	@Test 
	public void harleyDavidson()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/harleydavidson-bikes/x440/");
		driver.quit();
	}
}
