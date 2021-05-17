package scripts;

public class StringSplit {
	public static void main(String[] args) {
		
		String s="‭ my mom is my world ";
		
//		System.out.println(s.contains("my mom is"));
		
		String[] array=s.split("\\s+");
		
		for(String s1: array) {
			System.out.println(s1);
		}
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		String str = "1@2"; 
//        String[] arrOfStr = str.split("@", 2); 
//  
//        for (String a : arrOfStr) 
//            System.out.println(a);
		}
		
	}



	
	

