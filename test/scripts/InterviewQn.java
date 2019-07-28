package scripts;

public class InterviewQn {
	
	public void addition(int a,int b) {
		System.out.println("int");
	}
	public void addition(double a,double b) {
		System.out.println("double");
	}
	
	public static void main(String[] args) {
		InterviewQn obk=new InterviewQn();
		obk.addition(10, 10);
	}
}
