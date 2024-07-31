package KeyBoardActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseSendKeysOfActions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		WebElement textBox = driver.findElement(By.name("q"));
		Actions actions = new Actions(driver);
		//actions.sendKeys(textBox, "KGF chapter 1").perform();
		actions.moveToElement(textBox).sendKeys("KGF chapter 2");//first search data
		actions.keyDown(Keys.ENTER).perform();
		actions.keyDown(Keys.ENTER).perform();//release
		driver.close();
	}
}
