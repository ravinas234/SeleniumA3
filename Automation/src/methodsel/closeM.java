package methodsel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeM {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//to launch the web application
		//driver.get("https://omayo.blogspot.com/");
		
		//to click on window popup
		
		/*driver.findElement(By.linkText("Open a popup window")).click();
		
		//use close method
		//driver.close();
	//use quit method
		driver.quit();
		
		*/
		
	}

}
