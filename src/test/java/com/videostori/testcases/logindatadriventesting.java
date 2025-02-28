package com.videostori.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.videostori.pageobject.LogIn;
import com.videostori.pageobject.verifyUserAccount;
import com.videostori.utilities.ReadExcelFile;

import junit.framework.Assert;

public class logindatadriventesting extends BaseClass {
	
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
		logger.info("login password is Msdi@1234");
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
	public void LogInTestwithinvalidcredential(String userEmail, String userPwd, String expectedusername) throws InterruptedException, IOException
	{
		driver.get(url);
		logger.info("User is at login page");
		
		LogIn lg=new LogIn(driver);
		lg.logIntest();
		logger.info("LogIn button clicked");
		lg.emailaddress(userEmail);
		logger.info("Email Address siddharth.anyan@msdi.in");
		lg.loginpwd(userPwd);
		logger.info("login password is msdi@1234");
        lg.loginbtn();
        logger.info("login button clicked for login");
		//Thread.sleep(2000);
		System.out.println("Test Case Passed and user is not able to login");
		
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
				data[i-1][j]=ReadExcelFile.getCellValue(filename, "Login", i, j);
			}
		}
		
		return data;
	}
	
}
