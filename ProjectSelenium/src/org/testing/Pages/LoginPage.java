package org.testing.Pages;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	ChromeDriver driver;
	Properties pr;
	
	public LoginPage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void signin(String user, String password) throws InterruptedException
	{
		WebElement signinbtn= driver.findElement(By.xpath(pr.getProperty("signinbtn")));
		signinbtn.click();
		WebElement email=driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(user);
		WebElement nextbtn=driver.findElement(By.xpath(pr.getProperty("nextbtn")));
		nextbtn.click();
		Thread.sleep(2000);
		WebElement pswd=driver.findElement(By.xpath(pr.getProperty("pswd")));
		pswd.sendKeys(password);
		WebElement pswdnextbtn=driver.findElement(By.id(pr.getProperty("pswdnextbtn")));
		pswdnextbtn.click();
		Thread.sleep(5000);
	}

}
