package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.TrainerManagementSystem.pages.TrainerLogout;
import com.TrainerManagementSystem.utilities.ExcelUtility;

public class TestClassTrainerLogout extends TestBase{

	
TrainerLogout Logout;
	
@Test (priority=1)
 public void VerifyTrainerLogoutTCB2G70082() throws IOException {
			
				//Create Login Page object
				Logout = new TrainerLogout(driver);
				
				Logout.clickLogin();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				String expectedUrl =prop.getProperty("login");
				String actualUrl =driver.getCurrentUrl();
				AssertJUnit.assertEquals(expectedUrl, actualUrl);
				
				//login to application
				Logout.clearName();
				Logout.setUserName(ExcelUtility.getCellDataTrainer(0, 0));
				Logout.clearPassword();
				Logout.setPassword(ExcelUtility.getCellDataTrainer(0, 1));
				
				Logout.clickSignIn();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  String expectedUrl2 =prop.getProperty("login");
				String actualUrl2 =driver.getCurrentUrl();
				AssertJUnit.assertEquals(expectedUrl2, actualUrl2);
	
				Logout.clickLogout();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  String expectedUrl3 =prop.getProperty("url");
				String actualUrl3 =driver.getCurrentUrl();
				AssertJUnit.assertEquals(expectedUrl3, actualUrl3);
				
			}
			
			
			@Test (priority=2)
		    public void VerifyTrainerLoginAfterLoginTCB2G70085() throws IOException {
			
				//Create Login Page object
				Logout = new TrainerLogout(driver);
				
				Logout.clickLogin();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				String expectedUrl =prop.getProperty("login");
				String actualUrl =driver.getCurrentUrl();
				AssertJUnit.assertEquals(expectedUrl, actualUrl);
				
				//login to application
				Logout.clearName();
				Logout.setUserName(ExcelUtility.getCellDataTrainer(0, 0));
				Logout.clearPassword();
				Logout.setPassword(ExcelUtility.getCellDataTrainer(0, 1));
				
				Logout.clickSignIn();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  String expectedUrl2 =prop.getProperty("login");
				String actualUrl2 =driver.getCurrentUrl();
				AssertJUnit.assertEquals(expectedUrl2, actualUrl2);
	
				Logout.clickLogout();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  String expectedUrl3 =prop.getProperty("url");
				String actualUrl3 =driver.getCurrentUrl();
				AssertJUnit.assertEquals(expectedUrl3, actualUrl3);
				
				Logout.clickLogin();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				String expectedUrl4 =prop.getProperty("login");
				String actualUrl4 =driver.getCurrentUrl();
				AssertJUnit.assertEquals(expectedUrl4, actualUrl4);
				
				//login to application
				Logout.clearName();
				Logout.setUserName(ExcelUtility.getCellDataTrainer(0, 0));
				Logout.clearPassword();
				Logout.setPassword(ExcelUtility.getCellDataTrainer(0, 1));
			    
				Logout.clickSignIn();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  String expectedUrl5 =prop.getProperty("login");
				String actualUrl5 =driver.getCurrentUrl();
				AssertJUnit.assertEquals(expectedUrl5, actualUrl5);
								
			}
				
}
