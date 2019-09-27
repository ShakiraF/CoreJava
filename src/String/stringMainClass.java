package String;

public class stringMainClass {

	public static void main(String[] args) {
	
		String s1="Hello";
		String s2=new String("Hello");
		String s3="hello";
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.chars());
		System.out.println(s1.charAt(3));
	

	}

} 
