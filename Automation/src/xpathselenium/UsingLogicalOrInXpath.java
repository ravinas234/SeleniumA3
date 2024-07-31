package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLogicalOrInXpath {
public static void main(String[] args){
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	//if 1st element not present then only it will go for 2nd element
	
	driver.findElement(By.xpath("//input [@id='gender-mmale' or @id='gender-female']")).click();
	driver.quit();
}
}
