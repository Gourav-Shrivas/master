package com.practise.framework;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadPdfFile {
	
	WebDriver driver;
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void readPDF() throws IOException {
		driver.get("http://www.pdf995.com/samples/pdf.pdf");
		String Currentlink=driver.getCurrentUrl();
		URL url=new URL(Currentlink);
		InputStream is=url.openStream();
		BufferedInputStream fp=new BufferedInputStream(is);
		PDDocument document=null;
		document=PDDocument.load(fp);
//		String pdfContent= new PDFTextStripper().getText(document);ra
		PDFTextStripper stripper=new PDFTextStripper();
		String pdfContent=stripper.getText(document);
		System.out.println(pdfContent);
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
}
