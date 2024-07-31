package methodsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titletask2 {

    public static void main(String[] args)
    {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a webpage
            driver.get("https://www.zomato.com");

            // Get the title of the current window
            String currentTitle = driver.getTitle();

            // Expected title
            String expectedTitle = "Example Domain";

            // Check if the current title matches the expected title
            if (currentTitle.equals(expectedTitle)) {
                // If matched, print the title and close the window
                System.out.println("Title of the window is: " + currentTitle);
                driver.close();
                System.out.println("Window closed successfully.");
            } else {
                // If not matched, print an error message
                System.out.println("Title mismatch. Expected: " + expectedTitle + ", Found: " + currentTitle);
            }
        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
        } finally {
            // Quit the WebDriver instance
            driver.quit();
        }
    }
}
