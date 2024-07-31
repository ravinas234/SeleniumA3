package methodsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateM
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//to launch zomato
	driver.navigate().to("https://www.zomato.com");
	
	//used to launch swiggy
	driver.navigate().to("https://www.swiggy.com/");
	
	driver.navigate().back();
	Thread.sleep(3000);	
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	driver.close();
		
	}
}
