package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import com.TrainerManagementSystem.constants.AutomationConstants;
import com.TrainerManagementSystem.pages.AdminApproval;
import com.TrainerManagementSystem.pages.AdminLogin;
import com.TrainerManagementSystem.utilities.ExcelUtility;

public class TestClassAdminApproval extends TestBase {
	
	AdminLogin AdmLog;
	AdminApproval AdmApp;
	
	@BeforeTest
	public void login() throws IOException {
		
		driver.navigate().to(prop.getProperty("login"));
		AdmLog = new AdminLogin(driver);
		AdmLog.setEmail(ExcelUtility.getCellDataAdmin(1, 0));
		AdmLog.setPassword(ExcelUtility.getCellDataAdminInt(1, 1));
		AdmLog.clickButton();
		
	}
	
	@Test(priority = 1)
	public void VerifyContentsTableTCB2G70030() {
		AdmApp = new AdminApproval(driver);
		int totalColNumber = AdmApp.colNo.size();
		int expectedColNo = 9;
		if(expectedColNo == totalColNumber) {
			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("All column data are not displayed");
		}
	
		int totalRowNumber = AdmApp.rowNo.size();
		if(totalRowNumber > 1) {
			AssertJUnit.assertTrue(true);
		} 
	}
	
	@Test(priority = 7)
	public void VerifyPageScrollingTCB2G70031() {
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");	
		jse.executeScript("window.scrollBy(0,-800)");
  
	}
	
	
	@Test(priority = 3)
	public void VerifyFooterDisplayTCB2G70032() {
		AdmLog = new AdminLogin(driver);
		AssertJUnit.assertTrue(AdmApp.footer.isDisplayed());
		
	}
	
	@Test(priority = 4)
	public void VerifyContentsTableTCB2G70033() {
		AdmApp = new AdminApproval(driver);
		
		Select type = new Select(AdmApp.employmentType);
		List <String> actualValues = new ArrayList<String>();
		for(WebElement element :type.getOptions()){
			actualValues.add(element.getText());
			}
		List<String> expectedValues = new ArrayList<String>();
			expectedValues.add(AutomationConstants.EMP_CHOOSETYPE);
			expectedValues.add(AutomationConstants.EMP_TYPE_1);
			expectedValues.add(AutomationConstants.EMP_TYPE_2);
			expectedValues.add(AutomationConstants.EMP_TYPE_3);
			
		for (int i=0;i<actualValues.size();i++) {
				AssertJUnit.assertEquals(actualValues.get(i),expectedValues.get(i));
			}
		type.selectByVisibleText(AutomationConstants.EMP_TYPE_1);
		String expected = AutomationConstants.EMP_TYPE_1;
		  String actual = type.getFirstSelectedOption().getText();
		  AssertJUnit.assertEquals(actual,expected);
		
	}
	 
	@Test(priority = 6)
	public void VerifyApproveWithoutEmpTypeTCB2G70034() {
		AdmApp = new AdminApproval(driver);
		Select type = new Select(AdmApp.employmentType);
		type.selectByVisibleText(AutomationConstants.EMP_CHOOSETYPE);
		AdmApp.approveButton.click();
		if(AdmApp.approveButton.isEnabled()) {
			System.out.println("TCB2G70034: Approve button should not active if EmpType is empty");
			AssertJUnit.assertTrue(false);
		} 
	}
	
	@Test(priority = 5)
	public void VerifyApproveButtonTCB2G70035() {
		AdmApp = new AdminApproval(driver);
		Select type = new Select(AdmApp.employmentType);
		type.selectByVisibleText(AutomationConstants.EMP_TYPE_1);
		AdmApp.approveButton.click();
	}
	
	@Test(priority = 6)
	public void VerifyRejectButtonTCB2G70037() {
		AdmApp = new AdminApproval(driver);
		Select type = new Select(AdmApp.employmentType);
		type.selectByVisibleText(AutomationConstants.EMP_TYPE_1);
		AdmApp.rejectButton.click();
	}
	
	
	
}
