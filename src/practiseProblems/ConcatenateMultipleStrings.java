package practiseProblems;

public class ConcatenateMultipleStrings {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
	    
		buffer.append("how")
		        .append("to")
		        .append("do")
		        .append("in")
		        .append("java")
		        .append(".")
		        .append("com");
		 
		String blogName = buffer.toString();
		 
		System.out.println(blogName);
	}
	
}
