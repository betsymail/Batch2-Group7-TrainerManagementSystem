package com.TrainerManagementSystem.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.TrainerManagementSystem.utilities.ExcelUtility;

public class AllocateTrainer {
	
	WebDriver driver;
 
		 @FindBy(xpath="//a[contains(text(),'Login')]")
		 private WebElement login;
			
		 @FindBy(id="floatingInput")
		 private WebElement username;
			
		 @FindBy(id="floatingPassword")
		 private WebElement password;  
		 
		 @FindBy(xpath="//button[contains(text(),'Sign in')]")
		 private WebElement signIn;
 
		 @FindBy (xpath="//a[contains(text(),'Allocate')]")
		 private WebElement allocateTrainerPage;
		 	 
		 @FindBy (xpath="//tbody/tr[1]/td[10]/a[1]")
		 private WebElement firstTrainer;
		 
		 @FindBy(id="Unique_ID")
		 public WebElement trainerID;
			
		 @FindBy(id="name")
		 public WebElement trainerName;
			
		 @FindBy(id="emptype")
	     public WebElement employmentType;
			
		 @FindBy(id="courses")
		 public WebElement CName;
		 
		 @FindBy(id="courseid")
		 public WebElement courseIdList;
			
		 @FindBy(xpath="//small[contains(text(),'Choose a course ID')]")
		 public WebElement courseWarning;
		 
		 @FindBy(id="batchid")
		 public WebElement batchID;
		 
		 @FindBy(id="scheduletime")
		 public WebElement Time;
		 
		 @FindBy(xpath="//small[contains(text(),'Select a time')]")
		 public WebElement TimeWar;
		 
		 @FindBy(xpath= "//*[@id='startdate']")
		 public WebElement startDate;
		 
		 @FindBy(xpath="//small[contains(text(),'Select a date to start the course')]")
		 public WebElement startDateWar;
		 
		 @FindBy(xpath = "//*[@id='enddate']")
		 public WebElement endDate;
		 
		 @FindBy(xpath="//small[contains(text(),'End date must be after start date')]")
		 public WebElement endDateWar;
			
		 @FindBy(id="venue")
		 public WebElement meetingVenue;
		 
		 @FindBy(xpath="//small[@class='text-danger']")
		 public WebElement venueWarning;
		 
		 @FindBy(xpath="//button[normalize-space()='Allocate']")
		 public WebElement allocateButton;
		 
		 @FindBy(xpath="//a[contains(text(),'Logout')]")
		 public WebElement logout;
			
			
					 
		 	public AllocateTrainer(WebDriver driver){
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
//		 	public void setUserName(String strUserName){
//		 	username.sendKeys("admin@gmail.com"); 
//		 	}
		 	
			//Set user name in textbox
		 	public void setUserName() throws IOException {
		 		username.sendKeys(ExcelUtility.getCellDataAdmin(1, 0));
		 	}
		 	
		 	//clear password field
	        public void clearPassword() {
	        	password.clear();
	        }
		 	
		 	//Set password in password textbox
		     public void setPassword() throws IOException{
		        password.sendKeys(ExcelUtility.getCellDataAdminInt(1, 1));
		     }
		
		     //click on login button
		     public void clickSignIn() {
		     	signIn.click();
		     }
	 
		     //go to allocate page
		     public void TrainerPage() {
		    	 allocateTrainerPage.click();
		     }
	 
		     //go to allocate trainer page
		     public void allocateFirstTrainer() {
		    	 firstTrainer.click();
		     }
		     
		   //clear trainer ID field
		        public void cleartrainerID() {
		        	trainerID.clear();;
		        }
		        	
		      //Set trainer ID in trainer ID textbox
		        public void setTrainerID(String strPassword){
		        	trainerID.sendKeys("huNHGF");
		        }
		        
		      //clear Trainer Name field
		        public void clearTrainerName() {
		        	trainerName.clear();
		        }
		        
		      //Set Trainer Name in Trainer Name textbox
		        public void setTrainerName(String strPassword){
		           password.sendKeys("Anya");
		        }
		        
		      //clear Employment Type field
		        public void clearEmploymentType() {
		        	employmentType.clear();
		        }
		        
		      //Set Employment Type in Employment Type textbox
		        public void setEmploymentType(String strPassword){
		        	employmentType.sendKeys("Empanelled");
		        }
		        
		      //clear CName field
		        public void clearCName() {
		        	CName.clear();
		        }
		        
		       //click CName
		        public void clickCName() {
		        	CName.click();
		        }
		        
		      //Set CName in CName textbox
		        public void setCName(String strPassword){
		        	CName.sendKeys("Data Science");
		        }
		        
		        // click Course ID box to select course ID
		        public void CourseIdClick() {
		        //	Select course=new Select(driver.findElement(By.id("courseid")));
		        	courseIdList.click();
		        }
		        
		        //click batch ID box to select batch ID
		        public void batchIDClick() {
		        	batchID.click();
		        }
		        
		        //clear time field
		        public void clearTime() {
		        	Time.clear();
		        }
		        
		        //set wrong time
		        public void setWrongTime() {
		        	Time.sendKeys("2563");
		        }
		        
		        //set right time
		        public void setTime() {
		        	Time.sendKeys("10:30AM");
		        }
		        
		      //click start date
		        public void clickStartDate() {
		        	startDate.click();
		        }
		        
		        //clear start date
		        public void clearStartDate() {
		        	startDate.clear();
		        }
		        
		        //set course start date
		        public void setStartDate() {
		        	startDate.sendKeys("17072022");
		        	
		        }
		        
		        //click end date
		        public void clickEndDate() {
		        	endDate.click();
		        }
		        
		      //clear end date
		        public void clearEndDate() {
		        	endDate.clear();
		        }
		        
		        //set wrong date
		        public void setWrongDate() {
		        	endDate.sendKeys("01072022");
		        }
		        
		        //set course end date
		        public void setEndDate() {
		        	endDate.sendKeys("10102022");
		        	
		        }
		        
		        //clear venue field
		        public void clearVenue() {
		        	meetingVenue.clear();
		        }
		        
		        //set venue
		        public void setVenue() {
		        	meetingVenue.sendKeys("abcd");
		        }
		        
		        //set meeting link
		        public void setMeetinglink() {
		        	meetingVenue.sendKeys("https://meet.google.com/kkx-eyeu-kzt");
		        }
		        
		        
		        //click Allocate button
		            public void clickAllocate() {
		        	allocateButton.sendKeys(Keys.RETURN);
		        }
		        
		            public void clickLogout() {
						logout.click();
				}
		            
		 public void finalEntry() {
			 courseIdList.click();
			 		String ID = "DSA";
			 		Select course=new Select(driver.findElement(By.id("courseid")));
			 		course.selectByVisibleText(ID);
			 batchID.click();
			 	String ID2 = "DSA002";
				Select batch=new Select(driver.findElement(By.id("batchid")));
				batch.selectByVisibleText(ID2);
				
				clearTime();
				setTime();
				
				clearStartDate();
			  setStartDate();
			  clearEndDate();
			  setEndDate();
			 
			clearVenue();
			setMeetinglink();
		 }
		        
}

