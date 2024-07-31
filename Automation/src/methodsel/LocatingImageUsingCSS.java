package methodsel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingImageUsingCSS {
	public static void main(String[] args) {
	
	//img[alt="POCO M6 5G (Polaris Green, 128 GB)"]
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER);
	
	//driver.findElement(By.partialLinkText("Mobiles")).click();
	//Thread.sleep(4000);   //for waiting & loading the page
	
	driver.findElement(By.cssSelector("img[alt='Apple iPhone 15 (Green, 128 GB)']")).click();
			//("img[alt="POCO M6 5G (Polaris Green, 128 GB)"]").click();
	}
}
