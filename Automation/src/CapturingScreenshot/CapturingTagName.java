package CapturingScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//14_June_ capturing TagName 
public class CapturingTagName 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement searchBar = driver.findElement(By.xpath("//input[@aria-label=\"Search Ajio\"]"));
		System.out.println(searchBar.getTagName());
	}
}
