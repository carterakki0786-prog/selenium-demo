
package akh;

/*import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chat_gpt_learnig {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-scauce-labs-backpack")).click();
		
		
	}
}
*/





import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Chat_gpt_learnig {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Wait + maximize
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Login
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Wait until inventory page loads (important)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_item")));

        // Add product to cart (with wait)
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("add-to-cart-sauce-labs-backpack"))).click();

        // Validate cart count
        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();

        if(cartCount.equals("1")) {
            System.out.println("✅ Product added successfully");
        } else {
            System.out.println("❌ Cart count mismatch");
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"))).click();
      driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();  
      wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
      driver.findElement(By.id("checkout")).click();
      driver.findElement(By.id("first-name")).sendKeys("akh");
      driver.findElement(By.id("last-name")).sendKeys("singh");
      driver.findElement(By.id("postal-code")).sendKeys("225001");
      wait.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
      driver.findElement(By.id("continue")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.id("finish")));
      driver.findElement(By.id("finish")).click();
      
      
      
       }
}






















