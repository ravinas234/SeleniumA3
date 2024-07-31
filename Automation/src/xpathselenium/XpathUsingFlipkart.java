package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingFlipkart {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.partialLinkText("Mobiles")).click();
		driver.findElement(By.xpath("//a[text()='Apple iPhone 13 (Starlight, 128 GB)']/../../..//*[name()='svg']")).click();
		
		////a[text()='Apple iPhone 13 (Starlight, 128 GB)']/../../..//*[name()='svg']
	}

}
