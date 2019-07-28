package webdrivertraining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
public static void main(String[] args) throws FileNotFoundException{
	FileReader f = new FileReader("a.txt");
	String s;
		
	BufferedReader reader = new BufferedReader(f);
	
	
	try {
		while((s=reader.readLine())!=null)
			System.out.println(s);
	}
	catch(Exception e) {
	e.printStackTrace();
		 }
	
	
}}

