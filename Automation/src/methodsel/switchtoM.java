package methodsel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoM {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		//to launch web application
		driver.get("https:www.google.com");
		driver.switchTo().activeElement().sendKeys("oldmumbai Icecream", Keys.ENTER);
		driver.quit();
					
}
}