package com.TrainerManagementSystem.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import com.TrainerManagementSystem.pages.AdminLogout;
import com.TrainerManagementSystem.utilities.ExcelUtility;

public class TestClassAdminLogout extends TestBase {
	AdminLogout obj;
@Test
	public void ValidateLogOutTCB2G70057() throws IOException, Exception
	{
		obj=new AdminLogout(driver);
		obj.clickLoginLink();

		obj.setUserName(ExcelUtility.getCellDataAdmin(1, 0));
		obj.setPassword(ExcelUtility.getCellDataAdminInt(1, 1));
		
		obj.clickLogin();
		Thread.sleep(2000);
		String expectedUrl1 = prop.getProperty("adminApproval");
		String actualUrl1 =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl1, actualUrl1);
		Thread.sleep(1000);
		obj.clickLogout();
		Thread.sleep(2000);
		String expectedUrl2 = prop.getProperty("url");
		String actualUrl2 =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl2, actualUrl2);
		

	}
	@Test
	public void ValidateLoginAndOutAfterLogoutTCB2G70058() throws IOException, Exception
	{
		obj=new AdminLogout(driver);
		obj.clickLoginLink();
		
		obj.setUserName(ExcelUtility.getCellDataAdmin(1, 0));
		obj.setPassword(ExcelUtility.getCellDataAdminInt(1, 1));
		
		obj.clickLogin();
		Thread.sleep(2000);
		String expectedUrl1 = prop.getProperty("adminApproval");
		String actualUrl1 =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl1, actualUrl1);
		Thread.sleep(1000);
		obj.clickLogout();
		Thread.sleep(2000);
		String expectedUrl2 = prop.getProperty("url");
		String actualUrl2 =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl2, actualUrl2);
		obj.clickLoginLink();
		
		obj.setUserName(ExcelUtility.getCellDataAdmin(1, 0));
		obj.setPassword(ExcelUtility.getCellDataAdminInt(1, 1));
		
		obj.clickLogin();
		Thread.sleep(2000);
		String expectedUrl3 = prop.getProperty("adminApproval");
		String actualUrl3 =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl3, actualUrl3);
		Thread.sleep(1000);
		

	}


}
