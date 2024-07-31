package CapturingScreenshot;
//For failed condition we use Takescreenshot()
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfWebPage {
	public static void main(String[] args) throws IOException
	{
		LocalDateTime ldt = LocalDateTime.now();
		//System.out.println(ldt); //It will display current/loacl date,time
		String time = ldt.toString().replace(":", "-"); 
		//instaed of sop stmt we can use toString()
		//Will get FileNotFoundException bcoz of :::colon so i will replace the colon with -
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pinterest.com/lgvandy/disney-cinderella/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\image2"+time+".png");
		//.(dot) indicates automation folder then src -> Screenshot\\image.png
		
		FileHandler.copy(screenshot,dest);
	}
}
		
		/*
		 * we have to store all resource file in jar [project folder Ex: Screenshot, Resource]
		 * C:\Users\Dell\eclipse-workspace\Automation\Screenshot
		 * 
		 * */

