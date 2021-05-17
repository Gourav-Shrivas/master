package practiseProblems;

import java.util.StringTokenizer;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String str="      Try    to    remove   extra   spaces       ";
//		StringTokenizer substr=new StringTokenizer(s, " ");
//		StringBuffer sb= new StringBuffer();
//		
//		while(substr.hasMoreElements()) {
//			sb.append(substr.nextElement()).append(" ");
//		}
//		
//		System.out.println("Actual String: "+s);
//		System.out.println("Processed String: "+sb.toString().trim());
		
		//Alternate method
		System.out.println("Alternate method for removing extra spaces is: ");
		System.out.println(str.replaceAll("\\s+", " ").trim());
		
		
		//to remove all the spaces
		String nospacestr=str.replaceAll("\\s+", "");
		System.out.println("to remove all the whitespaces");
		System.out.println(nospacestr);
	}
}
