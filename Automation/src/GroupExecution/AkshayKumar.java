package GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AkshayKumar {
	@Test(groups ="TFI")
	public void executeScript() {
	Reporter.log("AK",true);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/akshaykumar/?hl=en");
	driver.quit();
}
}
