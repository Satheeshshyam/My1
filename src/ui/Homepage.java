package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage 
{
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void  waitForHomePage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pagetitle']")));
	}
	public WebElement getPageTitle()
	{
		return driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
	}
}
