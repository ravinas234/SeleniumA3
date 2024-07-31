package methodsel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingClass {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ravina123");
		driver.findElement(By.className("login-button")).click();
		driver.quit();
	}
}