package GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VickyKaushal {
	
	@Test(groups ="Bollywood")
		public void executeScript() {
		Reporter.log("Vicky",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/vickykaushal09/?hl=en");
		driver.quit();
	}
	
}
