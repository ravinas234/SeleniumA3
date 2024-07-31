package methodsel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//https://www.facebook.com/login/
		//tagname is : button
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("krish144dev@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Krishna@144");
		driver.findElement(By.tagName("button")).click();
		//login_button
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
	}
}
