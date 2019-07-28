package webdrivertraining;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterPractise {
	public static void main(String[] args) {
		String s;
		try {	
			FileReader fw=new FileReader("a.txt");
			BufferedReader f1=new BufferedReader(fw);
			FileWriter f=new FileWriter("abc.txt");
			BufferedWriter f2=new BufferedWriter(f);
			
			while((s=f1.readLine())!=null) {
				f.write(s);
				f2.newLine();
				f2.flush();			
				
			}
			System.out.println("file copied");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
