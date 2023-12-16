package login;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.basePage;
import page.loginPage;

public class loginTest extends basePage {
loginPage login;
public loginTest()
{
	}

	@BeforeMethod	
	public void beforeMethod() throws IOException
	{
		initialization();
		 login = new loginPage();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
	
	@Test
	public void loginToApplication()
	{
		login.login("Admin", "admin123");
	}
	
}
