package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.TestBase;

public class LoginPage extends TestBase {

	//PageFactory OR Object Repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up Here')]")
	WebElement signup;
	
	
	
	//This function is used to intialize elements using PageFactory.intialize Elements (Intiallize the Page Objects)
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, LoginPage.this);
	}
	
	//Actions
	
	public HomePage login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
		return new HomePage();
	}
	
	
	public String Validatetitleofpage()
	{
		return driver.getTitle();
	}
	
}
