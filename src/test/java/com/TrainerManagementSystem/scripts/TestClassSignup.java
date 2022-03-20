package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import com.TrainerManagementSystem.constants.AutomationConstants;
import com.TrainerManagementSystem.pages.Signup;
import com.TrainerManagementSystem.utilities.ExcelUtility;

public class TestClassSignup extends TestBase{
	
	
	Signup sign;
	@Test(priority = 1)
	public void VerifySignUPMenuTCB2G70011()
	{
		sign=new Signup(driver);
		sign.Enroll.click();
		String expectedUrl =prop.getProperty("signUp");
	  String actualUrl =driver.getCurrentUrl();
	  AssertJUnit.assertEquals(expectedUrl,actualUrl);
	}
		
		@Test(priority=2)
	    public void VerifySignUpTCB2G70012() throws IOException, InterruptedException 
		{
			
			sign = new Signup(driver);
			
			String name = ExcelUtility.getCellDataSignup(0, 0);
			sign.setName(name);
			
			String email = ExcelUtility.getCellDataSignup(0, 1);
			sign.setEmail(email);

			String phone = ExcelUtility.getCellDataSignupNumeric(0, 2);
			sign.setPhone(phone);
			
			String addr = ExcelUtility.getCellDataSignup(0, 3);
			sign.setAddress(addr);
			
			String strQualification = ExcelUtility.getCellDataSignup(0, 4);
			sign.setQualification(strQualification);

			String skill = ExcelUtility.getCellDataSignup(0, 5);
			sign.setSkillSet(skill);
	   
			String comname = ExcelUtility.getCellDataSignup(0, 6);
			sign.setCompanyName(comname);

			String designation = ExcelUtility.getCellDataSignup(0, 7);
			sign.setDesignation(designation);

			sign.setImage(System.getProperty("user.dir")+ "/src/main/resources/image.jpeg");
			
			Thread.sleep(1000);
			String password = ExcelUtility.getCellDataSignup(0, 8);
			sign.setPassword(password);

			String repassword = ExcelUtility.getCellDataSignup(0, 9);
			sign.setRePassword(repassword);
			
			sign.setDropdown();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(2000);
			sign.setButton();
			
			Alert msg=driver.switchTo().alert();
			String actmsg=msg.getText();
			String expmsg="Sign Up Successfull!";
			AssertJUnit.assertEquals(actmsg,expmsg);
			Thread.sleep(2000);
			msg.accept();
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    AssertJUnit.assertEquals(expectedTitle,actualTitle);
	
}	
		
	@Test(priority=13)
  public void ListCourseTCB2G70013() throws IOException, InterruptedException
		 {
		 	sign=new Signup(driver);	
		     sign.Enroll.click();
		     driver.navigate().to(prop.getProperty("signUp"));
		     List<String> actValues=new ArrayList<String>();
		     actValues.add(sign.FSD.getText());
		     actValues.add(sign.CSA.getText());
		     actValues.add(sign.CSA.getText());
		     actValues.add(sign.RPA.getText());
		     int expCount=6;
		     AssertJUnit.assertEquals(actValues.size(),expCount);
		            
		 }
	
	@Test(priority=7)
	 public void VerifyInvalidPhoneTCB2G70015()
	 {
	 	 sign=new Signup(driver);	
	     sign.Enroll.click();
	     driver.navigate().to(prop.getProperty("signUp"));
	     sign.setPhone("23567890006754");
	     sign.address.click();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     String actMsg= sign.mobErrorMessage.getText();
	     String expMsg="Enter valid mobileNo";
	     AssertJUnit.assertEquals(actMsg,expMsg);
	 }
		
	 @Test(priority=6)

	 public void VerifyInvalidPhoneUsingStringsTCB2G70016()
	 {
	 	sign=new Signup(driver);	
	     sign.Enroll.click();
	     driver.navigate().to(prop.getProperty("signUp"));
	     sign.setPhone("adbcd");
	     sign.address.click();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     String actMsg= sign.mobErrorMessage.getText();
	     String expMsg="Enter valid mobileNo";
	     AssertJUnit.assertEquals(expMsg,actMsg);
	 }
	 
	 @Test (priority=11)
	 public void VerifyEnteredSamePassTCB2G70017() throws IOException
	 {

	 	sign=new Signup(driver);	
	     sign.Enroll.click();
	     driver.navigate().to(prop.getProperty("signUp"));
	     sign.setPassword("Abcd@1234");
	     sign.setRePassword("Abcd@1234");
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     String ActPas= sign.password.getText();
	     String ExpPas=sign.re_password.getText();
	     if(ActPas!=ExpPas) {
	    	 Assert.assertFalse(sign.bttn1.isEnabled());
	     }
	     
	     }
	 
	 @Test(priority=12)
	 public void VerifyEnteredDiffPassTCB2G70018() throws IOException
	 {

		 sign=new Signup(driver);	
	     sign.Enroll.click();
	     driver.navigate().to(prop.getProperty("signUp"));
	     sign.setPassword("Abcd@1234");
	     sign.setRePassword("Ab1234");
	     sign.designation.click();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     String ExpErrorMessage= "Passwords must be same";
	     String ActualErrorMessage= sign.errorPassword.getText();
	     AssertJUnit.assertEquals(ExpErrorMessage,ActualErrorMessage);
	     
	     }
	 
	 @Test(priority=9)
	 public void VerifyValidEmailTCB2G70019()
	 {
	 	sign=new Signup(driver);	
	     sign.Enroll.click();
	     driver.navigate().to(prop.getProperty("signUp"));
	     sign.setEmail("anya@gmail.com");
	     sign.phone.click();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     String actMsg=sign.mailErrorMessage.getText();
	     String expMsg="Enter valid mail Id";
	     Assert.assertNotEquals(actMsg,expMsg);
	 }
	 
	 @Test(priority=8)
	 public void VerifyInvalidEmailTCB2G70020()
	 {
	 	 sign=new Signup(driver);	
	     sign.Enroll.click();
	     driver.navigate().to(prop.getProperty("signUp"));
	     sign.setEmail("abc.com");
	     sign.phone.click();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     String actMsg=sign.mailErrorMessage.getText();
	     String expMsg="Enter valid mail Id";
	     AssertJUnit.assertEquals(actMsg,expMsg);
	 }	
	 
	 @Test(priority=4)
		public void VerifyValidNameTCB2G70021()
		{
			sign=new Signup(driver);
			driver.navigate().to(prop.getProperty("signUp"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    sign.Enroll.click();
		    sign.setName("Neethu");
		    sign.phone.click();
		    AssertJUnit.assertFalse(sign.nameErrorMessage.isDisplayed());
		 
		}
		
		@Test(priority=5)	
		   public void VerifyInvalidNameTCB2G70022()
		   {
			sign=new Signup(driver);	
			driver.navigate().to(prop.getProperty("signUp"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    sign.Enroll.click();
		    sign.setName("12anbcd");
		    sign.phone.click();
		   
		    String actMsg=sign.nameErrorMessage.getText();
		    String expMsg="Enter valid name";
		    AssertJUnit.assertEquals(actMsg,expMsg);
				
		}
	
	@Test(priority=3)

	public void VerifySignUpwithoutCourseTCB2G70023() throws InterruptedException, IOException
	{
		sign = new Signup(driver);
			
			driver.navigate().to(prop.getProperty("signUp"));
			
			String name = ExcelUtility.getCellDataSignup(0, 0);
			sign.setName(name);
			
			String email = ExcelUtility.getCellDataSignup(0, 1);
			sign.setEmail(email);

			String phone = ExcelUtility.getCellDataSignupNumeric(0, 2);
			sign.setPhone(phone);
			
			String addr = ExcelUtility.getCellDataSignup(0, 3);
			sign.setAddress(addr);
			
			String strQualification = ExcelUtility.getCellDataSignup(0, 4);
			sign.setQualification(strQualification);

			String skill = ExcelUtility.getCellDataSignup(0, 5);
			sign.setSkillSet(skill);
	   
			String comname = ExcelUtility.getCellDataSignup(0, 6);
			sign.setCompanyName(comname);

			String designation = ExcelUtility.getCellDataSignup(0, 7);
			sign.setDesignation(designation);

			sign.setImage(System.getProperty("user.dir")+ "/src/main/resources/image.jpeg");
		
			Thread.sleep(1000);
			String password = ExcelUtility.getCellDataSignup(0, 8);
			sign.setPassword(password);

			String repassword = ExcelUtility.getCellDataSignup(0, 9);
			sign.setRePassword(repassword);
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			if(sign.bttn1.isEnabled()) {
				System.out.println("TCB2G70023 : Signup button should not active if the course details are not selected");
				AssertJUnit.assertTrue(false);
				
			}
			Thread.sleep(2000);
			sign.setButton();
			
			Alert msg=driver.switchTo().alert();
			String actmsg=msg.getText();
			String expmsg="Sign Up Successfull!";
			AssertJUnit.assertEquals(actmsg,expmsg);
			Thread.sleep(2000);
			msg.accept();
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    AssertJUnit.assertEquals(expectedTitle,actualTitle);
	    
} 
	 
	
	 @Test(priority=10)
	 public void VerifyPasParameterTCB2G70086() throws InterruptedException
	 {
	 	sign=new Signup(driver);	
	     sign.Enroll.click();
	     driver.navigate().to(prop.getProperty("signUp"));
	     sign.setPassword("sdfg");
	     sign.re_password.click();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     String actMsg=sign.passwordError.getText();
	     String expMsg= AutomationConstants.PASSWORD_ERROR;
	     AssertJUnit.assertEquals(actMsg,expMsg);
	     Thread.sleep(2000);
	 }
	 
	 
	 }
	 
	 

	

