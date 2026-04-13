

package basic;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selnm {
	public static void main(String[] args) {
	
ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("passward")).sendKeys("secret_sauce");	
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/inputs")).click();
		driver.close();
		
	
	}
}
