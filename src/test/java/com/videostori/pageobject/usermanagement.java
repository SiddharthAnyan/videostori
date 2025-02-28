package com.videostori.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class usermanagement {
	
WebDriver ldriver;
	

	public usermanagement(WebDriver rdriver) 
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='User Management']")
	WebElement usermanagementmenu;
	
	@FindBy(xpath="//span[normalize-space()='Manage Users']")
	WebElement usermanagementsubmenu;
	
	@FindBy(xpath="//button[normalize-space()='Register New User']")
	WebElement registernewuser;
	
	@FindBy(xpath="//input[@placeholder='User first name']")
	WebElement ufname;
	
	@FindBy(xpath="//input[@placeholder='User last name']")
	WebElement ulname;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement uemail;
	
	@FindBy(xpath="//input[@placeholder='Enter Waba Number']")
	WebElement umobile;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement upwd;
	
	@FindBy(xpath="//input[@placeholder='Confirm password']")
	WebElement cpwd;
	
	@FindBy(xpath="//select[@name='role_id']")
	WebElement urole;
	
	@FindBy(xpath="//button[@type='submit']") ////div[@role='alert']
	WebElement ureg;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement useralreadyregistered;
	
	@FindBy(xpath="//img[@alt='videostori']")
	WebElement videostorilogo;
	
	@FindBy(xpath="//span[@aria-hidden='true']")  
	WebElement close;
	
	@FindBy(xpath="//div[normalize-space()='User first name is required']")
	WebElement firstnamealert;
	
	@FindBy(xpath="//div[normalize-space()='User last name is required']")
	WebElement lastnamealert;
	
	@FindBy(xpath="//div[normalize-space()='Email address is required']")
	WebElement emailaddressrequiredalert;
	
	@FindBy(xpath="//div[normalize-space()='Enter Valid Email']")
	WebElement invalidemailaddressalert;
	
	@FindBy(xpath="//div[normalize-space()='Mobile number is required']")
	WebElement mobilenumberrequiredalert;
	
	@FindBy(xpath="//div[normalize-space()='Must be exactly 12 digits']")
	WebElement mobilenumberdigitalert;
	
	@FindBy(xpath="//div[normalize-space()='Password is required']")
	WebElement blankpwdalert;
	
	@FindBy(xpath="//div[normalize-space()='Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and one special case Character']")
	WebElement pwdformatalert;
	
	@FindBy(xpath="//div[normalize-space()='Confirm Password is required']")
	WebElement blankconfirmpwdalert;
	
	@FindBy(xpath="//div[normalize-space()='Confirm Password does not match']")
	WebElement confirmpwdnotmatch;
	
	
	
	public void usermanagementmenu () 
	{
		usermanagementmenu.click();
	}
	
	public void usermanagementsubmenu () 
	{
		usermanagementsubmenu.click();
	}
	
	public void registernewuser () 
	{
		registernewuser.click();
	}
	
	public void ufname (String fname) 
	{
		ufname.sendKeys(fname);
	}
	
	public void ulname (String lname) 
	{
		ulname.sendKeys(lname);
	}
	
	public void uemail (String Email) 
	{
		uemail.sendKeys(Email);
	}
	
	public void umobile (String Mobile) 
	{
		umobile.sendKeys(Mobile);
	}
	
	public void upwd (String Password) 
	{
		upwd.sendKeys(Password);
	}
	
	public void cpwd (String ConfirmPassword) 
	{
		cpwd.sendKeys(ConfirmPassword);
	}
	
	public void urole (String text) 
	{
		Select obj = new Select(urole);
		obj.selectByVisibleText(text);
	}
	
	public void ureg () 
	{
		ureg.click();
	}
	
	public String useralreadyregisteredalert()
	
	{
		String useralreadyregisteredalerttext=useralreadyregistered.getText();
		return useralreadyregisteredalerttext;
	}
	
	public void logo()
	{
		videostorilogo.click();
	}
	
	public void closebutton() 
	{
		close.click();	
	}
	
   public String blankfirstnamealert()
	
	{
		String blankfirstnamealerttext=firstnamealert.getText();
		return blankfirstnamealerttext;
	}
   
   public String blanklastnamealert() //User last name is required
	
	{
		String blanklastnamealerttext=lastnamealert.getText();
		return blanklastnamealerttext;
	}
   
   public String blankemailalert() //Email address is required
	
	{
		String blankemailalerttext=emailaddressrequiredalert.getText();
		return blankemailalerttext;
	}
	
   public String invalidemailalert()  //Enter Valid Email
	
	{
		String invalidemailalerttext=invalidemailaddressalert.getText();
		return invalidemailalerttext;
	}
   
   public String blankmobilenumberalert() //Mobile number is required
	
	{
		String blankmobilenumberalerttext=mobilenumberrequiredalert.getText();
		return blankmobilenumberalerttext;
	}
   
   public String mobilenumberdigitalert()  //Must be exactly 12 digits
	
	{
		String mobilenumberdigitalerttext=mobilenumberdigitalert.getText();
		return mobilenumberdigitalerttext;
	}
   
   public String blankpwdalert() //Password is required
	
	{
		String blankpwdalerttext=blankpwdalert.getText();
		return blankpwdalerttext;
	}
   
   public String pwdformatalert()  //Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and one special case Character
	
	{
		String pwdformatalerttext=pwdformatalert.getText();
		return pwdformatalerttext;
	}
   
   public String blankconfirmpwdalert()  //Confirm Password is required
	
	{
		String blankconfirmpwdalerttext=blankconfirmpwdalert.getText();
		return blankconfirmpwdalerttext;
	}
   
   public String confirmpwdnotmatchalert()  //Confirm Password does not match
	
	{
		String confirmpwdnotmatchalerttext=confirmpwdnotmatch.getText();
		return confirmpwdnotmatchalerttext;
	}
   
   
   
}
