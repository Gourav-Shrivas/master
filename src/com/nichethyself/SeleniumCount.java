package com.nichethyself;

public class SeleniumCount {

	public static void main(String[] args) {
		int count=0;
     String S="Avactisproeeeeeepse";
     for(int i=0; i<S.length(); i++) {
    	 if(S.charAt(i)=='e') {
    		 count++;
    		 
    	 }
    	 
     }
     System.out.println("no of Es supplied in the string are "+count);

	}

}
