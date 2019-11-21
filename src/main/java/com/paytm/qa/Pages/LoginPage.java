package com.paytm.qa.Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paytm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(xpath="//div[contains(text(), 'Log In/Sign Up')]")
	WebElement BtnLogin;
	
	@FindBy(xpath = "//span[contains(text(), 'Login/Signup with mobile number and password')]")
	WebElement BtnLoginWithMobile;
	
	@FindBy(xpath = "//iframe[contains(@src,'/v1/api/login?isIframe=true&theme=mp-web')]")
	WebElement Signupiframe;
	
	@FindBy(xpath = "//*[@id='login-header-wrapper']/ul/li[2]")
	WebElement BtnSignup;
	
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement SignintxtUsername;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement SignintxtPassword;
	
	@FindBy(xpath="//input[@name='mobileNumber']")
	WebElement MobileNumber;
	
	@FindBy(xpath="//input[@name='loginPassword']")
	WebElement Password;
	
	@FindBy(xpath="//button[(@class='md-raised md-primary btn-new mt-20 login-btn md-button ng-scope md-default-theme')]")
	WebElement BtnLoginSecurly;
	
	
	
	

	 WebDriverWait wait = new WebDriverWait(driver,90);
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle()
	{
		
		
		return driver.getTitle();
		
	}

	public HomePage Login(String uid,String pwd) throws InterruptedException
	{
		BtnLogin.click();
		driver.switchTo().frame(Signupiframe);
	wait.until(ExpectedConditions.elementToBeClickable(BtnLoginWithMobile));
		BtnLoginWithMobile.click();
		//wait.until(ExpectedConditions.elementToBeClickable(BtnSignup));
		//BtnSignup.click();
		
		SignintxtUsername.sendKeys(uid);
	wait.until(ExpectedConditions.elementToBeClickable(SignintxtPassword));
	SignintxtPassword.sendKeys(pwd);
	
	BtnLoginSecurly.click();
	Thread.sleep(20000);
		
		return new HomePage();
		
		
	
	
}
}
