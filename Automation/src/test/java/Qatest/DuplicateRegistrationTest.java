package Qatest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateRegistrationTest {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationexercise.com");

		// Click Signup / Login
		driver.findElement(By.linkText("Signup / Login")).click();
	  System.out.println("Page Title: " + driver.getTitle());
		  driver.findElement(By.name("name")).sendKeys("Pallavi");
		  //email field
		  driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("pallavi1145@gmail.com");
		  
		  driver.findElement(By.xpath("//button[text()='Signup']")).click();
		  String error = driver.findElement(By.xpath("//p[text()='Email Address already exist!']")).getText();

			if(error.equals("Email Address already exist!")) {
				System.out.println("Duplicate Registration Test Passed");
			}
			else {
				System.out.println("Duplicate Registration Test Failed");
			}
			Thread.sleep(10000);
			 ScreenshotUtil.captureScreenshot(driver, "DuplicateRegistartion");
			 driver.quit();
			 
		  }
}
