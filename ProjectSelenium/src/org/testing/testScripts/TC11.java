package org.testing.testScripts;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import org.testing.Assertions.Assert;
import org.testing.Base.*;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.utilities.LogsCapture;
public class TC11 extends Base {
	
	@Test
	public void TC1() throws InterruptedException 
	{
		String expectedURL="https://www.youtube.com";
//		Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
		LoginPage login =new LoginPage(driver,pr);
		Assert.Assert_1(driver.getCurrentUrl(),expectedURL);
		login.signin("abcnabcn9876@gmail.com","Password@123");
		HomePage homepg=new HomePage(driver, pr);
		homepg.videoplay();
		LogsCapture.TakeLog("Video Played successfully","TC11");
		
	}
	
	@Test(enabled=false)
	public void TC2() throws InterruptedException 
	{
		LoginPage login =new LoginPage(driver,pr);
		login.signin("abcnabcn9876@gmail.com","Password@123");
//		WebElement menuoption =driver.findElement(By.xpath("//yt-icon-button[@id='guide-button']"));
//		menuoption.click();
		WebElement history =driver.findElement(By.xpath("//a[@title='History']"));
		history.click();
		Thread.sleep(5000);
	}
	
	@Test(enabled=false)
	public void TC3() throws InterruptedException 
	{
		
//		WebElement menuoption =driver.findElement(By.xpath("//yt-icon-button[@id='guide-button']"));
//		menuoption.click();
		WebElement subscriptions =driver.findElement(By.xpath("//a[@href='/feed/subscriptions']"));
		subscriptions.click();
		Thread.sleep(5000);
	}
	
	@Test(enabled=false)
	public void TC4() throws InterruptedException 
	{
		
//		WebElement menuoption =driver.findElement(By.xpath("//yt-icon-button[@id='guide-button']"));
//		menuoption.click();
		WebElement video =driver.findElement(By.xpath(pr.getProperty("video")));
		video.click();
		Thread.sleep(5000);
	}
	
	@Test(enabled=false)
//	@Parameters("Browser")
	public void TC5() throws NullPointerException,InterruptedException 
	{
		
//		WebElement menuoption =driver.findElement(By.xpath("//yt-icon-button[@id='guide-button']"));
//		menuoption.click();
		WebElement video =driver.findElement(By.xpath("//a[@id='thumbnail']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(video));
		video.click();
		Thread.sleep(5000);
		WebElement like=driver.findElement(By.xpath("//*[@d='M1 21h4V9H1v12zm22-11c0-1.1-.9-2-2-2h-6.31l.95-4.57.03-.32c0-.41-.17-.79-.44-1.06L14.17 1 7.59 7.59C7.22 7.95 7 8.45 7 9v10c0 1.1.9 2 2 2h9c.83 0 1.54-.5 1.84-1.22l3.02-7.05c.09-.23.14-.47.14-.73v-1.91l-.01-.01L23 10z' and @id='button']"));
		like.click();
		Thread.sleep(5000);
	}
}

