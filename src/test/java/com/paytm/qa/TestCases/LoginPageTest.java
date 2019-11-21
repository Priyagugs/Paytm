package com.paytm.qa.TestCases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paytm.qa.Pages.HomePage;
import com.paytm.qa.Pages.PayForElectricity;
import com.paytm.qa.Pages.LoginPage;
import com.paytm.qa.Pages.Post_liked_User_Profile;
import com.paytm.qa.Pages.SearchResults;
import com.paytm.qa.Pages.Searched_Profile_Home_Page;
import com.paytm.qa.base.TestBase;
import com.paytm.qa.utils.TestUtil;

import junit.framework.Assert;

public class LoginPageTest extends com.paytm.qa.base.TestBase {
	
	  LoginPage lp;
	  HomePage homepage;
	  PayForElectricity pfe;
	  
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void Setup()
	{
		initalization();
		lp =new LoginPage();
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testdata=TestUtil.getDatafromExcel();
		return testdata.iterator();
	}

	
	@Test(dataProvider="getTestData")
	
	public void PayForElectricityBill(String username,String password) throws InterruptedException
	
	{
	homepage =lp.Login(username, password);
	homepage.Click_Electricity();
//	pfe.SelectState();
	
	
	
	//SearchResults sr = homepage.clickSearch();
	
	
	//Searched_Profile_Home_Page Sch_profile=sr.Click_Searched_Text();
//	Sch_profile.Click_Post_Likes();
//	pl.Click_Post_Liked_Profiles();

	
	}
	

/*@AfterMethod
	
	public void teardown()
	{
		driver.quit();
	}*/
}
	

