package scripts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapIterator {
public static void main(String[] args) {
	Map<String,String> list=new HashMap<String,String>();
	list.put("GFG", "geeksforgeeks.org"); 
	list.put("Practice", "practice.geeksforgeeks.org"); 
	list.put("Code", "code.geeksforgeeks.org"); 
     list.put("Quiz", "quiz.geeksforgeeks.org");
     
     Iterator<Map.Entry<String, String>> itr=list.entrySet().iterator();
     while(itr.hasNext()) {
    	 Map.Entry<String, String> entry= itr.next();
    	 System.out.println("Key = " + entry.getKey() +  
                 ", Value = " + entry.getValue());
     }
}
}
