package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropByCoordinates {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
	WebElement slider1= driver.findElement(By.xpath("//span[contains(@class, 'irs-slider from')]"));
	Actions actions = new Actions(driver);
	
	actions.dragAndDropBy(slider1, 30, 0).perform();
}
}
