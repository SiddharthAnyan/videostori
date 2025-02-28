package com.videostori.testcases;

import java.io.IOException;

import org.testng.annotations.*;

import com.videostori.pageobject.SignUp;
import com.videostori.pageobject.indexPage;

import junit.framework.Assert;

public class TC01_signupPage extends BaseClass {
	
	@Test(priority = 1, enabled = false)
	public void registration() throws InterruptedException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name Testing");
		su.lname("Test");
		logger.info("last name Siddharthteam ");
		su.mail("tilogi9205@ikuromi.com");
		logger.info("Email Address tilogi9205@ikuromi.com");
		su.mnumber("7018805790");
		logger.info("Mobile Number 7018805790");
		su.pwd("Sid@1234");
		logger.info("Pwd Sid@1234");
		su.cpwd("Sid@1234");
		logger.info("Confirm Pwd Sid@1234");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
	}
	
	@Test(priority=2, enabled= true)
	public void registrationfirstnameblank() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		//su.fname("Siddharth");
		logger.info("First name blank Testing");
		su.lname("Test");
		logger.info("last name Siddharth ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address siddharthtest@gmail.com");
		su.mnumber("7018805799");
		logger.info("Mobile Number 7018805794");
		su.pwd("Sid@1234");
		logger.info("Pwd Sid@1234");
		su.cpwd("Sid@1234");
		logger.info("Confirm Pwd Sid@1234");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String fnamealert=su.firstnamealert();
		System.out.println("alert text is : " +fnamealert);
		if(fnamealert.equals("First name is required")) 
		{
			logger.info("Verify first name is blank -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify first name is not blank - Failed");
			captureScreenShot(driver,"registrationfirstnameblank");
			Assert.assertTrue(false);
		}
		System.out.print("Test Case blank first name Passed user is not able to signup");
	}
	
	@Test(priority=3, enabled= true)
	public void registrationlastnameblank() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name is Siddharth");
		//su.lname("Test");
		logger.info("last name is blank ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address siddharthtest@gmail.com");
		su.mnumber("7018805799");
		logger.info("Mobile Number 7018805794");
		su.pwd("Sid@1234");
		logger.info("Pwd Sid@1234");
		su.cpwd("Sid@1234");
		logger.info("Confirm Pwd Sid@1234");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String lnamealert=su.lastnamealert();
		System.out.println("alert text is : " +lnamealert);
		if(lnamealert.equals("Last name is required")) 
		{
			logger.info("Verify last name is blank -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify last name is not blank - Failed");
			captureScreenShot(driver,"registrationlastnameblank");
			Assert.assertTrue(false);
		}
		System.out.print("Test Case blank last name Passed user is not able to signup");
	}

	@Test(priority=4, enabled= true)
	public void registrationemailblank() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name is Siddharth");
		su.lname("Test");
		logger.info("last name is Test ");
		//su.mail("siddharthtest@gmail.com");
		logger.info("Email Address is blank");
		su.mnumber("7018805799");
		logger.info("Mobile Number 7018805794");
		su.pwd("Sid@1234");
		logger.info("Pwd Sid@1234");
		su.cpwd("Sid@1234");
		logger.info("Confirm Pwd Sid@1234");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String emailadalert=su.emailalert();
		System.out.println("alert text is : " +emailadalert);
		if(emailadalert.equals("Email address is required")) 
		{
			logger.info("Verify Email is blank -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify is not blank - Failed");
			captureScreenShot(driver,"registrationemailblank");
			Assert.assertTrue(false);
		}
		System.out.print("Test Case blank Email Address Passed user is not able to signup");
	}
	
	
	@Test(priority=5, enabled= true)
	public void registrationmobileblank() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name is Siddharth");
		su.lname("Test");
		logger.info("last name is Test ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address is siddharthtest@gmail.com");
		//su.mnumber("7018805799");
		logger.info("Mobile Number is blank");
		su.pwd("Sid@1234");
		logger.info("Pwd Sid@1234");
		su.cpwd("Sid@1234");
		logger.info("Confirm Pwd Sid@1234");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String mobilealert=su.mobilenumberalert();
		System.out.println("alert text is : " +mobilealert);
		if(mobilealert.equals("Mobile number is required")) 
		{
			logger.info("Verify Mobile Number is blank -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify Mobile Number is not blank - Failed");
			captureScreenShot(driver,"registrationmobileblank");
			Assert.assertTrue(false);
		}
		System.out.print("Test Case blank Mobile Number Passed user is not able to signup");
	}
	
	@Test(priority=6, enabled= true)
	public void registrationblankpassword() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name is Siddharth");
		su.lname("Test");
		logger.info("last name is Test ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address is siddharthtest@gmail.com");
		su.mnumber("7018805799");
		logger.info("Mobile Number is 7018805794");
		//su.pwd("Sid@1234");
		logger.info("Pwd is blank");
		su.cpwd("Sid@1234");
		logger.info("Confirm Pwd Sid@1234");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String blankpwdalert=su.blankpasswordalert();
		System.out.println("alert text is : " +blankpwdalert);
		if(blankpwdalert.equals("Password is required")) 
		{
			logger.info("Verify password is blank -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify password is not blank - Failed");
			captureScreenShot(driver,"registrationblankpassword");
			Assert.assertTrue(false);
		}
		System.out.print("Test Case blank blank password Passed user is not able to signup");
	}
	
	@Test(priority=7, enabled= true)
	public void registrationconfirmpasswordnotmatched() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name is Siddharth");
		su.lname("Test");
		logger.info("last name is Test ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address is siddharthtest@gmail.com");
		su.mnumber("7018805799");
		logger.info("Mobile Number is 7018805794");
		su.pwd("Sid@1234");
		logger.info("Pwd is Sid@1234");
		su.cpwd("Sid@1243");
		logger.info("Confirm Pwd Sid@1243");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String confirmpwdnotmatchedalerttext=su.confirmpasswordnotmatchedalert();
		System.out.println("alert text is : " +confirmpwdnotmatchedalerttext);
		if(confirmpwdnotmatchedalerttext.equals("Confirm Password does not match")) 
		{
			logger.info("Verify Confirm password not matched -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify Confirm password matched - Failed");
			captureScreenShot(driver,"registrationconfirmpasswordnotmatched");
			Assert.assertTrue(false);
		}
		System.out.print("Test Case confirm password not matched Passed user is not able to signup");
	}
	
	@Test(priority=8, enabled= true)
	public void registrationblankconfirmpassword() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name is Siddharth");
		su.lname("Test");
		logger.info("last name is Test ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address is siddharthtest@gmail.com");
		su.mnumber("7018805799");
		logger.info("Mobile Number is 7018805794");
		su.pwd("Sid@1234");
		logger.info("Pwd is Sid@1234");
		//su.cpwd("Sid@1243");
		logger.info("Confirm Pwd is blank");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String blankconfirmpasswordalerttext=su.blankconfirmpasswordalert();
		System.out.println("alert text is : " +blankconfirmpasswordalerttext);
		if(blankconfirmpasswordalerttext.equals("Confirm Password is required")) 
		{
			logger.info("Verify Confirm password is blank -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify Confirm password is blank - Failed");
			captureScreenShot(driver,"registrationblankconfirmpassword");
			Assert.assertTrue(false);
		}
		System.out.print("Test Case confirm password is blank Passed user is not able to signup");
	}
	
	@Test(priority=9, enabled= true)
	public void registrationinvalidpasswordformat() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name is Siddharth");
		su.lname("Test");
		logger.info("last name is Test ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address is siddharthtest@gmail.com");
		su.mnumber("7018805799");
		logger.info("Mobile Number is 7018805794");
		su.pwd("sid123");
		logger.info("Pwd is sid@1234");
		su.cpwd("sid@123");
		logger.info("Confirm Pwd is sid@123");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String invalidpasswordformatalerttext=su.invalidpasswordformatalert();
		System.out.println("alert text is : " +invalidpasswordformatalerttext);
		if(invalidpasswordformatalerttext.equals("Must be min 8 chars with one upper, lower, number & special char")) 
		{
			logger.info("Verify invalid password format -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify not invalid password format - Failed");
			captureScreenShot(driver,"registrationinvalidpasswordformat");
			Assert.assertTrue(false);
			
		}
		System.out.print("Test Case Invalid password Format Passed user is not able to signup");
	}
	
	@Test(priority=10, enabled= true)
	public void registrationtermsnotclicked() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Siddharth");
		logger.info("First name is Siddharth");
		su.lname("Test");
		logger.info("last name is Test ");
		su.mail("siddharthtest@gmail.com");
		logger.info("Email Address is siddharthtest@gmail.com");
		su.mnumber("7018805799");
		logger.info("Mobile Number is 7018805794");
		su.pwd("sid123");
		logger.info("Pwd is Sid@1234");
		su.cpwd("sid@123");
		logger.info("Confirm Pwd is Sid@1234");
		su.terms();
		logger.info("Not Clicked on terms");
		
		String agreetesttext=su.agreetermstest();
		System.out.println("alert text is : " +agreetesttext);
		if(agreetesttext.equals("Click here to agree to the above Terms of service")) 
		{
			logger.info("Verify terms clicked -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify terms checkbox not clicked - Failed");
			captureScreenShot(driver,"registrationtermsnotclicked");
			Assert.assertTrue(false);
			
		}
		System.out.print("Test Case checkbox clicked- user is not able to signup");
	
		
		
		su.agreeterms(); logger.info("show agree terms");
		 
		Thread.sleep(1000);
		su.signupbtn(); 
		logger.info("Clicked on signupbtn");
		
		System.out.print("TestCase Pass user is able to signup");
		
		}
	
	@Test(priority=11, enabled= true)
	public void invaliddata() throws InterruptedException, IOException 
	{
		driver.get(url);
		logger.info("url opened");
		
		indexPage pg = new indexPage(driver);
		pg.clickOnTryForFree();
		logger.info("Click on TryForFree button");
		SignUp su = new SignUp(driver);
		su.fname("Sidd123");
		logger.info("First name Sid1234 Testing");
		su.lname("Test123");
		logger.info("last name Test123");
		su.mail("siddharthtestgmail.com");
		logger.info("Email Address siddharthtestgmail.com");
		su.mnumber("7018");
		logger.info("Mobile Number 7018");
		su.pwd("Sid@1234");
		logger.info("Pwd Sid@1234");
		su.cpwd("Sid@1234");
		logger.info("Confirm Pwd Sid@1234");
		su.terms();
		logger.info("Clicked on terms");
		su.agreeterms();
		logger.info("Clicked on agree terms");
		Thread.sleep(2000);
		su.signupbtn();
		logger.info("Clicked on signupbtn");
		System.out.print("TestCase Pass user is able to signup");
		
		String invalidfnamealert=su.invalidfnametest();
		System.out.println("alert text is : " +invalidfnamealert);
		if(invalidfnamealert.equals("Only alphabets are allowed")) 
		{
			logger.info("Verify first name is alpha-numeric -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify first name is not alpha-numeric - Failed");
			captureScreenShot(driver,"invaliddata");
			Assert.assertTrue(false);
		}
		
		String invalidlnamealert=su.invalidlnametest();
		System.out.println("alert text is : " +invalidlnamealert);
		if(invalidlnamealert.equals("Only alphabets are allowed")) 
		{
			logger.info("Verify last name is alpha-numeric -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify last name is not alpha-numeric - Failed");
			captureScreenShot(driver,"invaliddata");
			Assert.assertTrue(false);
		}
		
		String invalidemailalert=su.invalidemailformattest();
		System.out.println("alert text is : " +invalidemailalert);
		if(invalidemailalert.equals("Enter Valid Email")) 
		{
			logger.info("Verify Email is invalid -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify email is not invalid - Failed");
			captureScreenShot(driver,"invaliddata");
			Assert.assertTrue(false);
		}
		
		String invalidmobilealert=su.invalidlessmobiledigittest();
		System.out.println("alert text is : " +invalidmobilealert);
		if(invalidmobilealert.equals("Must be exactly 8 digits")) 
		{
			logger.info("Verify Mobile is invalid -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify Mobile is not invalid - Failed");
			captureScreenShot(driver,"invaliddata");
			Assert.assertTrue(false);
		}
		
		System.out.print("Test Case invalid data Passed user is not able to signup");
	}
	
	
}



