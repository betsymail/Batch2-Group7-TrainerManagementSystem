
package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeTest;

import com.TrainerManagementSystem.constants.AutomationConstants;
import com.TrainerManagementSystem.pages.SocialMediaLinks;

public class TestClassSocialMediaLinks extends TestBase{
	
	SocialMediaLinks objSocial;
	
	@BeforeTest
	public void ValidateSocialMediaLinksTCB2G70006() throws Exception
	{
		objSocial=new SocialMediaLinks(driver);
		String expectedTitle =AutomationConstants.HOMEPAGETITLE;
		String actualTitle =driver.getTitle();
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}
	
	@Test
	public void TCB2G70006_FaceBook() throws Exception
	{
		ValidateSocialMediaLinksTCB2G70006();
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AssertJUnit.assertEquals(objSocial.FacebookLink.isDisplayed(),true);
		objSocial.ClickFacebookLink();
		Thread.sleep(2000);
		String expectedUrl ="https://www.facebook.com/";
		String actualUrl =driver.getCurrentUrl();
		AssertJUnit.assertEquals(actualUrl,expectedUrl);
	
		
	}
	@Test
	public void TCB2G70006_Twitter() throws Exception
	{
		ValidateSocialMediaLinksTCB2G70006();
		Thread.sleep(2000);

		objSocial.ClickTwitterLink();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(objSocial.TwitterLink.isDisplayed(),true);
		String expectedUrl ="https://twitter.com/?lang=en";
		String actualUrl =driver.getCurrentUrl();
		AssertJUnit.assertEquals(actualUrl,expectedUrl);
		
	
		
	}
	@Test
	public void TCB2G70006_Instagram() throws Exception
	{
		ValidateSocialMediaLinksTCB2G70006();
		Thread.sleep(2000);
	
		objSocial.ClickInstaLink();
		Thread.sleep(2000);
		AssertJUnit.assertEquals(objSocial.InstaLink.isDisplayed(),true);
		String expectedUrl ="https://www.instagram.com/?hl=en";
		String actualUrl =driver.getCurrentUrl();
		AssertJUnit.assertEquals(actualUrl,expectedUrl);
	
		
	}
	
}
