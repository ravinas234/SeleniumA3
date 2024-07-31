package methodsel;

//import java.awt.Window;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageSource 
{
	public static void main(String [] args)
	{
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	//to fetch source code
	
	String sourcecode = driver.getPageSource();
	System.out.println(sourcecode);
}
}