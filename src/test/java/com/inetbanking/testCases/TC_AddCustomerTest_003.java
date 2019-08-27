package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, Exception {
		
		logger.info("The test hase started");

		LoginPage lp = new LoginPage(driver);
		logger.info("Login inphormation");
		driver.get(baseURL);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		logger.info("New customer info");
		addcust.enterCustomerName("Pavan");
		addcust.maleGender();
		addcust.enterTheDate("10", "15", "1985");
		Thread.sleep(3000);
		addcust.enterTheAddress("Israel");
		addcust.enterTheCity("Jerusalem");
		addcust.enterTheState("Jerusalem");
		addcust.enterThePinNumber("2569745");
		
		String randNum = randomNum();
		addcust.enterTheTelephoneNumber(randNum);
		
		String email = randomestring() +"@gmail.com";
		addcust.enterTheEmailAddress(email);
		addcust.selectToSubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started.......");
		
		boolean res = driver.getPageSource().contains("Customer Registerd Successfully");
		
		if(res==true) {
			
			Assert.assertTrue(true);
			logger.info("tast case passed........");
		}
		
		else {
			logger.info("tast case failed........");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			
		}
		
	}
	

}
