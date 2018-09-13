package reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;

public class ReusableClass {
	public static final String FILE_PATH=".\\src\\main\\resources\\Property.properties";
	public static Properties p = new Properties();
	public static void initProperties() throws IOException {
		FileInputStream fs = new FileInputStream(FILE_PATH);
		p.load(fs);
		System.out.println("************** Property file load successfully **************");
	}

	public static String readExcel(String filePath,String fileName, String sheetName, String RowField) throws IOException {
		System.out.println("Enter on read excel method");
		File file= new File(filePath+"\\"+fileName);
		System.out.println("Value on file veriable :"+file);
		FileInputStream inputStrim= new FileInputStream(file);
		Workbook vwb=new HSSFWorkbook(inputStrim);
		Sheet vsheet=vwb.getSheet(sheetName);
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

}
