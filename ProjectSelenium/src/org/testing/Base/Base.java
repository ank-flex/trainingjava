package org.testing.Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Base {
	
    public ChromeDriver driver;
    public Properties pr;
	@BeforeMethod
	public void BrowserLaunch() throws NullPointerException, InterruptedException, IOException
	{
	
		File f=new File("..//ProjectSelenium/Object.properties");
		FileInputStream fs=new FileInputStream(f);
		pr = new Properties();
		pr.load(fs);
//			System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}
	
	@AfterMethod
	public void BrowserClose()
	{
		driver.close();
	}

}
