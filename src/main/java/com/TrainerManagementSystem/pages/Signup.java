package com.TrainerManagementSystem.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {

	
 WebDriver driver;
	 
  @FindBy(xpath="//a[contains(text(),'Sign Up/Enroll')]")
  public WebElement Enroll;
  @FindBy(xpath= "//small[normalize-space()='Enter valid name']")
  public WebElement nameErrorMessage;
 	@FindBy(id="name")
 	public WebElement name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="phone")
	public WebElement phone;
	@FindBy(id="address")
	public WebElement address;
	@FindBy(id="h_qualification")
	private WebElement h_qualification;
	@FindBy(id="skillSet")
	private WebElement skillSet;
	@FindBy(id="company_name")
	private WebElement company_name;
	@FindBy(id="designation")
	public WebElement designation;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(id="re_password")
	public WebElement re_password;
	@FindBy (xpath = "//small[contains(text(),'Password must contain atleast 1 capital letter,1 s')]")
	public WebElement passwordError;
	@FindBy(xpath="//span[contains(text(),'Choose Courses')]")
	public WebElement chooseCourse;
	@FindBy(xpath="//div[normalize-space()='Full Stack Development']")
	public WebElement FSD;
	@FindBy(xpath="//div[normalize-space()='Data Science & Analytics']")
	public WebElement DSA;
	@FindBy(xpath="//div[normalize-space()='Cyber Security Analyst']")
	public WebElement CSA;
	@FindBy(xpath="//div[normalize-space()='Robotic Process Automation']")
	public WebElement RPA;
	@FindBy(xpath="//button[@type='submit]")
	private WebElement bttn11;
	@FindBy(xpath="/html/body/app-root/app-sign-up/form/button")
	public WebElement bttn1;
	@FindBy(xpath="//span[contains(text(),'Choose Courses')]")
	public List <WebElement> dropdown;
	
	@FindBy(xpath="//span[contains(text(),'Choose Courses')]")
	public WebElement mainDropdown;
	
	@FindBy(xpath="//div[@class='dropdown-list']")
	private WebElement dropdown1;
	
	@FindBy(xpath="//div[normalize-space()='Full Stack Development']")
	private WebElement list1;
	
	@FindBy(xpath="//div[normalize-space()='Data Science & Analytics']")
	private WebElement list2;
	
	@FindBy(id="img")
	private WebElement img;
	
	@FindBy(xpath="//small[@class='text-danger']")
	public WebElement mobErrorMessage;
	
	@FindBy(xpath = "//small[normalize-space()='Enter valid mail Id']")
	public WebElement mailErrorMessage;
	
	@FindBy (xpath="//small[@id='error']")
	public WebElement errorPassword;
	

	 public Signup(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 public void setName(String strName)
		{
			name.sendKeys(strName);
		}
		public void setQualification(String strQualification){
			h_qualification.sendKeys(strQualification);     
		}
		public void setSkillSet(String strSkill)
		{
			   skillSet.sendKeys(strSkill);
		}

		public void setCompanyName(String strCompanyName)
		{
				company_name.sendKeys(strCompanyName);     
		}
			
		public void setDesignation(String strDesignation)
		{
				designation.sendKeys(strDesignation);
		}
			
		public void setAddress(String strAddress)
			{
			   address.sendKeys(strAddress);
			}

		public void setPhone(String strph)
			{
				   phone.sendKeys(strph);
			}

		public void setEmail(String strrepass)
			{
				email.sendKeys(strrepass);
			}

		public void setPassword(String strpass)
			{
				   password.sendKeys(strpass);
			}

		public void setRePassword(String strrepass)
			{
				re_password.sendKeys(strrepass);
			}
		
		
		public void setImage(String string)
		{
			img.sendKeys(string);
			
		}
		public void setButton(){
		
			   bttn1.sendKeys(Keys.RETURN); 
			   
		}
		
		
		public void setDropdown()
		{
			mainDropdown.click();
			list1.click();
			//list2.click();
			dropdown1.click();
		}
		

}

		
	 
			
	






	 
