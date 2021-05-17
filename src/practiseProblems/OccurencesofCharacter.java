package practiseProblems;

public class OccurencesofCharacter {

	public static void main(String[]args) {
		String s=" Can i get my coffee soon please! ";
		
		System.out.println("no of times character whitespaces occured in word are: "+characterCount(s));
	}
	
	public static int characterCount(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
}
