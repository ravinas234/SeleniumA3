package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GT650 {

	@Test
	public void continentalGT650() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/royalenfield-bikes/continental-gt/");
		driver.quit();
	}
}
