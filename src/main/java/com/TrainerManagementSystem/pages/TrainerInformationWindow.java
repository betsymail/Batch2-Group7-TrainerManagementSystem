package com.TrainerManagementSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TrainerInformationWindow {
	
 WebDriver driver;
 		

 		@FindBy(xpath="//a[contains(text(),'Login')]")
 		private WebElement login;
 		
 		@FindBy(id="floatingInput")
 		private WebElement userName;
 		
 		@FindBy(id="floatingPassword")
 		private WebElement passwd;
 		
 		@FindBy(xpath="//button[contains(text(),'Sign in')]")
 		private WebElement signIn;
 		
 		@FindBy(xpath="//th[normalize-space()='Phone']")
 		public WebElement phone;
 		
 		@FindBy(xpath="//th[normalize-space()='Email']")
 		public WebElement email;
 		
 		@FindBy(xpath = "//img[@class='profile_img']")
 		public WebElement photo;
 
 
 		@FindBy(xpath="//button[normalize-space()='Edit Profile']")
 		private WebElement editButton;
 		
 		
 		
 	
 
	 public TrainerInformationWindow(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	 	
	 		//Go to login page
	 		public void clickLogin() {
	 			login.click();
	 		}
	 		
	 		//enter username
	 		public void setUsername(String strUserName) {
	 			userName.sendKeys(strUserName);
	 		}
	 		
	 		//enter password
	 		public void setPassword(String strPassword) {
	 			passwd.sendKeys(strPassword);
	 		}
	 		
	 		//signin
	 		public void clickSignin() {
	 			signIn.click();
	 		}
	 
	 		//enter phone number
	 		public void setPhone(String strPhone) {
	 			phone.sendKeys(strPhone);
	 		}
	 
	 		//enter email
	 		public void setemail(String stremail) {
	 			email.sendKeys(stremail);
	 		}
	 
	 		//enter editbutton
	 		public void clickEdit() {
	 			editButton.click();
	 		}
	 	 
	 
}