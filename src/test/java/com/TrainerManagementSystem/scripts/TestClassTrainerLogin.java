package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import com.TrainerManagementSystem.pages.TrainerLogin;
import com.TrainerManagementSystem.utilities.ExcelUtility;

public class TestClassTrainerLogin extends TestBase {
	TrainerLogin objLogin;
	
	@BeforeTest
	public void start()
	{
		objLogin = new TrainerLogin(driver);
		objLogin.clickLoginLink();
		objLogin.Clear();
		
	}
@Test(priority=5)
	public void LoginWithValidCredentialsTCB2G70062() throws IOException, Exception {
	start();
	String username = ExcelUtility.getCellDataTrainer(0, 0);
	String password = ExcelUtility.getCellDataTrainer(0, 1);
	
	objLogin.setUserName(username);


	objLogin.setPassword(password);
	
	objLogin.clickLogin();
	Thread.sleep(1000);
	String expectedUrl1 =prop.getProperty("profile");
	String actualUrl1 =driver.getCurrentUrl();
	AssertJUnit.assertEquals(expectedUrl1, actualUrl1);
	
	}
	@Test(priority=4)
	public void InvalidLoginCredentialsTCB2G70060() throws IOException, Exception {
		start();
		String username = ExcelUtility.getCellDataTrainer(2, 0);
		String password = ExcelUtility.getCellDataTrainer(2, 1);
		AssertJUnit.assertEquals(objLogin.checkUsernameEditable(),true);
		objLogin.setUserName(username);
		AssertJUnit.assertEquals(objLogin.checkPasswordEditable(),true);
		objLogin.setPassword(password);
		
		objLogin.clickLogin();
		Thread.sleep(5000);
		String expected ="Invalid Login Credintials";
		String actual =objLogin.Error.getText();
		AssertJUnit.assertEquals( actual,expected);
		
		
		}
	@Test(priority=3)
	public void NavigateToHomePageTCB2G70065() throws IOException, Exception {	
		objLogin = new TrainerLogin(driver);
		objLogin.clickLoginLink();
		objLogin.clickHome();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		String expectedUrl =prop.getProperty("url");
		String actualUrl =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl, actualUrl);


	}
	@Test(priority=2)
	public void NavigateToSignupPageTCB2G70066() throws IOException, Exception {	
		objLogin = new TrainerLogin(driver);
		objLogin.clickLoginLink();
		objLogin.clickSignUp();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		String expectedUrl =prop.getProperty("signUp");
		String actualUrl =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl, actualUrl);


	}

@Test(priority=1)
	public void LoginWithNoDataTCB2G70063() throws IOException, Exception {
	start();
		
		objLogin.clickEmail();
		Thread.sleep(2000);
		objLogin.clickPassword();
		AssertJUnit.assertEquals(objLogin.EmailError.isDisplayed(), true);
		AssertJUnit.assertEquals(objLogin.EmailError.getText(),"Enter valid mail Id");
		objLogin.clickEmail();
		AssertJUnit.assertEquals(objLogin.PasswordError.isDisplayed(), true);
		AssertJUnit.assertEquals(objLogin.PasswordError.getText(),"Please enter a valid password");
		
		AssertJUnit.assertEquals(objLogin.login.isEnabled(), false);
		}

@Test(priority=1)
public void DisplayFooterTCB2G70067() throws IOException, Exception {
		start();
		objLogin = new TrainerLogin(driver);
		objLogin.clickLoginLink();
		objLogin.clickSignUp();
		Thread.sleep(1000);
		
		AssertJUnit.assertTrue(objLogin.footer.isDisplayed());
			
	}


}
