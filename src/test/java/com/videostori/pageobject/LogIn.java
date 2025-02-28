package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

WebDriver ldriver;
	

	public LogIn(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[@class='chakra-button css-1fi6a5m']")
	WebElement logIntest;
	
	@FindBy(name="email")
	WebElement emailaddress;
	
	@FindBy(name="password")
	WebElement loginpwd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[@class='invalid-feedback error m-2']")
	WebElement blankemail;
	
	@FindBy(xpath="//div[contains(text(),'Password is required')]")
	WebElement blankpwd;
	
	@FindBy(xpath="//a[normalize-space()='LOGOUT']")
	WebElement logout;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement invalidcredentials;
	
	public void logIntest() 
	{
		logIntest.click();
	}
	
	public void logOuttest() 
	{
		logout.click();
	}
	
	public void emailaddress(String Email) 
	{
		emailaddress.sendKeys(Email);
	}
	
	public void loginpwd(String pwd) 
	{
		loginpwd.sendKeys(pwd);
	}
	public void loginbtn() 
	{
		loginbtn.click();;
	}
	
	public String blankemailalert()
	{
	String blankemailalerttext=blankemail.getText();
	return blankemailalerttext;
    }	
	
	public String blankpwdalert()
	{
	String blankpwdalerttext=blankpwd.getText();
	return blankpwdalerttext;
    }
	
	public String invalidcredentialalert()
	{
	String invalidcredentialalerttext=invalidcredentials.getText();
	return invalidcredentialalerttext;
    }
	
}
