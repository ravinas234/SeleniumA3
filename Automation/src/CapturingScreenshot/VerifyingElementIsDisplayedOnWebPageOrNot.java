package CapturingScreenshot;
//isDisplayed() : return boolean
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingElementIsDisplayedOnWebPageOrNot {
	public static void main(String[] args) {
		//title="Matrimony Service by Shaadi.com"
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Matrimony Service by Shaadi.com']"));
		System.out.println(logo.isDisplayed());
		driver.close();
		
	}

}
