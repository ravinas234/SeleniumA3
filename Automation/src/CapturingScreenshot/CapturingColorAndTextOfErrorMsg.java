package CapturingScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//14_june
public class CapturingColorAndTextOfErrorMsg {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("Admin", Keys.TAB);
		WebElement erromsg = driver.findElement(By.xpath("//span[@data-valmsg-for='Email']"));
		System.out.println(erromsg.getText());
		System.out.println(erromsg.getCssValue("color"));
		System.out.println(erromsg.getCssValue("font-weight"));
		System.out.println(erromsg.getCssValue("font-family"));
		driver.close();
		
		////span[@data-valmsg-for='Email']
	}
}
