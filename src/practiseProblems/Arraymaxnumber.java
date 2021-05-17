package practiseProblems;

public class Arraymaxnumber {
public static void main(String[] args) {
	int array[]={1,2,3,2,67,45,33,100,101};
	int max=array[0];
	
	for(int i=0; i<array.length; i++) {
		if(array[i]>max) {
			max=array[i];
		}
		
	}
	System.out.println(max);
}
}
