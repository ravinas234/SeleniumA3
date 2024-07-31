package methodsel;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(100, 500);
		
		//driver.manage().window().setSize(dimension);
		driver.manage().window().setSize(new Dimension(100, 500)); //direct pass argument
				
	}
}
