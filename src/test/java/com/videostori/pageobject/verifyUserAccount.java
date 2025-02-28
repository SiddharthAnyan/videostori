package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyUserAccount {
	
WebDriver ldriver;
	

	public verifyUserAccount(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Siddharth Anyan']")
	WebElement username;
	
	public String getUserName()
	{
		String text=username.getText();
		return text;
	}
	
	

}
