package practiseProblems;

public class InvertString {
	public static  String invertString(String original) {
		String invert="";
		int length=original.length();
		for(int i=length-1; i>=0; i--) {
			invert=invert+original.charAt(i);
		}
		
		return invert;
	}
	
	public static String invertwithStringBuffer(String s) {
		StringBuffer buffer=new StringBuffer(s);
		buffer.reverse();
	 return buffer.toString();
		
	}

	public static void main(String[] args) {
		String s1="manchesterunited@#$%";
		System.out.println(invertString(s1));
		System.out.println(invertwithStringBuffer(s1));
	}
	
	
}
