package domaci20_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadPath extends Zadatak20_09Abstr {
	
	public void InternetHerokuAppLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		//Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("fgjgfj");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("SuperSecretWrongPassword!");
		
		WebElement logIn = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		logIn.click();
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
