package com.videostori.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.videostori.pageobject.LogIn;
import com.videostori.pageobject.usermanagement;

import junit.framework.Assert;

public class TC03_userManagement extends loginforall{
	
	@Test(priority=1, enabled=false)
	public void UsermanagementTest() throws InterruptedException, IOException
	{
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * logger.info("User is at usermanagement page"); Thread.sleep(2000);
		 */
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("TestingteamQA");
		logger.info("User first name TestingteamQA");
		um.ulname("sixteen");
		logger.info("User last name sixteen");
		um.uemail("testingteameighteen@gmail.com");
		logger.info("User email testingteameighteen@gmail.com");
		um.umobile("9989796666");
		logger.info("User mobile number 9989796666");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		um.closebutton();
		
		System.out.print("Test Case 1 Passed user is able to register user");
		//lg.logOuttest();
	
		
	}
	
	
	@Test(priority=2, enabled=true)
	public void UsermanagementTestwithduplicate() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name Testing");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("9989998985");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String userlreadyregisteralerttext=um.useralreadyregisteredalert();
		System.out.println("alert text is : " +userlreadyregisteralerttext);
		
		if(userlreadyregisteralerttext.equals("user already exists")) 
		{
			logger.info("Verify data is wrong -Failed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - Passed");
			captureScreenShot(driver,"UsermanagementTestwithduplicate");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 2 Passed user is not able to register user");
		
	}
	
	@Test(priority=3, enabled=true)
	public void UsermanagementTestwithoutfirstname() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		//um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("9989998985");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String firstnamealerttext=um.blankfirstnamealert();
		System.out.println("alert text is : " +firstnamealerttext);
		
		if(firstnamealerttext.equals("User first name is required")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithoutfirstname");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 3 Passed user is not able to register user");
		
	}
	
	
	@Test(priority=4, enabled=true)
	public void UsermanagementTestwithoutlastname() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		//um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("9989998985");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String lasttnamealerttext=um.blanklastnamealert();
		System.out.println("alert text is : " +lasttnamealerttext);
		
		if(lasttnamealerttext.equals("User last name is required")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithoutlastname");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 4 Passed user is not able to register user");
		
	}
	
	@Test(priority=5, enabled=true)
	public void UsermanagementTestwithoutemail() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		//um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("9989998985");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String blankemailalerttext=um.blankemailalert();
		System.out.println("alert text is : " +blankemailalerttext);
		
		if(blankemailalerttext.equals("Email address is required")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithoutemail");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 5 Passed user is not able to register user");
		
	}
	
	
	@Test(priority=6, enabled=true)
	public void UsermanagementTestwithinvalidemail() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsixgmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("9989998985");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String invalidemailalertalerttext=um.invalidemailalert();
		System.out.println("alert text is : " +invalidemailalertalerttext);
		
		if(invalidemailalertalerttext.equals("Enter Valid Email")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithinvalidemail");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 6 Passed user is not able to register user");
		
	}
	
	@Test(priority=7, enabled=true)
	public void UsermanagementTestwithblankmobilenumber() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		//um.umobile("9989998985");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String blankmobilenumberalerttext=um.blankmobilenumberalert();
		System.out.println("alert text is : " +blankmobilenumberalerttext);
		
		if(blankmobilenumberalerttext.equals("Mobile number is required")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithblankmobilenumber");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 7 Passed user is not able to register user");
		
	}
	
	@Test(priority=8, enabled=true)
	public void UsermanagementTestwithinvalidmobilenumberdigit() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("99899989");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String mobilenumberdigitalerttext=um.mobilenumberdigitalert();
		System.out.println("alert text is : " +mobilenumberdigitalerttext);
		
		if(mobilenumberdigitalerttext.equals("Must be exactly 12 digits")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithinvalidmobilenumberdigit");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 8 Passed user is not able to register user");
		
	}
	
	
	@Test(priority=9, enabled=true)
	public void UsermanagementTestwithblankpwdalert() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("99899989");
		logger.info("User mobile number 9989998985");
		//um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String blankpwdalertalerttext=um.blankpwdalert();
		System.out.println("alert text is : " +blankpwdalertalerttext);
		
		if(blankpwdalertalerttext.equals("Password is required")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithblankpwdalert");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 9 Passed user is not able to register user");
		
	}
	
	@Test(priority=10, enabled=true)
	public void UsermanagementTestwithpwdformatalert() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("99899989");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String pwdformatalerttext=um.pwdformatalert();
		System.out.println("alert text is : " +pwdformatalerttext);
		
		if(pwdformatalerttext.equals("Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and one special case Character")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithpwdformatalert");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 10 Passed user is not able to register user");
		
	}
	
	
	@Test(priority=11, enabled=true)
	public void UsermanagementTestwithblankconfirmpwdalert() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("99899989");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		//um.cpwd("Sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String blankconfirmpwdalerttext=um.blankconfirmpwdalert();
		System.out.println("alert text is : " +blankconfirmpwdalerttext);
		
		if(blankconfirmpwdalerttext.equals("Confirm Password is required")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithblankconfirmpwdalert");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 11 Passed user is not able to register user");
		
	}
	
	@Test(priority=12, enabled=true)
	public void UsermanagementTestwithconfirmpwdnotmatchalert() throws InterruptedException, IOException
	{
		
		/*
		 * driver.get(url); logger.info("User is at login page");
		 * 
		 * LogIn lg=new LogIn(driver); lg.logIntest();
		 * logger.info("LogIn button clicked");
		 * lg.emailaddress("siddharth.anyan@msdi.in");
		 * logger.info("Email Address siddharth.anyan@msdi.in");
		 * lg.loginpwd("Msdi@1234"); logger.info("login password Msdi@1234");
		 * lg.loginbtn(); logger.info("login button clicked for login");
		 * Thread.sleep(2000);
		 * System.out.println("Test Case Passed and user is able to login");
		 * 
		 * logger.info("User is at usermanagement page");
		 */
		Thread.sleep(3000);
		usermanagement um=new usermanagement(driver);
		um.usermanagementmenu();
		logger.info("UserManagement menu clicked");
		um.usermanagementsubmenu();
		logger.info("Manage user menu clicked");
		um.registernewuser();
		logger.info("Register new user clicked");
		um.ufname("Testing");
		logger.info("User first name is balnk");
		um.ulname("Six");
		logger.info("User last name Six");
		um.uemail("testingteamsix@gmail.com");
		logger.info("User email testingteamsix@gmail.com");
		um.umobile("99899989");
		logger.info("User mobile number 9989998985");
		um.upwd("Sid@1234");
		logger.info("User pwd Sid@1234");
		um.cpwd("sid@1234");
		logger.info("User confirm pwd Sid@1234");
		um.urole("Public User");
		logger.info("Public User selected");
		um.ureg();
		logger.info("click on user registration");
		Thread.sleep(2000);
		
		String confirmpwdnotmatchalerttext=um.confirmpwdnotmatchalert();
		System.out.println("alert text is : " +confirmpwdnotmatchalerttext);
		
		if(confirmpwdnotmatchalerttext.equals("Confirm Password does not match")) 
		{
			logger.info("Verify data is wrong -Passed");
			Assert.assertTrue(true);
		}
		else 
		{
			logger.info("Verify data is not wrong - failed");
			captureScreenShot(driver,"UsermanagementTestwithconfirmpwdnotmatchalert");
			Assert.assertTrue(false);
		}

		um.closebutton();
		System.out.print("Test Case 12 Passed user is not able to register user");
		
	}

}
