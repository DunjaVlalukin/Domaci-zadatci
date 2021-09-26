package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WatchlistImdb {
	WebDriver driver;
	WebElement browsefilm;
	WebElement emptyListText;
	WebElement numOfAddedTitles;
	WebElement singInText;
	
	public WatchlistImdb (WebDriver driver) {
		super();
		this.driver= driver;
	}

	public WebElement getBrowsefilm() {
		return driver.findElement(By.xpath("//*[@id=\"center-1-react\"]/div/div[3]/a[1]"));
	}
	
	public void clicBrowsefilm() {
		this.getBrowsefilm().click();
	}
	
	public WebElement getEmptyListText() {
		return driver.findElement(By.className("empty-watchlist-text"));
	}
	
	public WebElement getNumOfAddedTitles() {
		return driver.findElement(By.className("lister-details"));
	}
	
	public WebElement getSingInText() {
		return driver.findElement(By.xpath("////*//*[@id=\"signin-options\"]/div/h1"));	
		
	}
	
	
	
	public void watchlisttest() {
		
		Assert.assertTrue(getEmptyListText().isDisplayed());
	}
	
}
