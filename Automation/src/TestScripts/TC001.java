package TestScripts;

import org.openqa.selenium.support.PageFactory;

import GenericUtils.BaseClass;
import elementRepository.BasePage;

public class TC001 extends BaseClass {
	public static void main(String[] args) {
		openBrowser();
		driver.get("https://demowebshop.tricentis.com/");
		
		//need to access ele from BASEpage
		BasePage bp = new BasePage(driver);
		PageFactory.initElements(driver, bp);
		bp.getRegisterLink().click();  //to achieve data hiding need to use private
	
	}
}
