package notepad;

public class Simpleprogram {
	public static void main(String[] args) {
		String s="seleniumJAVA eretWEQWDESjhjhjh";
		char array[]=s.toCharArray();
		int counter=0;
		for(char c : array) {
			if(Character.isLowerCase(c)) {
				counter++;
			}
		}
		
		System.out.println(counter);
		
	}
	
	

}
