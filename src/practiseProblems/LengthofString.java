package practiseProblems;

public class LengthofString {

	public static void main(String[] args) {
		String s="I love my India";
		int count=0;
		char[] array=s.toCharArray();
		for(char c: array) {
			count++;
		}
		
		System.out.println("Lenth of the given String is: "+count);
	}
}
