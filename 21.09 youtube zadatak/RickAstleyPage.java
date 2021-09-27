package pagesPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RickAstleyPage {
	WebDriver driver;
	WebElement play;
	WebElement skipAd;
	
	
	public RickAstleyPage(WebDriver driver) {
		super();
		this.driver= driver;
	}
	
	public WebElement getPlay() {
		return driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
	}
	public void clickPlay() {
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")))
				.click();
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 15000);
			wait2.until(ExpectedConditions.elementToBeClickable(By.className("ytp-ad-skip-button-container"))).click();
		}finally {
			List<WebElement> list = driver.findElements(By.cssSelector("#dismissible > ytd-thumbnail > #thumbnail"));
			//System.out.println(list.size());
			driver.navigate().to(list.get(2 + 32).getAttribute("href"));
			//list.get(1).click(); //playlist-items
		}
		//this.getPlay().click();
	}
	/*
	public WebElement getSkipAd() {
		return driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[1]/video"));
	}
	
	public void skipAdButton() {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		this.skipAd.click();
		
	}
	*/
	

}
