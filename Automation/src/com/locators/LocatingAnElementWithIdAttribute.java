package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithIdAttribute 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("ravinashinde9617@gmail.com");
		//Password
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		passwordTextBox.sendKeys("ravina123");
		driver.quit();
	}
}
