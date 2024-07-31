package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseFrameInDream11 {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		//driver.switchTo().frame(0);
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
}
}
