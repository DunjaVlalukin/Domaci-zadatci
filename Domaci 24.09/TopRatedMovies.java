package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TopRatedMovies {
	WebDriver driver;
	WebElement addButton;
	
	public TopRatedMovies (WebDriver driver) {
		super();
		this.driver= driver;
	}

	public WebElement getAddButton() {
		return driver.findElement(By.cssSelector(".wl-ribbon.standalone.not-inWL"));
	}
	
	public WebElement getAddedButton() {
		return driver.findElement(By.cssSelector(".wl-ribbon.standalone.inWL"));
	}
	
	
	public void clickAddButtont() {
		this.getAddButton().click();
 
		// Assert.assertTrue(getAddedButton().isDisplayed()); //ovo u testu
	}
	

}
