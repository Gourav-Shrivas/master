package scripts;

public class LengthofString {
	
	public static void main(String[] args) {
		String s="SELENIUM//";
		int count=0;
		char[] array=s.toCharArray();
		for(char c: array) {
			count++;
		}
		
		System.out.println(count);
	}

}
