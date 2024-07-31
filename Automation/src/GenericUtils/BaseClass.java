package GenericUtils;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import elementRepository.BasePage;
import elementRepository.LoginPage;

public class BaseClass implements IAutoConstants, ITestListener{
	
	public static WebDriver driver;
	public FileLibrary flib;
	public BasePage bp;
	public LoginPage lp;
	
	//public TakesScreenshot ts;
			
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test", true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite", true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test", true);
	}
	
	@Parameters("bname")
	
		
	@BeforeClass
	public void launchingBrowser(@Optional("chrome") String browserName) {
		
		Reporter.log("Before Class", true);
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) 
			driver = new ChromeDriver();
			lp = new LoginPage(driver);
			bp= new BasePage(driver);
			flib = new FileLibrary();
					
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));
		//driver.quit();	
	}
			
	@AfterClass
	public void tearDownBrowser() {
	Reporter.log("After class", true);
	driver.close();
	//driver.quit();
	}
	
	@BeforeMethod
	public void navigateAndLoginToDWS() {
		Reporter.log("Before Method", true);
		driver.get(flib.fetchDataFromProperties(PropertyFilePath, "url"));
		lp.getLoginLink().click();
		lp.getEmailTextBox().sendKeys(flib.fetchDataFromProperties(PropertyFilePath, "email"));
		lp.getPasswordTextBox().sendKeys(flib.fetchDataFromProperties(PropertyFilePath, "password"));
		lp.getLoginButton().click();
		//loginButton
		
		}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("After Method", true);
		lp.getLogoutLink().click();
	}
	
	//** Listeners **
	
	@Override
	public void onTestStart(ITestResult result) {
		//when method is started it will track
		Reporter.log("[Testcase --"+result.getName()+"-- is started]");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[Testcase --"+result.getName()+"-- is passed]");
		//ITestResult result= will get the name of the result
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[Testcase --"+result.getName()+"-- is failed]");
		LocalDateTime ldt = LocalDateTime.now();
		 String time = ldt.toString().replace(":", "-");
	    TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);	
	    File dest = new File(screenshotpath+"Screenshot.png");
	    try {
	    	FileHandler.copy(src, dest);
	    }catch (Exception e) {
			    	
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Testcase --"+result.getName()+"-- is skipped]");
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("[<test> --"+context.getName()+"-- is started]");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("[<test> --"+context.getName()+"-- is finished]");
	}

	
		
}
