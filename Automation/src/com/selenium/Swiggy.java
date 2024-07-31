package com.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy {

	public static void main(String [] args)
	{
		//to launch browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//to launch web app
		driver.get("https://www.swiggy.com/");
		String actualTitle = driver.getTitle();
		//String expectedTitle = "Swiggy";
		
		String expectedTitle = "";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is wrong");
		}
	}                                                           
	
}
