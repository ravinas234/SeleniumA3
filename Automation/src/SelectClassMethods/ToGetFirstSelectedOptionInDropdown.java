package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetFirstSelectedOptionInDropdown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropDown = driver.findElement(By.id("cars"));
		  Select select = new Select(dropDown);
		  select.selectByIndex(0);
		  select.selectByIndex(2);
		  select.selectByIndex(4);
		  System.out.println(select.getFirstSelectedOption().getText());
	}
}

