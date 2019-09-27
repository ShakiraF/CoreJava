package String;

public class StringReplace {
	
	public static void main(String[] args) {
//		String s1="?Shakira";
//		String s2 = s1.replace("?", "Rs.");
//		System.out.println(s1.replace("?", "Rs"));
//		System.out.println(s2);
		
		StringBuilder sb=new StringBuilder("?50000");
		System.out.println(sb.deleteCharAt(0));
		
//		System.out.println(sb.append("Rs."));
		
		System.out.println("Rs."+sb);
}

}
