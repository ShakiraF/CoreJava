package String;

public class RotaionOfString {
	
	public static void main(String[] args) {
		
		String s1="ABCD";
		String s2="CDAB";
		boolean status=true;
		if(s1.length()!=s2.length()) {
			status=false;
		}else {
			System.out.println(s1+s1);
			status=(s1+s1).contains(s2);			
		}
		System.out.println(status);
	}
}
