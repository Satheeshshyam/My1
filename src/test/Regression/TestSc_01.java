package test.Regression;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ui.Homepage;
import ui.Loginpage;
import utils.genric.GetData;
import utils.proj_spec.CreateDriver;
public class TestSc_01 {
	WebDriver driver;
	Loginpage login;
	Homepage home;
	
	@Test (priority = 1)
	public void VerifyValidLogin_TC01() {
		String username = GetData.fromexcel("./Test_Data/Data.xlsx", "credentials", 0, 0);
		String pwd = GetData.fromexcel("./Test_Data/Data.xlsx", "credentials", 0, 1);
		login.waitforloginpage();
		login.getusername().sendKeys(username);
		login.getpassword().sendKeys(pwd);
		login.getlogin().click();
		home.waitForHomePage();
		String actual = "Enter Time-Track";
		String expected = home.getPageTitle().getText();
		System.out.println(expected);
		Assert.assertEquals(expected, actual);
		
	}

	/*@Test (priority = 2)
	public void VerifyInvalidLogin_TC02() throws InterruptedException {
		
		String username = GetData.fromexcel("./Test_Data/Data.xlsx", "Credentials", 2, 0);
		String pwd = GetData.fromexcel("./Test_Data/Data.xlsx", "Credentials", 2, 1);
		login.waitforloginpage();
		login.getusername().sendKeys(username);
		login.getpassword().sendKeys(pwd);
		login.getlogin().click();
		String actual = "Username or Password is invalid. Please try again.";
		Thread.sleep(10000);
		String expected = login.getErrorMessage().getText();
		Assert.assertEquals(expected, actual);
		

	}
*/
	@BeforeMethod
	public void PreCondition() {
		driver = CreateDriver.getDriver();
		login = new Loginpage(driver);
		home = new Homepage(driver);
		}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}