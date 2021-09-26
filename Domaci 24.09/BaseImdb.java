package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pagesPackage.HomepageImdb;
import pagesPackage.SignInImdb;
import pagesPackage.TopRatedMovies;
import pagesPackage.WatchlistImdb;

	public class BaseImdb {
		public WebDriver driver;
		public HomepageImdb homepageImdb;
		public WatchlistImdb watchlistImdb;
		public TopRatedMovies topRatedMoviesImdb;
		public SignInImdb signInImdb;
		
		@BeforeClass
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","driver-lib\\chromedriver.exe");
		    driver = new ChromeDriver();
		    homepageImdb = new HomepageImdb(driver);
		    watchlistImdb = new WatchlistImdb(driver);
		    topRatedMoviesImdb = new TopRatedMovies(driver);
		    signInImdb = new SignInImdb(driver);
		}

		@AfterClass
		public void tearDown() {
		    driver.close();
		    driver.quit();
		}


}
