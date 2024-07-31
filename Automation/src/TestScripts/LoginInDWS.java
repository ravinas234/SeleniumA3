package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginInDWS {
	@Test
	public void loginScenario(){
		String expectedTitle = "Demo Web Shop";
		String expectedLoginPageTitle ="Demo Web Shop. Login";
		SoftAssert softassert = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String actualTitle = driver.getTitle();
		softassert.assertEquals(actualTitle, expectedTitle, "title verification at welcome page");
		driver.findElement(By.partialLinkText("Log in")).click();
		String actualLoginPageTitle= driver.getTitle();
		softassert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"title of Login Page");
		driver.findElement(By.id("Email")).sendKeys("sanika234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sanika@234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		softassert.assertAll(); //assrtAllIt will capture all failure 
	}
	
}
