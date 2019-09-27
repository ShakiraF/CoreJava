package String;

public class StringsAreImmutable {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Java";
		System.out.println(s1);
		 s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
//		System.out.println(s3);
		
	}
}
