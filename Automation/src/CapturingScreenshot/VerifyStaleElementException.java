package CapturingScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyStaleElementException {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("Admin", Keys.TAB);
		
		//driver.findElement(By.id("Email")).sendKeys("Admin", Keys.TAB);
		
	
	}
}
