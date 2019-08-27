package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "uid")
	WebElement userid;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "btnLogin")
	WebElement loginbtn;
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
	WebElement lnkLogout;
	
	public void setUserName(String username) {
		userid.sendKeys(username);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickSubmit() {
		loginbtn.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}

}
