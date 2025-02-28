package com.videostori.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.videostori.pageobject.LogIn;
import com.videostori.pageobject.verifyUserAccount;
import com.videostori.utilities.ReadExcelFile;

import junit.framework.Assert;

public class TC02_loginPage extends BaseClass {
	
	@Test(priority=1, enabled=true, dataProvider="LoginDataProvider")
	public void LogInTest(String userEmail, String userPwd, String expectedusername) throws InterruptedException, IOException
	{
		driver.get(url);
		logger.info("User is at login page");
		
		LogIn lg=new LogIn(driver);
		lg.logIntest();
		logger.info("LogIn button clicked");
		lg.emailaddress(userEmail);
		logger.info("Email Address siddharth.anyan@msdi.in");
		lg.loginpwd(userPwd);
		logger.info("login password Msdi@1234");
        lg.loginbtn();
        logger.info("login button clicked for login");
		Thread.sleep(2000);
		System.out.println("Test Case Passed and user is able to login");
		
		verifyUserAccount ua = new verifyUserAccount(driver);
		String uname= ua.getUserName();
		System.out.println("username is :" +uname);
		
		if(uname.equals(expectedusername)) 
		{
			logger.info("Verify Login - Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify Login - Failed");
			captureScreenShot(driver,"LogInTest");
			Assert.assertTrue(false);
	  }
		
		lg.logOuttest();
		
}
	@DataProvider(name="LoginDataProvider")
	public String [][] LoginDataProvider()
	{
		String filename= System.getProperty("user.dir") + "\\TestData\\videostoriTestData.xlsx";
		
		int ttlrows = ReadExcelFile.getRowCount(filename, "Login");
		int ttlcols=ReadExcelFile.getColCount(filename, "Login");
		
		String data [][]=new String[ttlrows-1][ttlcols];
		
		for(int i=1;i<ttlrows;i++) 
		{
			for(int j=0;j<ttlcols;j++) 
			{
				data[i-1][j]=ReadExcelFile.getCellValue(filename, "Login", i, j);
			}
		}
		
		return data;
	}
	
	@Test(priority=2, enabled=true, dataProvider="LoginDataProvidertwo")
	public void blankdataLogInTest(String userEmail, String userPwd, String expectedusername) throws InterruptedException, IOException
	{
		driver.get(url);
		logger.info("User is at login page");
		
		LogIn lg=new LogIn(driver);
		lg.logIntest();
		logger.info("LogIn button clicked");
		lg.emailaddress(userEmail);
		logger.info("Email Address is blank");
		lg.loginpwd(userPwd);
		logger.info("login password is blank");
        lg.loginbtn();
        logger.info("login button clicked for login");
		//Thread.sleep(2000);
		
		/*
		 * String blankemailalerttext=lg.blankemailalert();
		 * System.out.println("alert text is : " +blankemailalerttext);
		 * if(blankemailalerttext.equals(expectedAlert)) {
		 * logger.info("Verify email is blank -Passed"); Assert.assertTrue(true); } else
		 * { logger.info("Verify email is not blank - Failed");
		 * captureScreenShot(driver,"blankdataLogInTest"); Assert.assertTrue(false); }
		 * System.out.print("Test Case email is blank- Passed user is not able to login"
		 * );
		 */
	
	
	String invalidcredentialalerttext=lg.invalidcredentialalert();
	System.out.println("alert text is : " +invalidcredentialalerttext);
	if(invalidcredentialalerttext.equals(expectedusername)) 
	{
		logger.info("Verify password is wrong -Passed");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify password is not wrong - Failed");
		captureScreenShot(driver,"blankdataLogInTest");
		Assert.assertTrue(false);
	}
	lg.loginbtn();
    logger.info("login button clicked for login");
	//Thread.sleep(2000);
	System.out.println("Test Case Passed and user is not able to login");
	
}
	
	
	@DataProvider(name="LoginDataProvidertwo")
	public String [][] LoginDataProvidertwo()
	{
		String filename= System.getProperty("user.dir") + "\\TestData\\videostoriTestData.xlsx";
		
		int ttlrows = ReadExcelFile.getRowCount(filename, "Logintwo");
		int ttlcols=ReadExcelFile.getColCount(filename, "Logintwo");
		
		String data [][]=new String[ttlrows-1][ttlcols];
		
		for(int i=1;i<ttlrows;i++) 
		{
			for(int j=0;j<ttlcols;j++) 
			{
				data[i-1][j]=ReadExcelFile.getCellValue(filename, "Logintwo", i, j);
			}
		}
		
		return data;
		
	}
	
	@Test(priority=3, enabled=true)
	public void blankemailLogInTest() throws InterruptedException, IOException
	{
		driver.get(url);
		logger.info("User is at login page");
		
		LogIn lg=new LogIn(driver);
		lg.logIntest();
		logger.info("LogIn button clicked");
		//lg.emailaddress("siddharth.anyan@msdi.in");
		logger.info("Email Address is blank");
		lg.loginpwd("Msdi@1234");
		logger.info("login password is Msdi@1234");
        lg.loginbtn();
        logger.info("login button clicked for login");
		//Thread.sleep(2000);
		
		String blankemailalerttext=lg.blankemailalert();
		System.out.println("alert text is : " +blankemailalerttext);
		if(blankemailalerttext.equals("Email/Phone address is required")) 
		{
			logger.info("Verify email is blank -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify email is not blank - Failed");
			captureScreenShot(driver,"blankdataLogInTest");
			Assert.assertTrue(false);
		}
		System.out.print("Test Case email is blank- Passed user is not able to login");
	
	lg.loginbtn();
    logger.info("login button clicked for login");
	//Thread.sleep(2000);
	System.out.println("Test Case Passed and user is not able to login");
	
}
	
	@Test(priority=4, enabled=true)
	public void blankpasswordLogInTest() throws InterruptedException, IOException
	{
		driver.get(url);
		logger.info("User is at login page");
		
		LogIn lg=new LogIn(driver);
		lg.logIntest();
		logger.info("LogIn button clicked");
		lg.emailaddress("siddharth.anyan@msdi.in");
		logger.info("Email Address is siddharth.anyan@msdi.in");
		//lg.loginpwd("Msdi@1234");
		logger.info("login password is blank");
        lg.loginbtn();
        logger.info("login button clicked for login");
		//Thread.sleep(2000);
		
		
	String blankpwdalerttext=lg.blankpwdalert();
	System.out.println("alert text is : " +blankpwdalerttext);
	if(blankpwdalerttext.equals("Password is required")) 
	{
		logger.info("Verify password is blank -Passed");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify password is not blank - Failed");
		captureScreenShot(driver,"blankdataLogInTest");
		Assert.assertTrue(false);
	}
	lg.loginbtn();
    logger.info("login button clicked for login");
	//Thread.sleep(2000);
	System.out.println("Test Case Passed and user is not able to login");
	
    }
	
	@Test(priority=5, enabled=true)
	public void invalidcredentialLogInTest() throws InterruptedException, IOException
	{
		driver.get(url);
		logger.info("User is at login page");
		
		LogIn lg=new LogIn(driver);
		lg.logIntest();
		logger.info("LogIn button clicked");
		lg.emailaddress("siddharth.anyan@msdi.in");
		logger.info("Email Address is siddharth.anyan@msdi.in");
		lg.loginpwd("Msdi@12345");
		logger.info("login password is Msdi@12345");
        lg.loginbtn();
        logger.info("login button clicked for login");
		Thread.sleep(2000);
		
		
	String invalidcredentialalerttexttwo=lg.invalidcredentialalert();
	System.out.println("alert text is : " +invalidcredentialalerttexttwo);
	if(invalidcredentialalerttexttwo.equals("Invalid Credentials, Try Again !!")) 
	{
		logger.info("Verify invalid credentials -Passed");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify not a invalid credential - Failed");
		captureScreenShot(driver,"invalidcredentialLogInTest");
		Assert.assertTrue(false);
	}
	lg.loginbtn();
    logger.info("login button clicked for login");
	//Thread.sleep(2000);
	System.out.println("Test Case Passed and user is not able to login");
	
    }
	
}
