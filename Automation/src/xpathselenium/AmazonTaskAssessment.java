package xpathselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTaskAssessment
{
	//Display all the price pf product
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 15 (128 GB) - Blue')]/../../../..//button")).click();
		driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		
		//span[contains(text(),'iPhone 15 (128 GB) - Blue']/../../../../button
String price= driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB) - Blue')]/../../../..////span[@class='a-price-whole']")).getText();
		
		
		System.out.print(price);
		//span[text()='Apple iPhone 15 (128 GB) - Blue']/../../../..//span[@class='a-offscreen']
	}
	
}

 
