package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandAxesUsingChild {

		public static void main(String[] args) 
			{
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Dell/Desktop/Axes1.html");
						
			//div[@class='Mammals']/child::div@class='Carnivore']
			
			String text1= driver.findElement(By.xpath("div[@class='Mammals']/child::div@class='Carnivore']")).getText();
			System.out.println(text1); 
					
			//driver.quit();
			
			}
	
	}



