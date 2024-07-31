package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jawa {

	@Test 
	public void jawaa() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://autos.maxabout.com/bikes/jawa/42/42-galactic-green");
		driver.quit();
	}
}
