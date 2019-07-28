package webdrivertraining;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class FilehandlingAssign {
public static void main(String[] args) throws IOException {
	String s;
	
	int count=0;
	int Count=0;
	int count1 = 0;
	String word="selenium";
	//String word1="tool";
	
		try {
		FileReader reader=new FileReader("d.txt");
		LineNumberReader Reader=new LineNumberReader(reader);
		while((s=Reader.readLine())!=null) {
			System.out.println(s);
			count=count+1;
			String words[]=s.split(" ");
			Count=Count+words.length;
			for(int i = 0; i<words.length; i++) {
				if(word.equals(words[i])) {
					
					count1++;	
			}
				
				}		
		


		}
		Reader.close();
		
		
		System.out.println("Number of lines are "+count);
		System.out.println("count of words is "+Count);
		System.out.println("number of times selenium occured are "+count1);
		
		
		FileReader reader1=new FileReader("d.txt");
		LineNumberReader Reader1=new LineNumberReader(reader1);
		Scanner scan=new Scanner(System.in);
		String word1=scan.next();
		while((s=Reader1.readLine())!=null) {
			
			
		if(s.contains(word1)) {
	boolean Flag = true;
	if(Flag) {
		System.out.println(s);
			
		
		
		}
		}
		}
		Reader1.close();
		scan.close();
		}
		
		
		catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		}

}
		
