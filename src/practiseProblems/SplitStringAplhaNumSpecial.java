package practiseProblems;

public class SplitStringAplhaNumSpecial {

	 static void splitString(String str)
    {
        StringBuilder alpha = new StringBuilder();
        StringBuilder  num = new StringBuilder();
        StringBuilder special = new StringBuilder();
          
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
       
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }
      
    // Driver method
    public static void main(String args[])
    {
        String str = "geeks01$$for02geeks03!@!!";
        splitString(str);
    }
}
