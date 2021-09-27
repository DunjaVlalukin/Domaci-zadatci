package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pagesPackage.HomepageDemoqa;
import pagesPackage.HomepageYt;
import pagesPackage.RickAstleyPage;

public class BaseYt {
	public WebDriver driver;
	public HomepageYt homepageYt;
	public RickAstleyPage rickAstleyPage;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","driver-lib\\chromedriver.exe");
	    driver = new ChromeDriver();
	    homepageYt = new HomepageYt(driver);
	    rickAstleyPage = new RickAstleyPage(driver);
	}

	/*@AfterClass
	public void tearDown() {
	    driver.close();
	    driver.quit();
	}
*/

}
