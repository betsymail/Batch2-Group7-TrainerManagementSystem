package com.TrainerManagementSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TrainerManagementSystem.utilities.PageUtility;

public class TrainerLogin {
	
 WebDriver driver;
 PageUtility pg;
 
 @FindBy(linkText="Login") 
 private WebElement loginLink;
 
 @FindBy(xpath="//*[@id=\"floatingInput\"]") 
 private WebElement username;
 
 @FindBy(id="floatingPassword")
 private WebElement password;    
 
 @FindBy(linkText="Home")
 private WebElement HomeLink;
 
 @FindBy(linkText="Sign Up/Enroll")
 private WebElement SignUpLink;

 @FindBy(xpath="/html/body/app-root/app-login/main/form/button")
 public WebElement login;
 
 @FindBy(xpath="/html/body/app-root/app-login/main/div")
 public WebElement Error;
 
 @FindBy(xpath="/html/body/app-root/app-login/main/form/div[1]/small")
 public WebElement EmailError;
 
 @FindBy(xpath="/html/body/app-root/app-login/main/form/div[2]/small")
 public WebElement PasswordError;
 
 @FindBy(xpath = "//div[@class='row']")
 public WebElement footer;
 
 
public TrainerLogin(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

public void setUserName(String strUserName){
	    	username.sendKeys(strUserName);     
	    	}

	  //Set password in password textbox
public void setPassword(String strPassword){
	       password.sendKeys(strPassword);
	    }
	   
public String readUserName(){
	    	return username.getText();   
	    }
	  
	    
public String readPassword(){
	       return password.getText();
	    }
	   
public boolean checkUsernameEditable()
	    {
	    	if(username.isEnabled())
	    		return true;
	    	else
	    		return false;
	    }
	   
public boolean checkPasswordEditable()
	    {
	    	if(password.isEnabled())
	    		return true;
	    	else
	    		return false;
	    }
	    
  
public void clickLoginLink(){
	    	
	  loginLink.click();
	    	         
	    }  
	   
	    //Click on login button
	   
public void clickLogin(){
	    		    	
	            login.click();     
	    }  
	    
public void Clear()
	    {
	    	username.clear();
	    	password.clear();
	    	
	    }

 public void clickHome(){
	    	
	     HomeLink.click();
	            
	    }  
 
 public void clickSignUp(){
 
         SignUpLink.click();
         
 }  
 
 public void clickEmail()
 {
	 username.click();
 }
 
 public void clickPassword()
 {
	 password.click();
 }
 
 
 }
