package CapturingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		File src= logo.getScreenshotAs(OutputType.FILE);  //
		File dest = new File(".//Screenshot/Meeshologo.png");
		FileHandler.copy(src, dest);
		 
		
		//fH of selenium
	}
}
//img[@alt]
/*FE will return 
 * gs- 
 * 
 */
