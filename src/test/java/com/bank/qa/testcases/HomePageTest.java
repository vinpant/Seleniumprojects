package com.bank.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.qa.base.TestBase;
import com.bank.qa.pages.HomePage;
import com.bank.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	
	public HomePageTest()
	{
		super();
	}
	
	//test case should be seprated--independent with each other 
	//before each test case-launch the browser and login
	//@test-execute test case
	
	//after each test case -close the browser
	
	@BeforeMethod()
	
	public void setup()
	{
		initialization();
		 loginpage = new LoginPage();
		 homepage =loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	
	
	@Test(priority=1)
	public void verifyloginbanktitlepagetest()
	{
		 String homepagetitle = homepage.loginpagetitletest();
		 Assert.assertEquals(homepagetitle, "Digital Bank","Bank login page Title is not matched");
	}
	
	
	@Test(priority=2)
	public void verifyloginbanklogotest()
	{
		boolean b= homepage.validatehomepagelogintitletest();
		Assert.assertTrue(b);
	}
	
	@Test(priority=3)
	public void verifyloginbankusernamedisplaytest()
	{
	boolean b1 =homepage.validateusernamedisplay();
	Assert.assertTrue(b1);
	}
	
	
	
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}
	
	}


