package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInImdb {
	WebDriver driver;
	WebElement email;
	WebElement password;
	WebElement signinButton;
	WebElement signWithImdb;
	
	public SignInImdb (WebDriver driver) {
		super();
		this.driver= driver;
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("ap_email"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("ap_password"));
	}

	public WebElement getSigninButton() {
		return driver.findElement(By.id("signInSubmit"));
	}
	
	public void insertEmail(String useremail) throws InterruptedException {
		this.getEmail().clear();
		this.getEmail().sendKeys(useremail);
		Thread.sleep(2000);
	}
	public void insertPassword(String passwordData) {
		this.getPassword().clear();
		this.getPassword().sendKeys(passwordData);
	}
	
	public void clickSigninButton() {
		this.getSigninButton().click();
	}
	
	public WebElement getSignWithImdb() {
		return driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[2]"));
	}
	
	public void SignIn() {
		this.signWithImdb.click();
	}


 

}
