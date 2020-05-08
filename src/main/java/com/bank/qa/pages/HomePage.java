package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	@FindBy(xpath="//img[contains(@alt,'Logo')]")
	WebElement bankslogodisplay;

	
	
	@FindBy(xpath="//li[contains(text(),'Welcome vijay')]")
	WebElement usernamelabel;
	
	
	@FindBy(id="zipcode")
	WebElement zipcodesearch;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean validatehomepagelogintitletest()
	{
		return  bankslogodisplay.isDisplayed();
		
	}
	
	public String loginpagetitletest()
	{
		return driver.getTitle();
	}
	
	public boolean validateusernamedisplay()
	{
		return usernamelabel.isDisplayed();
	}
}
