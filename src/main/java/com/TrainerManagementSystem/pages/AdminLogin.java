package com.TrainerManagementSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdminLogin {
	

	 WebDriver driver;
	 
	 @FindBy(name="email")
	 public WebElement email;
	 @FindBy(name="password")
	 public WebElement password;
	 @FindBy (xpath="//button[contains(text(),'Sign in')]")
	 public WebElement loginButton;
	 @FindBy (xpath ="//div[contains(text(),' Invalid Login Credintials ')]")
	 public WebElement errorMessage;
	 @FindBy (xpath = "//small[normalize-space()='Enter valid mail Id']")
	 public WebElement warningEmail;
	 @FindBy (xpath = "//small[normalize-space()='Please enter a valid password']")
	 public WebElement warningPassword;
	 
	 public AdminLogin(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver,this);
	 }
public void setEmail(String strEmail) {
  email.sendKeys(strEmail);
		
}

public void setPassword(String strPassword) {
	password.sendKeys(strPassword);
}

public void clickButton() {
	loginButton.click();
}


}

