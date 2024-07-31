package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropOnHtmlGoodies {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	
	WebElement capitalbox1 = driver.findElement(By.id("box1")); //source
	WebElement country = driver.findElement(By.id("box101"));//destination
	Actions actions = new Actions(driver);
	actions.dragAndDrop(capitalbox1, country).perform();
	
	//box3 capital_ washigton_United States
		Thread.sleep(2000);
		WebElement capitalbox3 = driver.findElement(By.id("box3"));
		WebElement country2 = driver.findElement(By.id("box103"));
		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(capitalbox3, country2).perform();
		
		
	
		
}
}
