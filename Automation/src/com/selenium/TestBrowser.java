package com.selenium;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.Main;

public class TestBrowser
{
	public static void main(String[] args)
	 {
		WebDriver chromeDriver = new ChromeDriver();
		//WebDriver chromeDriver = null;
		chromeDriver.get("https://www.exmple.com");
		System.out.println("Chrome launched");
		
	WebDriver firefoxDriver = new FirefoxDriver();
	firefoxDriver.get("https://www.example.com");
	System.out.println("firefox launched");
	
		
	WebDriver edgeDriver = new EdgeDriver();
	edgeDriver.get("https://www.example.com");
	System.out.println("Edge launched");
	FirefoxDriver firefoxDriver2 = new FirefoxDriver();
	
	firefoxDriver.quit();
	chromeDriver.quit();
	edgeDriver.quit();
	//driver.quit();
}

}