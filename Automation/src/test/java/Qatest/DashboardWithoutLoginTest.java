package Qatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashboardWithoutLoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Try to access a page directly without login
		driver.get("https://automationexercise.com/view_cart");

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("Automation Exercise")) {
		    System.out.println("Cart page opened successfully without login.");
		}
		Thread.sleep(10000);
		ScreenshotUtil.captureScreenshot(driver, "AccessCartWithoutLogin");
		driver.quit();
	}
}