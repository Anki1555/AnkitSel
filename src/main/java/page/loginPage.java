package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.basePage;

public class loginPage extends basePage{

	public loginPage()
	{
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement usernamefield;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordfield;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement  loginbtn;
	public void login(String username, String password)
	{
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		loginbtn.click();
	}
}
