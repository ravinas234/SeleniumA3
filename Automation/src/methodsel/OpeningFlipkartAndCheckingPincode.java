package methodsel;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningFlipkartAndCheckingPincode {
	public static void main(String[] args)
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER);
		driver.findElement(By.partialLinkText("Apple iphone 15 (Green , 256GB)")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId: allWindowIds) {
			driver.switchTo().window(windowId);
			
	}		
		driver.findElement(By.id("pincodeInputId")).sendKeys("411002",Keys.ENTER);
		driver.quit();
	}
}
