package ActionsClassMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollingByUsingScrollByAmount {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com");
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 1000).perform();
		driver.close();
}
}