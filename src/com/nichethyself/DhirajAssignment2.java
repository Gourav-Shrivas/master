package com.nichethyself;

import java.util.HashMap;
import java.util.Map;

public class DhirajAssignment2 {

	public static void main(String[] args) {
		String name="geeksforgeeks";
		String[]Name=name.split("");
HashMap<String,Integer> hm=new HashMap<>();
for(String c:Name) {
	if(hm.get(c)==null) {
		hm.put(c, 1);
	}
	else {
		hm.put(c, hm.get(c)+1);
	}
}

for(Map.Entry entry:hm.entrySet()) {
	System.out.println(entry.getKey()+ " " +entry.getValue());
}
	}

}
