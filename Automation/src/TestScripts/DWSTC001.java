package TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;

public class DWSTC001 extends BaseClass {
	@Test
	public void verify_a_Product_can_be_added_to_the_cart() {
		bp.getElectronicsLink().click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.partialLinkText("Smartphone")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
	
}
