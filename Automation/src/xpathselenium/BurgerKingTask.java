package xpathselenium;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BurgerKingTask {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Desktop/Assessment1.html");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=' Click Me !!!']")).click();
		
		//get all all 5 window ids 
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId:allWindowIds) 
		{
			Thread.sleep(3000);
			driver.switchTo().window(windowId);
			if(driver.getCurrentUrl().contains("burgerking.in"))
			{
				driver.close();
			}
		}
				
	}

}

 