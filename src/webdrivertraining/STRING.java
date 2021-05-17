package webdrivertraining;

public class STRING {
public static void main(String[] args) {
	
// StringBuilder sb=new StringBuilder("Hello ");  
// sb.append("Java");//now original string is changed  
// System.out.println(sb);//prints Hello Java  
 
// String s1=new String("Hello");
// s1.concat("Java");
// System.out.println(s1);// prints Hello
 
 String s1="Sachin";  
 String s2="Sachin";  
 String s3="Rachit";  
 System.out.println(s1.compareTo(s2));//0  
 System.out.println(s1.compareTo(s3));//1(because s1>s3)  
 System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
}
}
