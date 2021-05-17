package scripts;

public class CustomException extends Exception {

	CustomException(String msg){
		super(msg);
	}
	
	public static void main(String[] args) {
		try {
			division(10,0);
		}
		catch(CustomException e) {
			System.out.println("Exception "+e);
		}
		String str=new String("hello");
		str.concat("man");
		StringBuffer s=new StringBuffer("Hello");
		s.append("man");
	System.out.println(str);
		System.out.println(s);
	}

	private static void division(int a, int b) throws CustomException {
		
		if(b==0) 
			throw new CustomException("division is not possible");
		int c=a/b;
		
	}
}
