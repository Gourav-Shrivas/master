package practiseProblems;

public class RemoveSpaces {

	public static void main(String[] args) {
		String s="https: //w ww.a ma zon.co m/A dva nce d-S ele niu m-W eb- Acc ess ibi lit y-T est ing /dp /19 494 49432/";
//		String s1=s.replace(" ", "");
//		System.out.println(s.replace(" ", ""));
		System.out.println(s.replaceAll("\\s+", ""));
		
	}
}
