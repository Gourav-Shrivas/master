package practiseProblems;

public class DuplicateCharacters {
public static void main(String[] args) {
	int count=0;
	String s="geeks for geeks";
	char[] c=s.toCharArray();
	for(int i=0; i<s.length(); i++) {
		count=1;
		for(int j=i+1; j<s.length(); j++) {
			if(c[i]==c[j] && c[i]!=' ') {
				count++;
				c[j]='0';
			}
				
			}
		if(count>1 && c[i]!='0') {
			System.out.println(c[i]);
		}
		}
		
	}
}
	
	

