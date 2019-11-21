package com.paytm.qa.Pages;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paytm.qa.base.TestBase;


public class HomePage  extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Electricity')]")
	WebElement Electricity;
	
	@FindBy(xpath="//*[@id='app']/div/div[4]/div[1]/div[1]/div/div[2]/div[2]/ul/li/div/div/input")
	WebElement Selectstate;
	
	@FindBy(xpath = "//*[@id='app']/div/div[4]/div[1]/div[1]/div/div[2]/div[2]/ul/li[2]/div/div/input")
	WebElement SelectBoard;
	
	@FindBy(xpath="//*[@id='app']/div/div[4]/div[1]/div[1]/div/div[2]/div[2]/ul/li[3]/div/div/input")
	WebElement District_Type;
	
	@FindBy(xpath="//*[@id='app']/div/div[4]/div[1]/div[1]/div/div[2]/div[2]/ul/li[4]/div[1]/input")
	WebElement txtConsumerNumber;
	
	
	WebElement txtSearch1;
	WebElement button_ecellniit,likes,closemessage;
	WebElement message;
	
	
	 
	 public  HomePage()
		{
			PageFactory.initElements(driver, this);
		}
	
	 WebDriverWait wait = new WebDriverWait(driver,90);
	public void Click_Electricity()
	{ 
		wait.until(ExpectedConditions.visibilityOf(Electricity));
		Electricity.click();
		
		//return new PayForElectricity();
		
	}	
	
	public void Select_State(String state)
	{ 
		wait.until(ExpectedConditions.elementToBeClickable(Selectstate));
		Selectstate.click();
		/*wait.until(ExpectedConditions.elementToBeClickable(Selectstate));
		Selectstate.clear();*/
		 List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='_3xI1']/ul/li"));
		 System.out.println(allElements);
		 for (WebElement element: allElements) {
		      if(element.getText().equalsIgnoreCase(state))
		      {
		    	  element.click();
		      }
		 }
	}
	
	
	public void Select_Board(String board)
	{ 
		wait.until(ExpectedConditions.elementToBeClickable(SelectBoard));
		SelectBoard.click();
		/*wait.until(ExpectedConditions.elementToBeClickable(Selectstate));
		Selectstate.clear();*/
		 List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='_3xI1']/ul/li"));
		 System.out.println(allElements);
		 for (WebElement element: allElements) {
		      if(element.getText().equalsIgnoreCase(board))
		      {
		    	  element.click();
		      }
		 }
	}

	
	
}
	
	

