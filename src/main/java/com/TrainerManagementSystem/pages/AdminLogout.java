package com.TrainerManagementSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TrainerManagementSystem.utilities.PageUtility;

public class AdminLogout {
	
 WebDriver driver;
 PageUtility pg;
 @FindBy(xpath="//a[normalize-space()='Login']")
 private WebElement loginLink;
 
 @FindBy(xpath="//input[@id='floatingInput']")
 private WebElement username;
 
 @FindBy(xpath="//input[@id='floatingPassword']")
 private WebElement password;    
 
 @FindBy(xpath="/html/body/app-root/app-login/main/form/button")
 private WebElement login;
 
 @FindBy(xpath="//a[normalize-space()='Logout']")
 private WebElement LogoutLink;
	 
	 
	 public AdminLogout(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
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
	    
public void clickLoginLink(){
	 
	  loginLink.click();
	            
	    }  
	   
	    //Click on login button
	    
public void clickLogin(){
	    	
	    	//pg.waitForElementTobeVisible(driver, login, 35);
	 
	    login.click();
	            
	    }  
  public void clickLogout(){
	    	
	    	//pg.waitForElementTobeVisible(driver, login, 35);
	    	
	  LogoutLink.click();
	            
	    }  
	   

}
