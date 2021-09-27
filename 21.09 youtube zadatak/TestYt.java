package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseYt;

public class TestYt extends BaseYt{
	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
	}
	
	@Test 
	public void secondSongInWatchLaterTest() {
		homepageYt.insertSongInSearch("Rick Astley ");
		rickAstleyPage.clickPlay();
		
	}
	
    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

}
