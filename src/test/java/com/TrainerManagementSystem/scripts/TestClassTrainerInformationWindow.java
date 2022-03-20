package com.TrainerManagementSystem.scripts;
//import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import com.TrainerManagementSystem.pages.TrainerInformationWindow;
import com.TrainerManagementSystem.utilities.ExcelUtility;


public class TestClassTrainerInformationWindow extends TestBase{
	
	TrainerInformationWindow window;
	
	@Test (priority=1)
    public void VerifyTrainerInformationTCB2G70068() throws IOException {
		
		//Create Login Page object
		window = new TrainerInformationWindow(driver);
				
		window.clickLogin();
		window.setUsername(ExcelUtility.getCellDataTrainer(0, 0));
		window.setPassword(ExcelUtility.getCellDataTrainer(0, 1));
		window.clickSignin();
				
		Assert.assertTrue(window.phone.isDisplayed());
		Assert.assertTrue(window.email.isDisplayed()); 
			}
	
	
	
	@Test (priority=2)
	public void VerifyeditbuttonTCB2G70069() {
		window = new TrainerInformationWindow(driver);
		window.clickEdit();
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expectedUrl = prop.getProperty("editProfile");
		String actualUrl= driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl, actualUrl);
				}
			
 @Test (priority=3)
  public void VerifyPhotoDisplayTCB2G70070() {
		window = new TrainerInformationWindow(driver);
		driver.navigate().to(prop.getProperty("profile"));
		window.clickEdit();
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("TCB2G70070: Trainer profile image is not displayed");
		AssertJUnit.assertTrue(window.photo.isDisplayed());
		
				}
	
	
}

