package com.videostori.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.videostori.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	String url = readconfig.getBaseUrl();
	String browser = readconfig.getBrowser();

	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() {
		
		String browser = "chrome";

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		logger = LogManager.getLogger("videostori");

	}

		  @AfterClass public void tearDown()
		  { 
			  driver.close(); 
			  driver.quit(); 
	     }
	 
		//user method to capture screen shot
			public void captureScreenShot(WebDriver driver,String testName) throws IOException
			{
				//step1: convert webDriver object to TakesScreenshot interface
				TakesScreenshot screenshot = ((TakesScreenshot)driver);
				
				//step2: call getScreenshotAs method to create image file
				
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				
				File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
			
				//step3: copy image file to destination
				FileUtils.copyFile(src, dest);
			}

}
