package com.paytm.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.paytm.qa.excel.utility.Xls_Reader;

public class TestUtil {
	public static long Page_load_Timeout=30;
	public static long Implicit_Wait=30;

	public static String TESTDATA_SHEET_PATH = "C:\\Automation\\Automation_Practice\\Paytmm\\src\\main\\java\\com\\paytm\\qa\\testdata\\login.xlsx";

	
	static JavascriptExecutor js;
	
	/*public static Object[][] getTestData(String sheetName) throws InvalidFormatException  {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
*/
	
	public static void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String currentDir=System.getProperty("user.dir");
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("C:\\screenshots\\"+System.currentTimeMillis()+".png"));
		
		
	}
	
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDatafromExcel()
	{
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		
		try
		{
			reader=new Xls_Reader("C:\\Automation\\Automation_Practice\\Paytmm\\src\\main\\java\\com\\paytm\\qa\\testdata\\login.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		for(int rowNum=2;rowNum<=reader.getRowCount("login");rowNum++)
		{
			String username=reader.getCellData("login", "Uid", rowNum);
			String password=reader.getCellData("login", "Pwd", rowNum);
			
			Object ob[]={username,password};
			mydata.add(ob);
		}
		
		return mydata;
	
	}
	

}
