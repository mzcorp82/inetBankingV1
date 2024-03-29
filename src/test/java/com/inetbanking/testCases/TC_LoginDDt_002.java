package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;
import com.sun.media.jfxmedia.logging.Logger;

public class TC_LoginDDt_002 extends BaseClass{
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();// close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login failed");
		}
		
		else {
			Assert.assertTrue(true);
			logger.info("login passed");
			lp.clickLogout();
			driver.switchTo().alert().accept();// close logout alert
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent() {
		
		try {
			driver.switchTo().alert();// check if the alert is present
			return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider(name = "LoginData")
	String [][] getData() throws Exception{
		
		String path = System.getProperty("user.dir") + "/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "sheet1");
		int colcount = XLUtils.getCellCount(path, "sheet1", 1);
		
		String logindata[][] = new String[rownum][colcount];
		
		for(int i = 1; i <=rownum; i++) {
			
			for(int j = 0; j < colcount; j++) {
				
				logindata[i-1][j] = XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
	return logindata;	
	}

}
