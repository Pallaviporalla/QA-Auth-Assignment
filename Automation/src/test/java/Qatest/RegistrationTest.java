package Qatest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {

	 public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com");

		// Click Signup / Login
		driver.findElement(By.linkText("Signup / Login")).click();
		System.out.println("Page Title: " + driver.getTitle());
		  driver.findElement(By.name("name")).sendKeys("Pallavi");
		  //email field
		  driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("pallavi3145@gmail.com");
		  
		  driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		  driver.findElement(By.xpath("(//input[@name=\"title\"])[2]")).click();
		  driver.findElement(By.name("password")).sendKeys("Pallavi@123");
		  Select day = new Select(driver.findElement(By.id("days")));
		  day.selectByVisibleText("10");

		  Select month = new Select(driver.findElement(By.id("months")));
		  month.selectByVisibleText("May");

		  Select year = new Select(driver.findElement(By.id("years")));
		  year.selectByVisibleText("2001");
		  
		// First Name
		  driver.findElement(By.id("first_name")).sendKeys("Raghu");

		  // Last Name
		  driver.findElement(By.id("last_name")).sendKeys("Kumar");

		  // Company
		  driver.findElement(By.id("company")).sendKeys("ABC Technologies");

		  // Address
		  driver.findElement(By.id("address1")).sendKeys("BTM Layout");

		  // Address 2
		  driver.findElement(By.id("address2")).sendKeys("2nd Stage");

		  // Country
		  Select country = new Select(driver.findElement(By.id("country")));
		  country.selectByVisibleText("India");

		  // State
		  driver.findElement(By.id("state")).sendKeys("Karnataka");

		  // City
		  driver.findElement(By.id("city")).sendKeys("Bengaluru");

		  // Zipcode
		  driver.findElement(By.id("zipcode")).sendKeys("560076");

		  // Mobile Number
		  driver.findElement(By.id("mobile_number")).sendKeys("9876543210");
		  
		  driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		  
		  String actualMessage = driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();

		  if(actualMessage.equals("ACCOUNT CREATED!")) {
		      System.out.println("Registration Successful");
		  } else {
		      System.out.println("Registration Failed");
		  }
		  Thread.sleep(10000);
		  ScreenshotUtil.captureScreenshot(driver, "Registration");
		  driver.quit();
	    }
}
