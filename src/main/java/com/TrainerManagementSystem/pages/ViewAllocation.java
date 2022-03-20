package com.TrainerManagementSystem.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//import com.TrainerManagementSystem.constants.AutomationConstants;

public class ViewAllocation {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginLink;
	
	@FindBy(id="floatingInput")
    public WebElement username;
	
    @FindBy(id="floatingPassword")
    public WebElement password;  
    
    @FindBy(xpath="//button[contains(text(),'Sign in')]")
    private WebElement login;
    
    @FindBy(xpath="//a[contains(text(),'ViewAllocation')]")
    private WebElement viewAllocationButton;
    
    @FindBy(xpath="//td[normalize-space()='ICT5ciarq']")
    public WebElement ID;
    
    @FindBy(xpath="//tbody/tr[8]/td[2]")
    public WebElement Name;
    
    @FindBy(xpath="//tbody/tr[8]/td[3]")
    public WebElement CourseID;
    
    @FindBy(xpath="//tbody/tr[8]/td[4]")
    public WebElement BatchID;
    
    @FindBy(xpath="//tbody/tr[8]/td[5]")
    public WebElement STime;
    
    @FindBy(xpath="//tbody/tr[8]/td[6]")
    public WebElement SDate;
    
    @FindBy(xpath="//tbody/tr[8]/td[7]")
    public WebElement EDate;
    
    @FindBy(xpath="//tbody/tr[8]/td[8]")
    public WebElement VenueML;
    
    @FindBy(xpath="//input[@placeholder='Type to search']")
    public WebElement Search;
     
	
	
	 public ViewAllocation(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        }

	 		//Go to Login Page
	 		public void clickloginLink() {
	 			loginLink.click();
	 		}

	 		//clear username field
	        public void clearName() {
	        	username.clear();
	        }
	        
	      //Set user name in textbox
		 	public void setUserName(String strUsername) {
		 		username.sendKeys(strUsername);
		 	}
	
	        
	    	//clear password field
	        public void clearPassword() {
	        	password.clear();
	        }
	        	    	
	      //Set password in password textbox
		     public void setPassword(String strPassword){
		        password.sendKeys(strPassword);
		     }

	        //click on login button
	        public void clickLogin() {
	        	login.click();
	        }
	        
	        //click on view allocation
	        public void clickViewAllocate() {
	        	viewAllocationButton.click();
	        }
	        
	      //clear Search
	        public void clearSearch() {
	        	Search.sendKeys(Keys.DELETE);
	        }
	        
	        //enter albhabets
	        public void enterAlpha(String strName) {
	        	Search.sendKeys(strName);
	        }
	        
	        //enter numbers
	        public void enterNo(String date) {
	        	Search.sendKeys(date);
	        }
	        
	       //enter characters
	        public void enterChar(String strChar) {
	        	Search.sendKeys(strChar);
	        }

	        //clear ID field           
	        public void clearID() {
	        	ID.clear();
	        }
	        
	    
	     
	      
	        
	        
}