package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	
	WebDriver ldriver;
	

	public SignUp(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(id ="firstname")
	WebElement fname;
	
	@FindBy(id ="Last Name")
	WebElement lname;
	
	@FindBy(id = "email")
	WebElement mail;
	
	@FindBy(name = "mobileno")
	WebElement mnumber;
	
	@FindBy(id ="password")
	WebElement pwd;
	
	@FindBy(id = "confirmPassword")
	WebElement cpwd;
	
	@FindBy(xpath= "//input[@id='acceptTerms']")
	WebElement terms;
	
	@FindBy(xpath ="//button[normalize-space()='Click here to agree to the above Terms of service']")
	WebElement agreeterms;
	
	@FindBy(xpath="//button[normalize-space()='Sign Up']")
	WebElement signupbtn;
	
	@FindBy(xpath="//div[contains(text(),'First name is required')]")
	WebElement firstnamealert;
	
	@FindBy(xpath="//div[contains(text(),'Last name is required')]")
	WebElement lastnamealert;
	
	@FindBy(xpath="//div[contains(text(),'Email address is required')]")
	WebElement emailalert;
	
	@FindBy(xpath="//div[normalize-space()='Mobile number is required']")
	WebElement mobilenumberalert;
	
	@FindBy(xpath="//div[contains(@class,'invalid-feedback')][normalize-space()='Password is required']")
	WebElement blankpasswordalert;
	
	@FindBy(xpath="//div[contains(text(),'Confirm Password does not match')]")
	WebElement confirmpasswordnotmatchedalert;
	
	@FindBy(xpath="//div[contains(text(),'Confirm Password is required')]")
	WebElement blankconfirmpasswordalert;
	
	@FindBy(xpath="//div[@class='invalid-feedback'][normalize-space()='Must be min 8 chars with one upper, lower, number & special char']")
	WebElement invalidpasswordformatalert;
	
	@FindBy(xpath="//div[@class='invalid-feedback']")
	WebElement alphabetfname;
	
	@FindBy(xpath="//div[contains(@class,'form-group m-0 w-50 pl-1')]//div[@class='invalid-feedback'][normalize-space()='Only alphabets are allowed']")
	WebElement alphabetlname;
	
	@FindBy(xpath="//div[contains(text(),'Enter Valid Email')]")
	WebElement invalidemailformat;
	
	@FindBy(xpath="//div[normalize-space()='Must be exactly 8 digits']")
	WebElement lessmobiledigit;
	
	
	

	public void fname(String firstname) 
	{
		fname.sendKeys(firstname);
	}
	
	public void lname(String lastname) 
	{
		lname.sendKeys(lastname);
	}
	
	public void mail(String emailAdd) 
	{
		mail.sendKeys(emailAdd);
	}
	
	public void mnumber(String string) 
	{
		mnumber.sendKeys(string);
	}
	
	public void pwd(String password) 
	{
		pwd.sendKeys(password);
	}
	
	public void cpwd(String confirmpwd) 
	{
		cpwd.sendKeys(confirmpwd);
	}
	
	
	 public void terms() 
	 { 
		 terms.click(); 
     }
	 
	
	public void agreeterms() 
	{
		agreeterms.click();
	}
	
	public void signupbtn() 
	{
		signupbtn.click();
	}
	
	public String firstnamealert()
	{
		String firstalerttext=firstnamealert.getText();
		return firstalerttext;
	}
	
	public String lastnamealert()
	{
		String lastalerttext=lastnamealert.getText();
		return lastalerttext;
	}
	
	public String emailalert()
	{
		String emailaddalerttext=emailalert.getText();
		return emailaddalerttext;
	}
	
	public String mobilenumberalert()
	{
		String mobilenumberalerttext=mobilenumberalert.getText();
		return mobilenumberalerttext;
	}
	
	public String blankpasswordalert()
	{
		String blankpasswordalerttext=blankpasswordalert.getText();
		return blankpasswordalerttext;
	}
	
	public String confirmpasswordnotmatchedalert()
	{
		String confirmpasswordnotmatchedalerttext=confirmpasswordnotmatchedalert.getText();
		return confirmpasswordnotmatchedalerttext;
	}
	
	public String blankconfirmpasswordalert()
	{
		String blankconfirmpasswordalerttext=blankconfirmpasswordalert.getText();
		return blankconfirmpasswordalerttext;
	}
	
	public String invalidpasswordformatalert()
	{
		String invalidpasswordformatalerttext=invalidpasswordformatalert.getText();
		return invalidpasswordformatalerttext;
	}
	
	public String agreetermstest()
	{
		String agreetermstesttext=agreeterms.getText();
		return agreetermstesttext;
	}
	
	public String invalidfnametest()
	{
		String invalidfnametesttext=alphabetfname.getText();
		return invalidfnametesttext;
	}
	
	public String invalidlnametest()
	{
		String invalidlnametesttext=alphabetlname.getText();
		return invalidlnametesttext;
	}
	
	public String invalidemailformattest()
	{
		String invalidemailformattesttext=invalidemailformat.getText();
		return invalidemailformattesttext;
	}
	
	public String invalidlessmobiledigittest()
	{
		String invalidlessmobiledigittesttext=lessmobiledigit.getText();
		return invalidlessmobiledigittesttext;
	}
	
}
