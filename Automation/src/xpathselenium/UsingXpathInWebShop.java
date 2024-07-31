package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathInWebShop {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//strong[text()='Your Personal Details']/../..//input[@id='Email']")).click();
		//driver.findElement(By.xpath("//strong[text()='Your Personal Details']/../..//input[@id='Email']")).click();

		driver.findElement(By.id("Email")).sendKeys("ravinashinde9617@gmail.com");
	}
	////strong[text()='Your Personal Details']/../..//input[@id='Email']
////input[@value='Add to cart']
	////a[text()='Phone Cover']/../..//input[@value='Add to cart']
	//value="Add to cart"
}
