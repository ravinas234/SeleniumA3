package xpathselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexWebshop {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/cell-phones");
		driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[2]")).click();
		//click on phone cover product in cell phone option
	}

}
