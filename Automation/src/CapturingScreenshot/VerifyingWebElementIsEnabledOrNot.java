package CapturingScreenshot;
//isEnabled() : boolean
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//14_June_Friday

public class VerifyingWebElementIsEnabledOrNot
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement element = driver.findElement(By.xpath("//b[text()='Become a Subscriber']/../../..//input"));
		System.out.println(element.isEnabled());
		
		 WebElement searchbox = driver.findElement(By.id("navbar-search-input"));
		 System.out.println(searchbox.isEnabled());
		 driver.close();
	}
}