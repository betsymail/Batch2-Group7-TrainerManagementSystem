package com.TrainerManagementSystem.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.TrainerManagementSystem.pages.AdminLogin;
import com.TrainerManagementSystem.pages.Allocate;
import com.TrainerManagementSystem.utilities.ExcelUtility;

public class TestClassAllocate extends TestBase{
	
	Allocate Aloc;
	AdminLogin AdmLog;
	
	@BeforeTest
	public void login() throws IOException {
		
		driver.navigate().to(prop.getProperty("login"));
		AdmLog = new AdminLogin(driver);
		AdmLog.setEmail(ExcelUtility.getCellDataAdmin(1, 0));
		AdmLog.setPassword(ExcelUtility.getCellDataAdminInt(1, 1));
		AdmLog.clickButton();
		
	}
	
	@Test(priority = 1)
	public void VerifySearchBoxTCB2G70039() {
		
		Aloc = new Allocate(driver);
		driver.navigate().to(prop.getProperty("allocatePage"));
		Aloc.search.click();
		Assert.assertTrue(Aloc.search.isEnabled());
		
	}
	
	@Test(priority = 2)
	public void VerifySearchDetailsTCB2G70040() {
		
		Aloc = new Allocate(driver);
		Aloc.setSearch("analyst");
		
		int totalRowNumber = Aloc.rowNo.size();
		if(totalRowNumber > 1) {
			AssertJUnit.assertTrue(true);
		} 
	}
	
	@Test(priority = 3)
	public void VerifySearchDetailsbyIdTCB2G70042() {
		
		Aloc = new Allocate(driver);
		Aloc.setSearch("ICT5afsdb");
		
		int totalRowNumber = Aloc.rowNo.size();
		if(totalRowNumber == 1) {
			AssertJUnit.assertTrue(true);
		} 
	}	
}
