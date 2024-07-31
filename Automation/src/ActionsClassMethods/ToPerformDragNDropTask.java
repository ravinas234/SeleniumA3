package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToPerformDragNDropTask {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	Actions actions = new Actions(driver);
	for(int i=1;i<=7;i++)
	{	
		WebElement capital = driver.findElement(By.id("box1" + i)); //source
		WebElement country = driver.findElement(By.id("box101"+ i));//destination
		actions.dragAndDrop(capital, country).perform();
		actions.dragAndDrop(capital, country).build().perform();
		Thread.sleep(4000);
	}	
}
}
