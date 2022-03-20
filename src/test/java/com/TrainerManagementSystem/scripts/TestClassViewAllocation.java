package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.TrainerManagementSystem.pages.ViewAllocation;
import com.TrainerManagementSystem.utilities.ExcelUtility;


public class TestClassViewAllocation extends TestBase{
	
	
			ViewAllocation Allocation;
	
	@Test (priority=1)
	public void VerifyAlbhaTCB2G70051() throws IOException {
				
				
			Allocation = new ViewAllocation(driver);
			
			Allocation.clickloginLink();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String expectedUrl = prop.getProperty("login");
			String actualUrl =driver.getCurrentUrl();
			AssertJUnit.assertEquals(expectedUrl, actualUrl);
			
			//login to application
			Allocation.clearName();
			Allocation.setUserName(ExcelUtility.getCellDataAdmin(1, 0));
			String ExpUsrN= "admin@gmail.com";
			String ActUsrN= Allocation.username.getAttribute("value");
			AssertJUnit.assertEquals(ExpUsrN, ActUsrN);
			
			
			Allocation.clearPassword();
		  Allocation.setPassword(ExcelUtility.getCellDataAdminInt(1, 1));
		  String ExpPass= "1234";
			String ActPass= Allocation.password.getAttribute("value");
			AssertJUnit.assertEquals(ExpPass, ActPass);
		    
		  Allocation.clickLogin();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  String expectedUrl2 = prop.getProperty("login");
			String actualUrl2 =driver.getCurrentUrl();
			AssertJUnit.assertEquals(expectedUrl2, actualUrl2);
		    
		  Allocation.clickViewAllocate();    
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  String expectedUrl3 = prop.getProperty("viewAllocate");
			String actualUrl3 =driver.getCurrentUrl();
			AssertJUnit.assertEquals(expectedUrl3, actualUrl3);
			
			Allocation.clearSearch();
			Allocation.enterAlpha("Varsha");
			String ExpAlph = "Varsha";
			String ActAlph= Allocation.Search.getAttribute("value");
			AssertJUnit.assertEquals(ExpAlph, ActAlph);
							
		}
			
			
	@Test (priority=2)
	public void VerifyNumTCB2G70052() {
				
			Allocation = new ViewAllocation(driver);
			driver.navigate().to(prop.getProperty("viewAllocate"));
			Allocation.enterNo("2022-03-12");
			String ExpNum = "2022-03-12";
			String ActNum = Allocation.Search.getAttribute("value");
			AssertJUnit.assertEquals(ExpNum, ActNum);
							
		}
			
	@Test (priority=3)
	public void VerifyCharTCB2G70053() {
						
			Allocation = new ViewAllocation(driver);
			driver.navigate().to(prop.getProperty("viewAllocate"));
			Allocation.enterChar("https://meet.google.com/pjg-obcx-bep");
			String Exp = "https://meet.google.com/pjg-obcx-bep";
			String Act= Allocation.Search.getAttribute("value");
			AssertJUnit.assertEquals(Exp, Act);
		}
			
			
 @Test (priority=4)	
 public void VerifyDataTCB2G70054() throws InterruptedException{
				
			Allocation = new ViewAllocation(driver);
			
			Allocation.clearSearch();
			driver.navigate().refresh();
			Thread.sleep(500);
			
		  AssertJUnit.assertTrue(Allocation.Name.isEnabled());
		  AssertJUnit.assertTrue(Allocation.CourseID.isEnabled());
		  AssertJUnit.assertTrue(Allocation.BatchID.isEnabled());
		
		    }
				
			
			@Test (priority=5)
			public void VerifyScrollingUsingMouseTCB2G70055() throws InterruptedException{
				
				
			Allocation = new ViewAllocation(driver);
			
			Allocation.clearSearch();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		    //Use mouse scroll to scroll the page
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			}


			@Test (priority=6)
			public void VerifyScrollingUsingKeyboardTCB2G70056() throws InterruptedException{
				
			Actions a = new Actions(driver);
			
			Allocation.clearSearch();
			
			//scroll up a page
			a.sendKeys(Keys.PAGE_UP).build().perform();
			//scroll down a page
			a.sendKeys(Keys.PAGE_DOWN).build().perform();	
				
			}

}


