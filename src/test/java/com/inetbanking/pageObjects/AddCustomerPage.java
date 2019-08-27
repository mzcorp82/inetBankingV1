package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	WebElement newcustomerbtn;
	
	@FindBy(how = How.NAME, using = "name")
	WebElement customernametxt;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	WebElement gendermale;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement genderfemale;
	
	@FindBy(how = How.NAME, using = "dob")
	WebElement datetxt;
	
	@FindBy(how = How.NAME, using = "addr")
	WebElement addresstxt;
	
	@FindBy(how = How.NAME, using = "city")
	WebElement citytxt;
	
	@FindBy(how = How.NAME, using = "state")
	WebElement statetxt;
	
	@FindBy(how = How.NAME, using = "pinno")
	WebElement pinnumbertxt;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement telnumber;
	
	@FindBy(how = How.NAME, using = "emailid")
	WebElement emailtxt;
	
	@FindBy(how = How.NAME, using = "sub")
	WebElement submitbtn;
	
	@FindBy(how = How.NAME, using = "res")
	WebElement resetbtn;
	
	public void clickAddNewCustomer() {
		newcustomerbtn.click();
	}
	
	public void enterCustomerName(String cname) {
		customernametxt.sendKeys(cname);
	}
	
	public void maleGender() {
		gendermale.click();
	}
	
	public void femailGemder() {
		genderfemale.click();
	}
	
	public void enterTheDate(String mm, String dd, String yyyy) {
		datetxt.sendKeys(mm);
		datetxt.sendKeys(dd);
		datetxt.sendKeys(yyyy);
	}
	
	public void enterTheAddress(String add) {
		addresstxt.sendKeys(add);
	}
	
	public void enterTheCity(String cit) {
		citytxt.sendKeys(cit);
	}
	
	public void enterTheState(String stat) {
		statetxt.sendKeys(stat);
	}
	
	public void enterThePinNumber(String pin) {
		pinnumbertxt.sendKeys(pin);
	}
	
	public void enterTheTelephoneNumber(String randNum) {
		telnumber.sendKeys(String.valueOf(randNum));
	}
	
	public void enterTheEmailAddress(String email) {
		emailtxt.sendKeys(email);
	}
	
	public void selectToSubmit() {
		submitbtn.click();
	}
	
	public void selectToReset() {
		resetbtn.click();
	}
	

	
	

}
