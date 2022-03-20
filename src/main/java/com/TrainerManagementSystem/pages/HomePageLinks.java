package com.TrainerManagementSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TrainerManagementSystem.utilities.PageUtility;

public class HomePageLinks {
	
 WebDriver driver;
 PageUtility pg;
 
 @FindBy(linkText="Login")
 private WebElement loginLink;
 
 @FindBy(linkText="Sign Up/Enroll")
 private WebElement SignUpLink;
	 
 public HomePageLinks(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
 public void clickLogin(){
	    	
	    	//pg.waitForElementTobeVisible(driver, loginLink, 35);
	    	loginLink.click();
	           
	    }  
	 
 public void clickSignUp(){
	    	
	    	//pg.waitForElementTobeVisible(driver, loginLink, 35);
		 SignUpLink.click();
	           
	    }  


}
