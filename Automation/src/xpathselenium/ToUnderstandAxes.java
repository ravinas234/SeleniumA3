package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandAxes {
public static void main(String[] args) 
	{
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Dell/Desktop/Axes1.html");
	String text= driver.findElement(By.xpath("//div[@class='Mammals']/parent::div")).getText();
	System.out.println(text);
	
	//div[@class='Mammals']/child::div@class='Carnivore']
	
			
	
	
	//driver.quit();
	
	}

}
