package practiseProblems;

public class ConcatStrings {
	public static void main(String args[]) {
		String s1=new String("Can i get my coffee soon please!.");
		String s2=new String("Yes Sure Sir, will get your coffee in 5 minutes");
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		
		
		String a="meow";
		String c="deal";
		
		String ab="meowdeal";
		System.out.println(ab);
		String abc=a+c;
		System.out.println(ab==abc);
	}

	
	
	
}
