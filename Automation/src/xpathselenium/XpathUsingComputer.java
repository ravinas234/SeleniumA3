package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingComputer {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/desktops");
		driver.findElement(By.xpath("//a[text()=\"Simple Computer\"]/../..//input[@value='Add to cart']")).click();
		driver.quit();
	}

}
