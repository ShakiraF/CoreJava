package String;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str="MamaMa";
		int len=str.length();
		
		String[] revStr=new String[len]	;
		String revString=null;
		int k=0;
		for(int i=len-1;i>=0;i--,k++) {
//			System.out.print(" " +str.charAt(i));
			revString=revString+String.valueOf(str.charAt(i));
			
//			revStr[k]=String.valueOf(str.charAt(i));
		}revString=revString.replaceAll("null", "");
			System.out.println(revString);
			if(str.equals(revString))
			{
				System.out.println("Palindronme");
			}else {
				System.out.println("Not palindrome");
			}
//		System.out.println(Arrays.toString(revStr));
		
		
		
	}
}
