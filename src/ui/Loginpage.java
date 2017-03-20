package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {


	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
		public void waitforloginpage()
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table)[2]")));
		}
		
	public WebElement getusername()
	{
		return driver.findElement(By.id("username"));
	}
	public WebElement getpassword()
	{
		return driver.findElement(By.name("pwd"));
	}
	public WebElement getlogin()
	{
		return driver.findElement(By.id("loginButton"));
	}
	public WebElement getErrorMessage()
	{
		return driver.findElement(By.className("errormsg"));
	}
}

