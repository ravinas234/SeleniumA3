package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//switching window to a frame

public class ToWorkOnNestedFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");
		driver= driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//body[text()='Parent frame']"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(""));
		
	}
}
