package practiseProblems;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharOccurences {

	 private static  List<String> chars = new ArrayList();

	    public static void main(String[] args) {
	        System.out.println("---------Input 1 ------");
	        printCountOfDuplicateCharacter("geeks for geeks");
	        System.out.println("---------Input 2 ------");
	        printCountOfDuplicateCharacter("can i get my coffee soon please");

	    }

	    // print count of each character in a given string.
	    private static void printCountOfDuplicateCharacter(String input) {

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (isProcessedChar(ch)) 
	                continue;
	            
	            int count = 0;
	            for (int j = 0; j < input.length(); j++) {
	                if (ch == input.charAt(j)) {
	                    count++;
	                }
	            }
	            System.out.println(ch + " : " + count);
	        }
	      
	        chars.clear();
	    }

	    // checking whether the given char is already processed or not.
	    private static boolean isProcessedChar(char ch) {

	        if (chars.contains(Character.toString(ch))) {
	            return true;
	        } else {
	            chars.add(Character.toString(ch));
	        }
	        return false;
	    }

}
