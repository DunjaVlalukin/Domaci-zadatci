package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1609 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Napisati program koji ucitava https://practicetestautomation.com/ stranicu,
		 * klikne na "Practice" i klikne na "Test login page", popunjava username i password
		 * (student/Password123), loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout.
		 * Na kraju zatvoriti program.
		 */
		
		System.setProperty("webdriver.chrome.driver","driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/ ");
		Thread.sleep(2000);
	
		WebElement practice = driver.findElement(By.xpath("//*[@id=\"menu-item-20\"]/a"));
		//practice.clear();
		practice.click();
		
		
		WebElement testLoginPage = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
		//testLogoinPage.clear();
		testLoginPage.click();
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("Password123");
		Thread.sleep(2000);
		
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		WebElement logOutButton = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
		logOutButton.click();
		
		driver.close();
		
		
	}

}
