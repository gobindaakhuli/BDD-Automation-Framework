package com.amazon.test.reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {
	public static Properties OR_AT_HOME_PAGE;
	public static Properties OR_AT_LOGIN_PAGE;
	public static Properties OR_AT_PLPPDP_PAGE;
	public static Properties OR_AT_FULLCART_PAGE;
	public static final String FILE_PATH=".\\src\\main\\resources\\Property.properties";
	public static Properties p = new Properties();
	public static void initProperties() throws IOException {
		loadPropertyFile();
		System.out.println("************** Property file load successfully **************");
	}
	
	/***
	 * Load all property file to make available all xpath on execution time
	 * @throws IOException 
	 */
	public static void loadPropertyFile() throws IOException {
		FileInputStream propertyInputFile = null;
		propertyInputFile = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//ATHomePage.properties");
		OR_AT_HOME_PAGE = new Properties();
		OR_AT_HOME_PAGE.load(propertyInputFile);
		
		propertyInputFile = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//ATLoginPage.properties");
		OR_AT_LOGIN_PAGE = new Properties();
		OR_AT_LOGIN_PAGE.load(propertyInputFile);
		
		propertyInputFile = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//ATPlpPdpPage.properties");
		OR_AT_PLPPDP_PAGE = new Properties();
		OR_AT_PLPPDP_PAGE.load(propertyInputFile);
		
		propertyInputFile = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//ATFullCartPage.properties");
		OR_AT_FULLCART_PAGE = new Properties();
		OR_AT_FULLCART_PAGE.load(propertyInputFile);
	}

	/***
	 * Mouse hover on specific element
	 * @param WebDriver
	 * @param XPATH of the specific element
	 */
	public static void mouseHoverUsingAction(WebDriver driver,String element) {
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(element));
		action.moveToElement(ele).perform();
	}
	
	public static String readExcel(String RowField) throws IOException {
		File file= new File(System.getProperty("user.dir")+"\\"+"TestData.xls");
		FileInputStream inputStrim= new FileInputStream(file);
		Workbook vwb=new HSSFWorkbook(inputStrim);
		Sheet vsheet=vwb.getSheet("Data");
		int rowCount=((vsheet.getLastRowNum() - vsheet.getFirstRowNum())+1);
		int colCount=vsheet.getRow(0).getLastCellNum();
		System.out.println("No of rows are : "+rowCount);
		System.out.println("No of columns are : "+colCount);
		for(int i=0; i<rowCount; i++) {
			Row row= vsheet.getRow(i);
			Cell cell=CellUtil.getCell(row,0);
			
			if(cell.getStringCellValue().equals(RowField)) {
				System.out.println("Inside if");
				String strCellValue=row.getCell(1).getStringCellValue();
				System.out.println("Cell value is :"+strCellValue);
				return strCellValue;
			}
		}
		return "No row value matched";
	}
	public static void waitUntilelementIsClickable(String locator, WebDriver driver) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		} catch (Exception e) {
		}
	}
}
