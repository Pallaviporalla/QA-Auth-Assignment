package Qatest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://automationexercise.com/login");
	driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("pallavi3145@gmail.com");
	driver.findElement(By.name("password")).sendKeys("eRaghu@123");
	driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	// Verify Login
//	String loggedInUser = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]")).getText();
	String error = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getText();

	if (error.equals("Your email or password is incorrect!")) {
		System.out.println("Invalid Login Test Passed");
	} else {
		System.out.println("Invalid Login Test Failed");
	}
	Thread.sleep(10000);
	 ScreenshotUtil.captureScreenshot(driver, "InvalidLogin");
	driver.quit();
}
}