package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoEx {
	public static void main(String[] args) {
//https://www.nobroker.in/property/rent/pune/Chinchwad%20Gaon?searchParam=W3sibGF0IjoxOC42Mjc2MDgyLCJsb24iOjczLjc4MDg4LCJwbGFjZUlkIjoiQ2hJSndSU054THE1d2pzUlVPWHVVZ0dNQ2lRIiwicGxhY2VOYW1lIjoiQ2hpbmNod2FkIEdhb24ifV0=&radius=2.0&sharedAccomodation=0&city=pune&locality=Chinchwad%20Gaon&rent=4000,500000
//div[contains(@class, 'rc-slider-handle rc-slider-handle-1')]
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nobroker.in/property/rent/pune/Chinchwad%20Gaon?searchParam=W3sibGF0IjoxOC42Mjc2MDgyLCJsb24iOjczLjc4MDg4LCJwbGFjZUlkIjoiQ2hJSndSU054THE1d2pzUlVPWHVVZ0dNQ2lRIiwicGxhY2VOYW1lIjoiQ2hpbmNod2FkIEdhb24ifV0=&radius=2.0&sharedAccomodation=0&city=pune&locality=Chinchwad%20Gaon&rent=4000,500000");
		WebElement slider1 = driver.findElement(By.xpath("//div[contains(@class, 'rc-slider-handle rc-slider-handle-1')]"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(slider1, 30, 0).perform();
		actions.dragAndDropBy(slider1, -30, 0).perform();
		
	}
}
