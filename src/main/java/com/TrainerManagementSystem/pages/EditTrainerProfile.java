package com.TrainerManagementSystem.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditTrainerProfile {
	
 WebDriver driver;
 
		   @FindBy(xpath="//a[contains(text(),'Login')]")
			private WebElement login;
			
			@FindBy(id="floatingInput")
			private WebElement userName;
			
			@FindBy(id="floatingPassword")
			private WebElement passwd;
			
			@FindBy(xpath="//button[contains(text(),'Sign in')]")
			private WebElement signIn;
			
			@FindBy(xpath="//button[contains(text(),'Edit Profile')]")
			private WebElement editButton;
 
			@FindBy(xpath="//input[@id='name']")
			public WebElement Name;
			
			@FindBy(xpath ="//input[@id='email']")
			public WebElement Email;
			
			@FindBy(xpath="//input[@id='phone']")
	        public WebElement mobileno;	
			
			@FindBy(xpath="//input[@id='address']")
			public WebElement address;
			
			@FindBy(xpath="//input[@id='h_qualification']")
			public WebElement quali;
			
			@FindBy(xpath="//input[@name='skillSet']")
			public WebElement skill;
			
			@FindBy(xpath="//input[@id='company_name']")
			public WebElement company;
			
			@FindBy(xpath="//input[@id='designation']")
			public WebElement desig;
			
			@FindBy(xpath="//input[@id='img']")
			public WebElement photo;
			
			@FindBy(xpath="//a[normalize-space()='My Allocation Details']")
			public WebElement myAllocation;
			
			@FindBy(xpath="/html/body/app-root/app-edit-details-form/form/button")
			public WebElement editTrainerButton;
			
			@FindBy(xpath="/html/body/app-root/app-footer/footer/div[2]/div[1]")
			public WebElement headOffice;
			
			@FindBy(xpath = "/html/body/app-root/app-footer/footer/div[2]/div[2]")
			public WebElement aboutUs;
			
			@FindBy(xpath = "/html/body/app-root/app-footer/footer/div[2]/div[3]")
			public WebElement support;
			
			@FindBy(xpath="//body/app-root[1]/app-allocation-details-page[1]/div[1]/div[1]/div[1]/div[1]/d")
			public WebElement startDate;
			
			@FindBy(xpath="//td[contains(text(),'16:04')]")
			public WebElement time;
			
			@FindBy(xpath="//td[contains(text(),'CSA001')]")
			public WebElement batchId;
			
			@FindBy(xpath="//td[contains(text(),'http//googlemeet.com')]")
			public WebElement meetinglink;
			
			@FindBy(id="img")
			public WebElement image;
		
			
	  
	 public EditTrainerProfile(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

 public void clickLogin() {
	login.click();
					}
					
					//enter username
 public void setUsername(String strUserName) {
	userName.sendKeys(strUserName);
					}

 public void setPassword(String strPassword) {
	passwd.sendKeys(strPassword);
					}
					
 public void clickSignin() {
	signIn.click();
					}

 public void clickEdit() {
	editButton.click();
			 		}

 public void setName(String strName) {
		Name.sendKeys(strName);
					}
 
	                //Enter email
	public void setEmail(String strEmail) throws Exception {
	  Email.sendKeys(strEmail); //enter new text
					}
	 	 		 //Enter mobile
  public void mobileno(String strmobileno) {
	 mobileno.sendKeys(strmobileno);
					}
	
	public void address(String straddress) throws Exception {
		address.sendKeys(straddress);
					}

 public void quali(String strquali) {
	 quali.sendKeys(strquali);
					}

 public void skill(String strskill) {
	 skill.sendKeys(strskill);
					}
 
 public void company(String strcompany) {
	 company.sendKeys(strcompany);
					}
 
 public void designation(String strdesignation) {
	 desig.sendKeys(strdesignation);
					}

 public void setImage(String strimage) {
	 image.sendKeys(strimage);
	        }

 public void clickTrainerEdit() {
	  editTrainerButton.sendKeys(Keys.RETURN);
						}
		 

 public void clickmyAllocation() {
		myAllocation.click();
					}
	 
 public void startDate(String startdate) {
	 startDate.sendKeys("2022-09-01");
					}

 public void time(String strtime) {
	 time.sendKeys("17:24");
          }

 public void batchId(String strid) {
	 batchId.sendKeys("CSA001");
          }

 public void meetinglink(String strlink) {
   meetinglink.sendKeys("http//googlemeet.com");
         }
	 
	         
}
