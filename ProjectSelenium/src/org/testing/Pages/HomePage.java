package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	ChromeDriver driver;
	Properties pr;
	public HomePage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void videoplay() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement explorebtn= driver.findElement(By.xpath(pr.getProperty("explore")));
		wait.until(ExpectedConditions.elementToBeClickable(explorebtn));
//		wait.until(ExpectedConditions.visibilityOf(trendingbtn));
		explorebtn.click();
		Thread.sleep(5000);
		WebElement trendingbtn= driver.findElement(By.xpath(pr.getProperty("trending")));
		//trendingbtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(trendingbtn));
//		wait.until(ExpectedConditions.visibilityOf(trendingbtn));
		trendingbtn.click();
		Thread.sleep(5000);
		WebElement video1= driver.findElement(By.xpath(pr.getProperty("video")));
		video1.click();
		Thread.sleep(5000);
		

}
}
