package TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;

@Listeners(GenericUtils.BaseClass.class)
//Listeners used for tracking the testcase
public class DWSTC002 extends BaseClass {
	
	@Test
	public void verify_user_is_able_to_add_a_Product_to_wishlist() {
		//driver.findElement(By.id("ravina"));
		System.out.println("hello");
	}
}
