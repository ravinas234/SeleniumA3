package CapturingScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingAttributeValues {
	public static void main(String[] args) {
		//
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@data-testid='shaadi_logo']"));
		String value = logo.getAttribute("alt");
		System.out.println(value);
	}
}
