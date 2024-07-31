package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLoginUsingXpath {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("gauri234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gauri@234");
		//RememberMe
		driver.findElement(By.id("RememberMe")).click();
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//driver.findElement(By.className("login-button")).click();
		//driver.quit();
		
	
	}

}
