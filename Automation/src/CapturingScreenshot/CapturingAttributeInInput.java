package CapturingScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//13_june_24

public class CapturingAttributeInInput {
	public static void main(String[] args)
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/login");
		//WebElement emailTextBox = driver.findElement(By.id("Email"));
		//emailTextBox.sendKeys("Admin02");
		//System.out.println(emailTextBox.getAttribute("value"));
		
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("Admin02");
		System.out.println(emailTextBox.getAttribute("value"));
		driver.close();
	}
}
