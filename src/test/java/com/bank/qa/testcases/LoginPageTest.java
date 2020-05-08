package com.bank.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.qa.base.TestBase;
import com.bank.qa.pages.HomePage;
import com.bank.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	 LoginPage loginpage;
	 HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	
	  @BeforeMethod
	  
	  public void setup()
	  {
		  initialization();
		  loginpage = new LoginPage();
	  }
	  
	  
	  
	  @Test(priority=1)
	  
	  public void loginpagetitletest()
	  {
		String title=  loginpage.Validatetitleofpage();
		assertEquals(title, "Digital Bank");
	  }
	  
	  
	  @Test(priority=2)
	  public void LoginTest()
	  {
	  homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	  }
	  
	  
	  
	  @AfterMethod
	  public void teardown()
	  {
		  driver.quit();
	  }

}
