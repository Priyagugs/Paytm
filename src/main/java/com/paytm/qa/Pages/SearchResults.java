package com.paytm.qa.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paytm.qa.base.TestBase;

public class SearchResults extends TestBase {

	@FindBy(linkText = "E-Cell, NIT Trichy")
	WebElement btnEcellLink; 
	
	
	 public  SearchResults()
		{
			//PageFactory.initElements(driver, this);
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 90), this);
		}
	
	 WebDriverWait wait = new WebDriverWait(driver,90);
	 
	 public Searched_Profile_Home_Page Click_Searched_Text()
		{ driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOf(btnEcellLink));
			btnEcellLink.click();
			return new Searched_Profile_Home_Page();
			
			
		}
	
}
