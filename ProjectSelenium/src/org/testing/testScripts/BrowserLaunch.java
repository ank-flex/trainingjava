package org.testing.testScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BrowserLaunch {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../ProjectSelenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("ankitagarg19@gmail.com");
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("Welcome@123asyx");
//		WebElement login=driver.findElement(By.cssSelector("button[name='login']"));
//		login.click();
		WebElement createAccount=driver.findElement(By.linkText("Create New Account"));
		createAccount.click();
		Thread.sleep(5000);
		WebElement Fname=driver.findElement(By.name("firstname"));
		Fname.sendKeys("Ankitaa");
		WebElement Lname=driver.findElement(By.name("lastname"));
		Lname.sendKeys("Ankitaa");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("abc@gmail.co");
		WebElement email2=driver.findElement(By.name("reg_email_confirmation__"));
		email2.sendKeys("abc@gmail.co");
		WebElement psw=driver.findElement(By.cssSelector("input[data-type='password']"));
		psw.sendKeys("Password@123");
		WebElement day=driver.findElement(By.cssSelector("select#day"));
		Select s=new Select(day);
		s.selectByVisibleText("10");
		WebElement month=driver.findElement(By.cssSelector("select#month"));
		Select m=new Select(month);
		//m.selectByIndex(3);
		m.selectByValue("8");
		WebElement year=driver.findElement(By.cssSelector("select#year"));
		Select y=new Select(year);
		y.selectByValue("1987");
		//WebElement sex=driver.findElement(By.cssSelector("input[value='1']"));
		WebElement sex=driver.findElement(By.cssSelector("input._8esa[value='1']"));
		sex.click();
		WebElement create=driver.findElement(By.cssSelector("button[name='websubmit']"));
		create.click();
		driver.close();
				};
}
