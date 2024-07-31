package com.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithName {
	public static void main(String[] args)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement radioButton=  driver.findElement(By.name("Gender"));
	radioButton.click();
	//firstname
	WebElement firstnameTextBox = driver.findElement(By.id("FirstName"));
	firstnameTextBox.sendKeys("Ravina");
	//Lastname	
	WebElement lastnameTextBox = driver.findElement(By.id("LastName"));
	lastnameTextBox.sendKeys("Shinde");
	WebElement emailTextBox = driver.findElement(By.id("Email"));
	emailTextBox.sendKeys("ravinashinde234@gmail.com");
	//Password
	WebElement passwordTextBox = driver.findElement(By.id("Password"));
	passwordTextBox.sendKeys("ravina123");
	//ConfirmPassword
	WebElement confirmPass = driver.findElement(By.id("ConfirmPassword"));
	confirmPass.sendKeys("ravina123");
	}
}
