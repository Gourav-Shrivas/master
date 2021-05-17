package common;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Utilities {
	
   
	public static void takeScreenshot(WebDriver driver, String filepath) throws IOException {
		// 1.Casting

		TakesScreenshot capture = (TakesScreenshot) driver;

		// 2.Taking screenshot

		File actualScreenshot = capture.getScreenshotAs(OutputType.FILE);

		// 3.Create New file for copying
		 SimpleDateFormat timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
	     String currenttime=timestamp.format(new Date());
		File myFile = new File("C:\\Users\\HP\\Downloads\\screenshot\\"+"SCREENSHOT"+currenttime+".png");

		// 4.Copy screenshot to myfile

		FileUtils.copyFile(actualScreenshot, myFile);
		

	}

	public static Object[][] generateDataArray(List<String> dataList, int rowCount, int columnCount) {
		//columnCount = columnCount / rowCount;
		int k = 0;
		String[][] xlsData = new String[rowCount][columnCount];
		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < columnCount; j++) {
				xlsData[i][j] = dataList.get(k++);
			}
		}
		return xlsData;
	}

	
	@DataProvider
	public static Object[][] provideDataFromCsv() throws IOException {

		FileReader fis = new FileReader("D:\\New folder\\com.practise.framework\\src\\test\\java\\testresources\\data.csv");
		BufferedReader reader = new BufferedReader(fis);
		List<String> records = new ArrayList<String>();
		String line;
		int rowCount = 0;
		int colCount=0;
		while ((line = reader.readLine()) != null) {
			rowCount++;
			colCount=0;
			System.out.println(line);
			String[] tokens = line.split(",");
            for (int i = 0; i < tokens.length; i++) {
				records.add(tokens[i]);
				colCount++;
			}
		}

		Object[][] data=  generateDataArray(records,rowCount-1,2);
		
		return data;
	}
}

