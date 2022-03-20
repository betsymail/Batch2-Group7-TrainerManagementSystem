package com.TrainerManagementSystem.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allocate {
	
 WebDriver driver;
	 
 @FindBy (xpath = "//input[@placeholder='Type to search']")
 public WebElement search;
	
 @FindBy (xpath = "//table[@class='table table-bordered text-white']//tr//td[1]")
 public List <WebElement> rowNo;
 
 
	 public Allocate(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

public void setSearch(String strData) {
	search.clear();
	search.sendKeys(strData);
}

}
