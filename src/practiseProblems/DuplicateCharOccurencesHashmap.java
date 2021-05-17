package practiseProblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharOccurencesHashmap {

	public static void main(String[] args) {
		String blogname="aa bb cccc dd e";
		char[] chars=blogname.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		int counter=0;
		for(char c:chars) {
			if(map.containsKey(c)) {
			 counter=map.get(c);
				map.put(c, ++counter);
			}
			else {
				map.put(c, 1);
				
			}
		}
		
		System.out.println("-----duplicate characters including whitespaces are-------");
		for(char c: map.keySet()) {
			if(map.get(c)>1) {
				
				System.out.println(c+" and their occurences "+map.get(c));
			}
		}
		
		System.out.println("-----duplicate characters excluding whitespaces are-------");
		for(char c:map.keySet()) {
			if(map.get(c)>1 & !Character.isWhitespace(c)) {
				
				
				System.out.println(c+" and their occurences "+map.get(c));
			}
		}
		
		System.out.println("-----distinct characters  are-------");
		for(char c: map.keySet()) {
			if(map.get(c)==1) {
				
				System.out.println(c+" and their ouccurences "+map.get(c));
				
			}
		}
		
		System.out.println("-----duplicate characters occuring two times only are-------");
		for(char c: map.keySet()) {
			if(map.get(c)==2 && !Character.isWhitespace(c)) {
				
				System.out.println(c+" and their ouccurences "+map.get(c));
				
			}
		}
		
		System.out.println("-----duplicate characters occuring four times only are-------");
		for(char c: map.keySet()) {
			if(map.get(c)==4 && !Character.isWhitespace(c)) {
				
				System.out.println(c+" and their ouccurences "+map.get(c));
				
			}
		}
	}
}

