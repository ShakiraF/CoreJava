package String;


public class stringMainMethods {

	public static void main(String[] args) {

		
		String s1="Hello Welcome to Jsp";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(8));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(4, 12));
		System.out.println(s1.contains("welcome"));
		System.out.println(s1.concat(" and Qsp"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace("Hello", "Hii"));
		
		//print string ,each letter next line 
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		String s2="Welcome";
		for(int i=(s2.length()-1);i>=0;i--)
		{
			System.out.print(s2.charAt(i));
			
		}
		
		String s3="A";
		String s4="Z";
		System.out.println(s3.compareTo(s4));
	}

}
