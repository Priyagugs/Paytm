package com.paytm.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paytm.qa.base.TestBase;

public class Post_liked_User_Profile extends TestBase {
	
	@FindBy(xpath = "//div[contains(@class, '_5j0e fsl fwb fcb')]")
	List<WebElement> Post_liked_Profiles; 
	
	
	 public Post_liked_User_Profile ()
		{
			PageFactory.initElements(driver, this);
		}
	
	 WebDriverWait wait = new WebDriverWait(driver,90);
	
	 public void Click_Post_Liked_Profiles()
		{
		 for(int j=0;j<Post_liked_Profiles.size();j++)
		 {
			 wait.until(ExpectedConditions.visibilityOfAllElements(Post_liked_Profiles));
			 wait.until(ExpectedConditions.elementToBeClickable(Post_liked_Profiles.get(j))).click();
			 driver.navigate().back();
			 
			 if(j<(Post_liked_Profiles.size()-1))
			 {
			 
			 Searched_Profile_Home_Page sph=new Searched_Profile_Home_Page();
			 sph.PostLikes.get(j).click();
			 }
			 
		 }
			
		}

}
