package Waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWorkWithShopperstack {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/15");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//Check Delivery
		driver.findElement(By.id("Check Delivery")).sendKeys("411027");
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		driver.findElement(By.id("Check")).click();		
	}
}
