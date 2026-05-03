package akh;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ept_test {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://eptura.com/careers/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/nav/div[1]/div/div[2]/a[1]"))).click();
	
		driver.findElement(By.id("enter-email")).sendKeys("eptura@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/a")).click();
		
		
    
        
        
	}
}
