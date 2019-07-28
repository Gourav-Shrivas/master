package scripts;

import org.yaml.snakeyaml.serializer.Serializer;

public class UncheckedException {
	public static void main(String[] args) {
		try {
			String c=null;
			int a=10;
			int b=0;
			c.length();
			int result=a/b;
				
		}
		catch(Throwable e) {
			System.out.println(e);
		}
		System.out.println("hello");
		
	}

}
