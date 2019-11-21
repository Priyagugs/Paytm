package com.paytm.qa.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paytm.qa.base.TestBase;

public class Searched_Profile_Home_Page extends TestBase  {
	
	

		@FindBy(xpath = "//span[contains(@data-testid, 'UFI2TopReactions/tooltip_LIKE')]")
		List<WebElement> PostLikes; 
		
		
		
		@FindBy(xpath = "//div[contains(@class, '_5j0e fsl fwb fcb')]")
		List<WebElement> Post_liked_Profiles;
		
		
	
		 public Searched_Profile_Home_Page ()
			{
				
				PageFactory.initElements(new AjaxElementLocatorFactory(driver, 90), this);
			}
		
		 WebDriverWait wait = new WebDriverWait(driver,90);
		
		
		 public void Click_Post_Likes() throws InterruptedException
			{
			 
			
			 
			 for(int i=0;i<PostLikes.size();i++)
			 {
				 
				
				Thread.sleep(2000);
				 wait.until(ExpectedConditions.visibilityOf(PostLikes.get(i)));
				 wait.until(ExpectedConditions.elementToBeClickable(PostLikes.get(i))).click();
				 int post_liked_profiles_count=Post_liked_Profiles.size();
			      
			      for(int j=0;j<post_liked_profiles_count;j++)
					 { Thread.sleep(2000);
						 wait.until(ExpectedConditions.visibilityOfAllElements(Post_liked_Profiles));
						 wait.until(ExpectedConditions.elementToBeClickable(Post_liked_Profiles.get(j))).click();
						 driver.navigate().back();
					 
						 if(j<(post_liked_profiles_count-1))
							 
						 { 
							Thread.sleep(2000);
							
							 wait.until(ExpectedConditions.visibilityOfAllElements(PostLikes));
			
							// wait.until(ExpectedConditions.visibilityOf(PostLikes.get(i)));
							 wait.until(ExpectedConditions.elementToBeClickable(PostLikes.get(i))).click();
			
					    
						 }
			   
			     
			 }
			
				
			}
			}
}


