package practiseProblems;

import java.util.Arrays;

public class SplitString {

	public static void main(String[]args) {
		String s1="java string split method by javatpoint   fgff"; 
		
		String[] array=s1.split("\\s+");
	
//		
//		System.out.println(Arrays.toString(array));
	//------------------------------------------------------------------------
		for(String y:array) {
			System.out.println(y);
		}
		System.out.println(Arrays.toString(array));
		String s2="welcome to split world";  
		
		System.out.println("returning words:"); 
		
		for(String w:s2.split("\\s+",0)){  
			
		System.out.println(w);  
		}  
//		
		System.out.println("returning words:");  
		
		for(String w:s2.split("\\s+",1)){  
			
		System.out.println(w);  
		}  
//		
		System.out.println("returning words:");  
		
		for(String w:s2.split("\\s+",2)){  
			
		System.out.println(w);  
//		}
	}
}
}
