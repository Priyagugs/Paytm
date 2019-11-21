package com.paytm.qa.Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paytm.qa.base.TestBase;
public class PayForElectricity extends TestBase{
	@FindBy(xpath="//label[contains(text(),'Select State')]")
	WebElement Selectstate;
	
	@FindBy(xpath = "//label[contains(text(),'Select Board')]")
	WebElement SelectBoard;
	
	@FindBy(xpath="//label[contains(text(),'District/Type')]")
	WebElement District_Type;
	
	@FindBy(xpath="//label[(@class='_1l8W')]")
	WebElement txtConsumerNumber;
	
	public PayForElectricity()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle()
	{
		
		
		return driver.getTitle();
		
	}
	WebDriverWait wait = new WebDriverWait(driver,90);
	
	public void SelectState()
	{
		wait.until(ExpectedConditions.visibilityOf(Selectstate));
		Selectstate.click();
		Selectstate.clear();
		 List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='_3xI1']/ul/li"));
		 System.out.println(allElements);
		 for (WebElement element: allElements) {
		        System.out.println(element.getText());
		 }
	
	
}

	public void Pay_For_Electricity()
	{
		wait.until(ExpectedConditions.visibilityOf(Selectstate));
		Selectstate.click();
		Selectstate.clear();
		
		
	
	
}

}
