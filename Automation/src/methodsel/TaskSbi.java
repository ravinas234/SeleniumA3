package methodsel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSbi
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String parentWindowId = driver.getWindowHandle();
		
		//need to click CONTINUE TO LOGIN
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		
		//after clicking forgot username so it will open child window and We need to remove parent window and switch to child
		Set<String> allwindowIds = driver.getWindowHandles();
				
		allwindowIds.remove(parentWindowId);
		for(String windowId: allwindowIds)
		{
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextStep")).click(); //nextStep
		driver.findElement(By.id("userName")).sendKeys("Ravina");  //userName
		driver.findElement(By.id("accountNo")).sendKeys("1900100095574");  //id="accountNo"
		driver.findElement(By.id("mobileNo")).sendKeys("9900887766");
		driver.findElement(By.id("datepicker5")).sendKeys("15/11/1997"); //id="datepicker5"
		driver.findElement(By.id("go")).click();
		
	}

}
