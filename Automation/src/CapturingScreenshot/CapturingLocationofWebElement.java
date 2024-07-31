package CapturingScreenshot;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingLocationofWebElement {
  public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		
		Point loc = logo.getLocation();
		System.out.println("X coordinate : "+loc.getX());
		System.out.println("Y coordinate : "+loc.getY());
		driver.close();
		
}
}
