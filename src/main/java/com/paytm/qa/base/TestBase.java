package com.paytm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.paytm.qa.utils.TestUtil;
import com.paytm.qa.utils.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase()
	{
		try{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Automation\\Automation_Practice\\paytm\\src\\main\\java\\com\\paytm\\qa\\config\\Config.Properties");
			prop.load(ip);
			}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void initalization()
	{
		String browserName=prop.getProperty("browser");
		
		
		
		
		
		if(browserName.equals("chrome"))
		{//Create a map to store  preferences 
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			/*Map<String, Object> prefs=new HashMap<String,Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			//1-Allow, 2-Block, 0-default
			option.setExperimentalOption("prefs",prefs);*/
			
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Automation_Practice\\chromedriver.exe");
			
			driver= new ChromeDriver(option);
			driver.get(prop.getProperty("url"));
			//options.addArguments("--disable-notifications");
			
			
			
			
			
			
			
			
			e_driver=new EventFiringWebDriver(driver);
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver=e_driver;
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		//	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS );
			
					
		}
		
		
	}
	}


