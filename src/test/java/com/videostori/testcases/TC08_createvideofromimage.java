package com.videostori.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.videostori.pageobject.createvideoimage;
import junit.framework.Assert;

public class TC08_createvideofromimage extends loginforall {
	
@Test(enabled=true, priority=1)
	
	public void CreateVideoimage() throws InterruptedException, IOException 
	{
	createvideoimage createimage=new createvideoimage(driver);
	createimage.videomanagementmenu();
	logger.info("Video Management clicked");
	createimage.createvideoimagemenu();
	logger.info("Create Video Image clicked");
	createimage.imagegrouptitle("Image video 24 april 1");
	logger.info("Create Video Image title is Image video 24 april 1");
	createimage.createimagegroupbutton();
	logger.info("Create image group button clicked");
	createimage.imageupload("C:\\Users\\Admin\\Pictures\\6a45bfd2254446b5ba8f5791e314a3ce_EOS+850D+w+Kit+Lens+Top.png");
	logger.info("1st image seclected");
	createimage.imageupload("C:\\Users\\Admin\\Pictures\\26c24bb3295f42b9bc8328306240cc4d_3060_fr_op_blc+copy.png");
	logger.info("2nd image seclected");
	createimage.uploadbutton();
	logger.info("Upload button clicked");
	Thread.sleep(3000);
	String successalerttexttwo=createimage.success();
	System.out.println("alert text is : " +successalerttexttwo);
	if(successalerttexttwo.equals("SUCCESS")) 
	{
		logger.info("Verify upload image successfully");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify upload image not successfully");
		captureScreenShot(driver,"CreateVideoimage");
		Assert.assertTrue(false);
	}
	
	createimage.selectall();
	logger.info("Select All button clicked");
	createimage.clickproceed();
	logger.info("Click proceed here button clicked");
	
}

@Test(enabled = true, priority = 2)

public void CreateVideoimageduplicatetitle() throws InterruptedException, IOException {
	createvideoimage createimage = new createvideoimage(driver);
	createimage.videomanagementmenu();
	logger.info("Video Management clicked");
	createimage.createvideoimagemenu();
	logger.info("Create Video Image clicked");
	createimage.imagegrouptitle("Image video 24 april 1");
	logger.info("Create Video Image title is Image video 24 april 1");
	createimage.createimagegroupbutton();
	logger.info("Create image group button clicked");
	Thread.sleep(2000);
	String duplicateimagegroupalerttexttwo = createimage.duplicateimagegrouptitle();
	System.out.println("alert text is : " + duplicateimagegroupalerttexttwo);
	if (duplicateimagegroupalerttexttwo.equals("Duplicate Group Title")) {
		logger.info("Verify group title is duplicate");
		Assert.assertTrue(true);
	} else {
		logger.info("Verify group title is not duplicate");
		captureScreenShot(driver, "CreateVideoimage");
		Assert.assertTrue(false);
	}
}

@Test(enabled = true, priority = 3)

public void CreateVideofromimage() throws InterruptedException, IOException {
	createvideoimage createimage = new createvideoimage(driver);
	createimage.videomanagementmenu();
	logger.info("Video Management clicked");
	createimage.createvideoimagemenu();
	logger.info("Create Video Image clicked");
	createimage.imagegrouplist();
	logger.info("Create Image Group list clicked");
	createimage.createvideo();
	logger.info("Create Video clicked");
	createimage.selectall();
	logger.info("Select All clicked");
	createimage.framedurationclear();
	logger.info("Frame Duration is clear");
	createimage.frameduration("2");
	logger.info("Frame Duation is 2");
	createimage.applybutton();
	logger.info("Apply button clicked");
	createimage.videotitle("videofromimg24aprilone");
	logger.info("video title is videofromimg24aprilone");
	createimage.videodescription("This is video created by image");
	logger.info("Video description is This is video created by image");
	createimage.uploadmusic("C:\\Users\\Admin\\Downloads\\DJ Waley Babu-(DJPunjab).mp3");
	logger.info("mp3 file selected");
	createimage.uploadbtn();
	logger.info("mp3 uploaded");
	Thread.sleep(2000);
	createimage.audiooffsetclear();
	logger.info("audiooffset clear");
	createimage.audiooffset("5");
	logger.info("audiooffset is 5");
	createimage.audiodurationclear();
	logger.info("audio duration is clear");
	createimage.audioduration("10");
	logger.info("audio duration is 10");
	Thread.sleep(3000);
	createimage.processvideo();
	logger.info("process video clicked");
	Thread.sleep(1000);
	String createvideoimagesuccessalerttexttwo=createimage.createvideoimagesuccessalert();
	System.out.println("alert text is : " +createvideoimagesuccessalerttexttwo);
	if(createvideoimagesuccessalerttexttwo.equals("Request submit success!!")) 
	{
		logger.info("Verify create video from Image successfully");
		Assert.assertTrue(true);
	}
	else 
	{
		logger.info("Verify create video from image not successfully");
		captureScreenShot(driver,"CreateVideofromimage");
		Assert.assertTrue(false);
	}

}
}
