package methodsel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//click on parivahan site and click on sitemap -> then NR services[29_May_24]

public class VahanParivahanTask {
	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://parivahan.gov.in/parivahan//");
	driver.findElement(By.linkText("Sitemap")).click();
	
	String currentUrl = driver.getCurrentUrl();
	
	driver.findElement(By.linkText("NR Services")).click();
	String currentUrl1 = driver.getCurrentUrl();
	driver.quit();
	
	}
}
