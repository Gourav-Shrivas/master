package common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Exceldata {

	public static  void takeScreenshot(WebDriver driver, String filepath, String name) throws IOException {
		TakesScreenshot capture= (TakesScreenshot)driver;
		File srcfile=capture.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat timestamp=new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
		String currenttime=timestamp.format(new Date());
		File destfile= new File(filepath+name+currenttime+".png");
		FileUtils.copyFile(srcfile, destfile);
	}
	
	public static Object[][] generateDataArray(List<String> dataList, int rowCount, int columnCount) {
		//columnCount = columnCount / rowCount;
		int k = 9;
		String[][] xlsData = new String[rowCount][columnCount];
		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < columnCount; j++) {
				xlsData[i][j] = dataList.get(k++);
			}
		}
		return xlsData;
	}

	
	
	@DataProvider
	public static Object[][] provideDataFromExcel() throws IOException {

		
		int rowCount = 0;
	
		List<String> records = new ArrayList();

		Workbook workbook = new  XSSFWorkbook("D:\\New folder\\AvactisProject\\src\\test\\java\\testResources\\Exceldata.xlsx");

		Sheet sheet = (Sheet) workbook.getSheetAt(0);
           XSSFRow r=(XSSFRow) sheet.getRow(4);//get into specified row
           Cell c=r.getCell(3); //get into specified column
            
           
//           String retVal = c.getStringCellValue();
//          
//           boolean b = c.getBooleanCellValue();
//           
//           Date d = c.getDateCellValue();
//           
//           int I = (int) c.getNumericCellValue();
      
//		int I = sheet.getLastRowNum();//get row count
//	int j=r.getLastCellNum();//get columncount
           
//Write back to excel	
//	c.setCellValue("PASS1");
//	FileOutputStream fos = new FileOutputStream("C:\\Documents and Settings\\mahesh\\Desktop\\Book1.xlsx");
//	workbook.write(fos);
//	fos.close();
           
		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {

			XSSFRow row = (XSSFRow) rowIterator.next();
			rowCount++;
			System.out.println("rowcount is "+rowCount);
			Iterator<Cell> cellIterator = row.iterator();

			while (cellIterator.hasNext()) {

				Cell cell = cellIterator.next();
				switch (cell.getCellType()) {

				case STRING:

					records.add(cell.getStringCellValue());
					
				case NUMERIC:
				        String.valueOf(cell.getNumericCellValue());
					      

				}
			}
		}

		Object[][] output = generateDataArray(records,3,9);

		System.out.println(Arrays.deepToString(output));
		return output;
	}
}
	


