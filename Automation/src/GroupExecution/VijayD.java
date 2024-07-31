package GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VijayD {
	@Test(groups ={"KFI", "Panindia"})
	public void executeScript() {
	Reporter.log("vijay",true);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/thedeverakonda/?hl=en");
	driver.quit();
}
}
