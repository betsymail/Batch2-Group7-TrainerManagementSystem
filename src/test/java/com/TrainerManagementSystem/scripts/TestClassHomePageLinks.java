package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import com.TrainerManagementSystem.constants.AutomationConstants;
import com.TrainerManagementSystem.pages.HomePageLinks;

public class TestClassHomePageLinks extends TestBase {
	
	HomePageLinks objHome;
	
	
	@Test(priority=1)
	public void CheckPageTitleTCB2G70001() throws IOException {
	objHome=new HomePageLinks(driver);
	String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	String actualTitle =driver.getTitle();
	AssertJUnit.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test(priority=2)
	public void NavigateToLoginPageTCB2G70003() throws IOException {
	objHome=new HomePageLinks(driver);
	objHome.clickLogin();
	String expectedUrl = prop.getProperty("login");
	String actualUrl =driver.getCurrentUrl();
	AssertJUnit.assertEquals(expectedUrl, actualUrl);
	}
	
	@Test(priority=3)
	public void NavigateToSignupPageTCB2G70004() throws IOException {
	objHome=new HomePageLinks(driver);
	objHome.clickSignUp();
	String expectedUrl = prop.getProperty("signUp");
	String actualUrl =driver.getCurrentUrl();
	AssertJUnit.assertEquals(expectedUrl, actualUrl);
	}

}
