package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainxTextflipkart {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("Iphone 15", Keys.ENTER);
		
		//it will give the price of product[in string format]
		String price = driver.findElement(By.xpath("(//div[text()='Apple iPhone 15 (Green, 256 GB)']/../../..//div[contains(text(),'₹')])[1]")).getText();
		
		System.out.println(price);
	}
	////div[text()='Apple iPhone 15 (Green, 256 GB)']/../../..//div[contains(text(),'₹')]
	}
