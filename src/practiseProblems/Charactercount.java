package practiseProblems;

public class Charactercount {

	public static void main(String[] args) {
		String s="Steve Jobs";
		char[]c=s.toCharArray();
		int counter=0;
		for(char ch:c) {
			if(!Character.isWhitespace(ch)) {
				counter++;
			}
		}
		
		System.out.println("No of characters in steve jobs excluding whitespace are :"+counter);
	}
}
