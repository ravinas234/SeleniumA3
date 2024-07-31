package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickHoldRelease {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement capital = driver.findElement(By.id("box1"));
		WebElement country = driver.findElement(By.id("box101"));
		Actions actions = new Actions(driver);
		//actions.clickAndHold(capital).release(country).perform();
		//actions.moveToElement(capital).clickAndHold().moveToElement(country).release().perform();
		//actions.clickAndHold(capital).moveToElement(country).release().perform();
		actions.moveToElement(capital).clickAndHold().release(country).perform();
	}
}
