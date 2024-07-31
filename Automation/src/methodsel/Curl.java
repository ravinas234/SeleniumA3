package methodsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Curl {
	public static void main(String [] args)
	{
	WebDriver driver = new ChromeDriver();
	
	//to maximize the window
	driver.manage().window().maximize();
	
	//to launch the web app
	String url = driver.getCurrentUrl();
	
	//System.out.println();
	System.out.println("Current URL: " + url);
	
}
}