package com.videostori.testcases;

import org.testng.annotations.Test;

import com.videostori.pageobject.LogIn;
import com.videostori.pageobject.configureInteractivity;
import com.videostori.pageobject.importVideo;

public class TC05_configureInteractivity extends loginforall {
	
	@Test
	public void TC05_configureInteractivitytest() throws InterruptedException 
	{
		
		configureInteractivity ci=new configureInteractivity(driver);
		ci.videomanagementmenu();
		logger.info("Video Management clicked");
		ci.importvideomenu();
		logger.info("Import Video Menu clicked");
		ci.configureinteractivitymenu();
		logger.info("configureinteractivity menu clicked");
		
		//ci.timeframesec();
		//logger.info("timeframe select 4 sec");
		ci.hotspotmenu();
		logger.info("hotspot menu clicked");
		Thread.sleep(2000);
		ci.circleshape();
		logger.info("circle shape clicked");
		ci.strokecolor(1);
		logger.info("stroke color select");
		ci.clickactionmenu(0);
		logger.info("click action menu selected");
		ci.hotspotindicator();
		logger.info("hotspot indicator clicked");
		ci.blinkhotspot();
		logger.info("blink hotspot clicked");
		ci.pausehotspot();
		logger.info("show pausable hotspot clicked");
		ci.hotspotname("H002");
		logger.info("hotspot name H002");
		ci.submitbutton();
		logger.info("submit button clicked");
		ci.autoplay();
		logger.info("autoplay clicked");
		ci.playicon();
		logger.info("playicon clicked");
		ci.showpausable();
		logger.info("show pausable clicked");
		ci.interactivetitle("none hotspot");
		logger.info("interactivity title is none hotspot");
		ci.template(1);
		logger.info("template 1 selected");
		ci.saveinteractivity();
		logger.info("save interactivity clicked");
		
		System.out.println("Test case 1 passed");
		
		
	}
}
