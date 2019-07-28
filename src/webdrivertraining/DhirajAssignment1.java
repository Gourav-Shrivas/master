package webdrivertraining;

import java.util.HashMap;
import java.util.Map;

public class DhirajAssignment1 {
public static void main(String[] args) {
	String name="aa bb cc aa bb cc";
	String[]strarray=name.split(" ");
	
	HashMap<String, Integer> charCountMap  = new HashMap<String, Integer>();
	for(String c: strarray) {
		if(charCountMap.get(c)==null) {
			charCountMap.put(c, 1);
		}
		else {
			charCountMap.put(c, charCountMap.get(c)+1);
			
		}
	}
	
	for(Map.Entry entry:charCountMap.entrySet()) {
		System.out.println(entry.getKey() + " " +entry.getValue());
	}
	
}
}
