package com.TrainerManagementSystem.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaLinks {
	
 WebDriver driver;
	 
@FindBy(xpath="//img[@src='https://i.ibb.co/x7P24fL/facebook.png']")
public WebElement FacebookLink;

@FindBy(xpath="//img[@src='https://i.ibb.co/Wnxq2Nq/twitter.png']")
public WebElement TwitterLink;
	 
@FindBy(xpath="//img[@src='https://i.ibb.co/ySwtH4B/instagram.png']")
public WebElement InstaLink;
	 
public SocialMediaLinks(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

public void ClickFacebookLink()
{
	
	FacebookLink.click();
}
public void ClickTwitterLink()
{
	
	TwitterLink.click();
}
public void ClickInstaLink()
{
	
	InstaLink.click();
}

}
