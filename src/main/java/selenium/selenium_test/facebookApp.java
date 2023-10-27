package selenium.selenium_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Set the path to the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");

        // Create a new instance of ChromeDriver.
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Facebook.
            driver.get("https://www.facebook.com/");

            // Find the username and password input fields and enter the credentials.
            WebElement emailInput = driver.findElement(By.id("email"));
            WebElement passwordInput = driver.findElement(By.id("pass"));

            emailInput.sendKeys("asefatareda@gmail.com"); // Replace with your actual username.
            passwordInput.sendKeys("goodNoLuck!"); // Replace with your actual password.

            // Find the login button and click it.
            WebElement loginButton = driver.findElement(By.name("login"));
            loginButton.click();

            // Add your further test steps here, if needed.
            
            // Pause for visualization purposes.
            Thread.sleep(15000); 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser.
            driver.close();
        }

	}

}
