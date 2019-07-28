package webdrivertraining;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
public static void main(String[] args) throws IOException {
	
	String content= "this is the content to be written in the file";
	String s1="class";
	String s2="name";
	
	
	
	try {
		FileWriter fw=new FileWriter("b.txt");
		BufferedWriter writer=new BufferedWriter(fw);
		writer.write(content);
		writer.newLine();
		writer.write(s1);
		writer.newLine();
		writer.write(s2);
		writer.flush();
		
		System.out.println(fw);
		 
		 
		 
		 	}
	catch(IOException e) {
		e.printStackTrace();
	}
	


}
}
