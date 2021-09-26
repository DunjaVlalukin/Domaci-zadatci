package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageImdb {
	WebDriver driver;
	WebElement watchlist;
	WebElement searchBar;
	WebElement watchlistNumCount;
	WebElement sigin;
	
	public HomepageImdb (WebDriver driver) {
		super();
		this.driver= driver;
	}

	public WebElement getWatchlist() {
		return driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[4]/a/div"));   //By.className("ipc-button__text")
	}
	
	public void clickWatchlist() {
		this.getWatchlist().click();
	}
	
	public WebElement getSearchBar() {
		return driver.findElement(By.id("suggestion-search"));
	}
	
	public void SearchBarInput(String movieInput) {
		this.getSearchBar().sendKeys(movieInput);
		this.getSearchBar().sendKeys(Keys.ENTER);
	}
	

	public WebElement getWatchlistNumcount() {
		return driver.findElement(By.cssSelector(".ffzGRstkt4lGcy9yWXz7a.imdb-header__watchlist-button-count"));
	}
	
	public WebElement getSignin() {
		return driver.findElement(By.className("ipc-button__text"));
	}
	public void signin() {
		this.getSignin().click();
	}

}
