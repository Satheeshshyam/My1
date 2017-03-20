package utils.proj_spec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.genric.GetData;

public class CreateDriver 
{
	public static WebDriver getDriver()
	{
		WebDriver driver=null;
		String BN=GetData.fromexcel("E:/satheesh/Selenium projects/TestNG_New/Selenium_TestNG/Test_Data/Data.xlsx", "driver_conf", 0,0);
		String url=GetData.fromexcel("E:/satheesh/Selenium projects/TestNG_New/Selenium_TestNG/Test_Data/Data.xlsx", "driver_conf", 0,1);
		System.out.println(BN + url);
		if(BN.equals("ff"))
		{
			System.setProperty("webdriver.firefox.marionette", "E:/satheesh/Selenium projects/TestNG_New/Selenium_TestNG/Browser Servers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else
		{
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);

		return driver;
	}
	
}


