package String;

public class SwapStrings {

	public static void main(String[] args) {
		
		String s1="Shakira";
		String s2="Fathima";
		
		System.out.println("Before Swaping s1:"+s1+" s2:"+s2);
		
		s1=s1+s2;
//		shakirafathima
		int  a=s1.length()-s2.length();
		int b=s2.length();
		System.out.println("a:"+a+" b:"+b);
		s2=s1.substring(0,a );
		s1=s1.substring(b);
		
		System.out.println("After Swaping s1:"+s1+" s2:"+s2);
	}
}
