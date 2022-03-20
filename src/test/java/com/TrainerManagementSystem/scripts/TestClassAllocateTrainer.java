package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.TrainerManagementSystem.pages.AllocateTrainer;



public class TestClassAllocateTrainer extends TestBase{
	
	AllocateTrainer Allocate;
	
	@Test (priority=1)
    public void VerifyAllocateButtonTCB2G70043() throws Exception {
	
		//Create Login Page object
		Allocate = new AllocateTrainer(driver);
		
		Allocate.clickLogin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expectedUrl = prop.getProperty("login");
		String actualUrl =driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		
		//login to application
		Allocate.clearName();
		Allocate.setUserName();
		String ExpUsrN= "admin@gmail.com";
		String ActUsrN=driver.findElement(By.id("floatingInput")).getAttribute("value");
		Assert.assertEquals(ExpUsrN, ActUsrN);
		
		
		Allocate.clearPassword();
	  Allocate.setPassword();
	  String ExpPass= "1234";
		String ActPass=driver.findElement(By.id("floatingPassword")).getAttribute("value");
		Assert.assertEquals(ExpPass, ActPass);
	    
	    
	  Allocate.clickSignIn();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  String expectedUrl2 = prop.getProperty("login");;
		String actualUrl2 =driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl2, actualUrl2);
		
		Allocate.TrainerPage();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expectedUrl3 = prop.getProperty("allocatePage");
		String actualUrl3 =driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl3, actualUrl3);
		
		Allocate.allocateFirstTrainer();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expectedUrl4 = prop.getProperty("allocateTrainer");
		String actualUrl4 =driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl4, actualUrl4);
		Thread.sleep(2000);
			
		Assert.assertTrue(Allocate.batchID.isEnabled());
		Assert.assertTrue(Allocate.Time.isEnabled());
		Assert.assertTrue(Allocate.startDate.isEnabled());
		Assert.assertTrue(Allocate.endDate.isEnabled());
		Assert.assertTrue(Allocate.meetingVenue.isEnabled());
		Assert.assertTrue(Allocate.allocateButton.isDisplayed());
			
		}

 @Test (priority=2)
 public void VerifyAllocateTrainerPageTCB2G70044() {
	
	
		//Create Login Page object
		Allocate = new AllocateTrainer(driver);
		
		Assert.assertEquals(Allocate.trainerID.isDisplayed(), true);
		Assert.assertEquals(Allocate.trainerName.isDisplayed(), true);
		Assert.assertEquals(Allocate.employmentType.isDisplayed(), true);
		Assert.assertEquals(Allocate.CName.isDisplayed(), true);
	
	}
 
 @Test (priority=3)
 public void VerifyAllocateTrainerPageCourseTCB2G70045() {
		
		 //Create Login Page object
		Allocate = new AllocateTrainer(driver);
		
		Allocate.CourseIdClick();
		Allocate.batchIDClick();
		String ExpectedCWar="Choose a course ID";
		String ActualCWar=driver.findElement(By.xpath("//small[contains(text(),'Choose a course ID')]")).getText();
		Assert.assertEquals(ExpectedCWar, ActualCWar);
		
		String ID = "DSA";
		Select course=new Select(driver.findElement(By.id("courseid")));
		course.selectByVisibleText(ID);
		String ExpectedCourse="DSA";
		String ActualCourse=driver.findElement(By.id("courseid")).getAttribute("value");
		Assert.assertEquals(ExpectedCourse, ActualCourse);
		
		}
		
	
 @Test (priority=4)
 public void VerifyAllocateTrainerPageBatchIDTCB2G70046() {
		
		 //Create Login Page object
		Allocate = new AllocateTrainer(driver);
		
		Allocate.batchIDClick();
		Allocate.clickCName();
		String ExpectedWar="Choose a Batch ID";
		String ActualWar=driver.findElement(By.xpath("//small[contains(text(),'Choose a Batch ID')]")).getText();
		Assert.assertEquals(ExpectedWar, ActualWar);
		
		
		String ID = "DSA002";
		Select batch=new Select(driver.findElement(By.id("batchid")));
		batch.selectByVisibleText(ID);
		String ExpectedBatch="DSA002";
		String ActualBatch=driver.findElement(By.id("batchid")).getAttribute("value");
		Assert.assertEquals(ExpectedBatch, ActualBatch);
		
		}
		
		
	@Test (priority=5)
	public void VerifyAllocateTrainerPageTimeTCB2G70047A() {
		
		 //Create Login Page object
		Allocate = new AllocateTrainer(driver);
		
		Allocate.clearTime();
		Allocate.setWrongTime();
		String ExpectedWTime = "25.63";
		String ActualWTime= Allocate.Time.getAttribute("value");
		Assert.assertNotEquals(ActualWTime,ExpectedWTime);
		}
		

	@Test (priority=6)
	public void VerifyAllocateTrainerPageTime2TCB2G70047B() {
		
		 //Create Login Page object
		Allocate = new AllocateTrainer(driver);
		
		Allocate.clearTime();
		Allocate.clickCName();
		
		String ExpectedVWar="Select a time";
		String ActualVWar= Allocate.TimeWar.getAttribute("textContent");
		Assert.assertEquals(ExpectedVWar, ActualVWar);
		Allocate.setTime();
		Assert.assertTrue(Allocate.Time.isDisplayed());
		
		}
		
@Test (priority=7)
public void VerifyAllocateTrainerPageStartAndEndDateTCB2G70048() {
		
		 //Create Login Page object
		Allocate = new AllocateTrainer(driver);
		
		Allocate.clearStartDate();
		Allocate.setStartDate();
		String ExpectedSDate ="2022-07-17";
		String ActualSDate = Allocate.startDate.getAttribute("value");
		Assert.assertEquals(ExpectedSDate, ActualSDate);
		
		Allocate.clearEndDate();
		Allocate.setWrongDate();
		String ExpectedWDate="2022-07-01";
		String ActualWDate = Allocate.endDate.getAttribute("value");
		Assert.assertEquals(ExpectedWDate, ActualWDate);
		
		Allocate.clearEndDate();
		Allocate.setEndDate();
		String ExpectedEDate ="2022-10-10";
		String ActualEDate =Allocate.endDate.getAttribute("value");
		Assert.assertEquals(ExpectedEDate, ActualEDate);
		
		}
		
	@Test (priority=8)
 public void VerifyAllocateTrainerPageMeetingLinkTCB2G70049() throws InterruptedException {
		
		 //Create Login Page object
		Allocate = new AllocateTrainer(driver);
		
		Allocate.clearVenue();
		Allocate.setVenue();
		String ExpectedVenue="abcd";
		String ActualVenue= Allocate.meetingVenue.getAttribute("value");
		Assert.assertEquals(ExpectedVenue, ActualVenue);
		
		
		Allocate.clearVenue();
		Allocate.setMeetinglink();
		String ExpectedVenue2="https://meet.google.com/kkx-eyeu-kzt";
		String ActualVenue2=Allocate.meetingVenue.getAttribute("value");
		Assert.assertEquals(ExpectedVenue2, ActualVenue2);
		
		Allocate.finalEntry();
		
		Thread.sleep(3000);
				
	  JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,700)", "");

		
		Thread.sleep(3000);
		Allocate.clickAllocate();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String ExpectedUrl= prop.getProperty("allocatePage");
		String ActualUrl=driver.getCurrentUrl();
		Assert.assertEquals(ExpectedUrl, ActualUrl);
		
		}
		
		}				

