package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathAddToCart {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/cell-phones");
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();	
		driver.findElement(By.xpath("//a[text()='Phone Cover']/../..//input[@value='Add to cart']")).click();
		
	}
}
