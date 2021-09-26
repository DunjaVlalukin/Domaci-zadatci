package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseImdb;
import pagesPackage.HomepageImdb;

public class TestImdb extends BaseImdb {
	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.imdb.com/");
	}

	@Test (priority = 10)
	public void addToWatchlistWithSingUp() throws InterruptedException {
		homepageImdb.clickWatchlist();
		Assert.assertTrue(watchlistImdb.getSingInText().isDisplayed());
		homepageImdb.signin();
		signInImdb.getSignWithImdb().click();
		signInImdb.insertEmail("kayif70156@tst999.com");
		Thread.sleep(2000);
		signInImdb.insertPassword("Eekselent10");
		Thread.sleep(2000);
		signInImdb.clickSigninButton();
		
		// pre adding test that whatchlist is empty verify
		// watchlistImdb.getEmptyListText().getText();
		System.out.println(watchlistImdb.getEmptyListText().getText());
		watchlistImdb.watchlisttest();
		watchlistImdb.clicBrowsefilm();
		topRatedMoviesImdb.clickAddButtont();
		Assert.assertTrue(topRatedMoviesImdb.getAddedButton().isDisplayed());
		// test watchlist counter after adding movie
		System.out.println(watchlistImdb.getNumOfAddedTitles().getText());

	}

	@Test (priority = 20)
	public void addToWatchListWithoutSingUp() {
		homepageImdb.clickWatchlist();
		
		Assert.assertTrue(watchlistImdb.getSingInText().isDisplayed());
		
	}

	
	  @AfterMethod public void deleteCookies() {
	  driver.manage().deleteAllCookies(); }
	 
}

