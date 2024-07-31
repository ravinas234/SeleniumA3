package methodsel;


//BrowserWindowCorner
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowCorner
{

  public static void main(String[] args) throws InterruptedException 
  {
      // Set the path to your ChromeDriver executable
      //System.setProperty("webdriver.chrome.driver");

      // Initialize ChromeDriver
     // WebDriver driver = new ChromeDriver();

      ChromeDriver driver = new ChromeDriver();
      
     // try {
          // Maximize the window to get the screen dimensions
          driver.manage().window().maximize();

          // Get the screen dimensions
          Dimension screenSize = driver.manage().window().getSize();

          // Set the desired size for the window (e.g., 800x600)
          Dimension windowSize = new Dimension(700, 800);

          // Set the window size
          driver.manage().window().setSize(windowSize);

          // Set the window position to the top-left corner
          driver.manage().window().setPosition(new Point(0, 0));

          // Navigate to a webpage
          driver.get("https://www.example.com");

          // Keep the program running for a while so you can see the window
          Thread.sleep(5000); // Wait for 5 seconds

      } 
 
  }

