package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTextXpath {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//a[.='Mobiles']")).click();
		driver.quit();
	}

}
