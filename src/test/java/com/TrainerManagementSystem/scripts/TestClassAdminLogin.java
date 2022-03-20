package com.TrainerManagementSystem.scripts;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.TrainerManagementSystem.constants.AutomationConstants;
import com.TrainerManagementSystem.pages.AdminLogin;
import com.TrainerManagementSystem.utilities.ExcelUtility;


public class TestClassAdminLogin extends TestBase{
	
	AdminLogin AdmLog;
	
	@Test(priority=1)
	public void VerifyAdminLoginTCB2G70025() throws Exception{
		driver.navigate().to(prop.getProperty("login"));
		AdmLog = new AdminLogin(driver);
		AdmLog.setEmail(ExcelUtility.getCellDataAdmin(1, 0));
		AdmLog.setPassword(ExcelUtility.getCellDataAdminInt(1, 1));
		AdmLog.clickButton();
		Thread.sleep(1000);
		String actual = driver.getCurrentUrl();
		String expected = prop.getProperty("adminApproval");
		AssertJUnit.assertEquals(actual, expected);
		
	}
	
	@Test(priority=2)
	public void VerifyLoginWithInvaidDatasTCB2G70026() throws Exception{
		driver.navigate().to(prop.getProperty("login"));
		AdmLog = new AdminLogin(driver);
		AdmLog.setEmail(ExcelUtility.getCellDataAdmin(1, 0));
		AdmLog.setPassword("9876");
		AdmLog.clickButton();
		String expected = AutomationConstants.LOGIN_ERROR_MESSAGE;
		String actual = AdmLog.errorMessage.getText();
		AssertJUnit.assertEquals(actual, expected);
		
	}
	
	@Test(priority=3)
	public void LoginWithNodataTCB2G70029() throws Exception{
		driver.navigate().to(prop.getProperty("login"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AdmLog = new AdminLogin(driver);
		AdmLog.email.click();
		AdmLog.password.click();
		AdmLog.email.click();
		String expected = AutomationConstants.MAIL_WARNING;
		String actual = AdmLog.warningEmail.getText();
		AssertJUnit.assertEquals(actual, expected);
		String expected1 = AutomationConstants.PASSWORD_WARNING;
		String actual1 = AdmLog.warningPassword.getText();
		AssertJUnit.assertEquals(actual1, expected1);
		AssertJUnit.assertFalse(AdmLog.loginButton.isEnabled());	
	}
	
	

}
