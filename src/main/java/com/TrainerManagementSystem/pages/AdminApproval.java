package com.TrainerManagementSystem.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminApproval {
	

	 WebDriver driver;
	 
	
	@FindBy (xpath = "//table[@class='table table-bordered text-white']//td")
	public List <WebElement> table;
	
	@FindBy(xpath = "//table[@class='table table-bordered text-white']//tr//th")
	public List <WebElement> colNo;
	
	@FindBy(xpath = "//table[@class='table table-bordered text-white']//tr//td[1]")
	public List <WebElement> rowNo;
	
	@FindBy(id="emptype")
	public WebElement employmentType;
	
	@FindBy(xpath ="//table[@class='table table-bordered text-white']//tbody/tr[1]/td[9]/a[1]")
	public WebElement approveButton;
	
	@FindBy(xpath = "//table[@class='table table-bordered text-white']//tbody/tr[1]/td[9]/a[2]")
	public WebElement rejectButton;
	 
	@FindBy(xpath = "//div[@class='col-md-4 col-sm-12']")
	public WebElement footer;
		 
	 
	 
	 public AdminApproval(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }

}


