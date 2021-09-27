package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepageYt {
	WebDriver driver;
	WebElement searchbox;
	
	
	public HomepageYt(WebDriver driver) {
		super();
		this.driver= driver;
	}
	
	public WebElement getSearchbox() {
		return driver.findElement(By.cssSelector("input#search"));
	}
	public void insertSongInSearch(String song) {
		this.getSearchbox().clear();
		this.getSearchbox().sendKeys(song);
		this.getSearchbox().sendKeys(Keys.ENTER);
		WebDriverWait wd = new WebDriverWait(driver, 10000);
	}
	

}
