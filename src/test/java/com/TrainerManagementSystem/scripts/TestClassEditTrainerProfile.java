package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import com.TrainerManagementSystem.pages.EditTrainerProfile;
import com.TrainerManagementSystem.utilities.ExcelUtility;


public class TestClassEditTrainerProfile extends TestBase{

EditTrainerProfile EditProfile;	

	@BeforeTest

		public void TrainerLogin() throws IOException {
		EditProfile = new EditTrainerProfile(driver);
		
		EditProfile.clickLogin();
		EditProfile.setUsername(ExcelUtility.getCellDataTrainer(0, 0));
		EditProfile.setPassword(ExcelUtility.getCellDataTrainer(0, 1));
		EditProfile.clickSignin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	 @Test(priority=1)	
	 public void VerifyEditPersonalDetailsPageTCB2G70071A() throws Exception {

		EditProfile = new EditTrainerProfile(driver);
		EditProfile.clickEdit();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(EditProfile.Name.isEnabled()) {
		System.out.println("TCB2G70071A :Test failed. Because 'Name' is an unique attribute and unchangeable");
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  if(EditProfile.Email.isEnabled()) {
		System.out.println("TCB2G70071A :Test failed. Because 'Email' is an unique attribute and unchangeable");
	  } 
	  AssertJUnit.assertEquals(EditProfile.Name.isEnabled(), false);
		AssertJUnit.assertEquals(EditProfile.Email.isEnabled(), false);
	 
	 }
		
	 @Test(priority=2)	
	 public void VerifyEditPersonalDetailsPageTCB2G70071B() throws Exception {	
		 
		EditProfile = new EditTrainerProfile(driver);
		driver.navigate().to(prop.getProperty("editProfile"));
		
		EditProfile.mobileno.clear();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		EditProfile.mobileno.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EditProfile.mobileno(ExcelUtility.getCellDataSignupNumeric(1, 2));
		String Expectedmobileno="8945673892";
		String Actualmobileno=EditProfile.mobileno.getAttribute("value");
		AssertJUnit.assertEquals(Expectedmobileno, Actualmobileno);
		
		EditProfile.address.clear();
		EditProfile.address.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		EditProfile.address(ExcelUtility.getCellDataSignup(1, 3));
		String Expectedaddress="Sarovaram";
		String Actualaddress=EditProfile.address.getAttribute("value");
		AssertJUnit.assertEquals(Expectedaddress, Actualaddress);
		
		EditProfile.quali.clear();
		EditProfile.address.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		EditProfile.quali(ExcelUtility.getCellDataSignup(1, 4));
		String Expectedquali="Btech";
		String Actualquali=EditProfile.quali.getAttribute("value");
		AssertJUnit.assertEquals(Expectedquali, Actualquali);
		
		EditProfile.skill.clear();
		EditProfile.address.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		EditProfile.skill(ExcelUtility.getCellDataSignup(1, 5));
		String Expectedskill="java";
		String Actualskill=EditProfile.skill.getAttribute("value");
		AssertJUnit.assertEquals(Expectedskill, Actualskill);
		
		EditProfile.company.clear();
		EditProfile.address.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		EditProfile.company(ExcelUtility.getCellDataSignup(1, 6));
		String Expectedcompany="ICT";
		String Actualcompany= EditProfile.company.getAttribute("value");
		AssertJUnit.assertEquals(Expectedcompany, Actualcompany);
		Thread.sleep(1000);
		
		EditProfile.desig.clear();
		EditProfile.address.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		EditProfile.designation(ExcelUtility.getCellDataSignup(1, 7));
		String Expecteddesig="Tester";
		String Actualdesig= EditProfile.desig.getAttribute("value");
		AssertJUnit.assertEquals(Expecteddesig, Actualdesig);
		Thread.sleep(1000);
							
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		EditProfile.setImage(System.getProperty("user.dir")+ "/src/main/resources/image.jpeg");
		Thread.sleep(1000);
							
		EditProfile.clickTrainerEdit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expectedUrl = prop.getProperty("profile");
		String actualUrl= driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl, actualUrl);
		
	}
	
	@Test(priority=2)
	public void VerifyEditPersonalDetailsPhotoTCB2G70072() throws InterruptedException {

		EditProfile = new EditTrainerProfile(driver);							
		EditProfile.clickEdit();
		Thread.sleep(2000);						
		EditProfile.setImage(System.getProperty("user.dir")+ "/src/main/resources/image.jpeg");
		Thread.sleep(1000);
		EditProfile.editTrainerButton.click();
		}
		
	@Test (priority=3)
	public void VerifyTrainerAllocationDetailsPageTCB2G70074() {
			
	
		EditProfile = new EditTrainerProfile(driver);
		driver.navigate().to(prop.getProperty("myAllocate"));
		EditProfile.myAllocation.click();
		String expectedUrl= prop.getProperty("myAllocate");
		String actualUrl= driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl, actualUrl);
	}
	
	@Test(priority = 4)
	public void VerifyScrollbarTCB2G70078() {
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");	
		jse.executeScript("window.scrollBy(0,-800)");
  
	}
	@Test (priority=5)
	public void VerifyScrollbarTCB2G70080() {

			EditProfile = new EditTrainerProfile(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
					
		
	@Test (priority=6)
		
	public void VerifyFooterTCB2G70081() {
				
				EditProfile = new EditTrainerProfile(driver);
				AssertJUnit.assertTrue(EditProfile.aboutUs.isDisplayed());
				AssertJUnit.assertTrue(EditProfile.headOffice.isDisplayed());
				AssertJUnit.assertTrue(EditProfile.support.isDisplayed());
		 }
	
	
	
	
}
