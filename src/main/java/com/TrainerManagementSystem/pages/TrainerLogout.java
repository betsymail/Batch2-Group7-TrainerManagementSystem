package com.TrainerManagementSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainerLogout {
	
 WebDriver driver;
 
			 @FindBy(xpath="//a[contains(text(),'Login')]")
			 private WebElement login;
				
			 @FindBy(id="floatingInput")
			 private WebElement username;
				
			 @FindBy(id="floatingPassword")
			 private WebElement password;  
			 
			 @FindBy(xpath="//button[contains(text(),'Sign in')]")
			 private WebElement signIn;
			 
			 @FindBy(xpath="//a[contains(text(),'Logout')]")
			 private WebElement logout;
 
			 
	 
	 public TrainerLogout(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 

				//Go to Login Page
				public void clickLogin() {
						login.click();
				}
			
				//clear username field
		     public void clearName() {
		     	username.clear();
		     }
				//Set user name in textbox
			 	public void setUserName(String strUserName){
			 	username.sendKeys("shymasantosh@gmail.com"); 
			 	}
			 	
			 	//clear password field
		     public void clearPassword() {
		     	password.clear();
		     }
	 	
			 	//Set password in password textbox
			public void setPassword(String strPassword){
				password.sendKeys("Abcd@123");
			 }
			
			 	//click on login button
			 public void clickSignIn() {
			     signIn.click();
			 }
			 
			 //logout 
			 public void clickLogout() {
				 logout.click();
			 }
	 
	 
}
