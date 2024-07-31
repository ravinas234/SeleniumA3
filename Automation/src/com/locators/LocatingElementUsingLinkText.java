package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingLinkText 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//for search bottle in search bar 
		driver.findElement(By.id("small-searchterms")).sendKeys("Bottle", Keys.ENTER);
						
		//driver.findElement(By.linkText("Register")).click();
		
		//driver.findElement(By.linkText("Books")).click();
		
		//driver.get("https://www.skillrary.com/");
		//driver.findElement(By.linkText("ENGLISH")).click();
		driver.quit();
	}

}
