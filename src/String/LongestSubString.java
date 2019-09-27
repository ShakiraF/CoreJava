package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {

		String InputArray="Shakiraisatechie";
		char[] chArr=InputArray.toCharArray();		
		String longestSubArray=null;int longSize=0;
		String newStr="";	Set<Character> keys = null;

		LinkedHashMap<Character, Integer> lm=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<InputArray.length();i++)
		{
			char ch=chArr[i];
			if(!lm.containsKey(ch)) {
				lm.put(ch, i);			
			}else {
				i=lm.get(ch);
				lm.clear();
				keys.clear();			
			}
			if(lm.size()>longSize) {				
				longestSubArray=lm.keySet().toString();		
				keys=lm.keySet();
//				System.out.println(ch);
				longSize=lm.size();
			}
			
		}	
		
//		for(Map.Entry entry:longestSubArray.entrySet()) {
//			newStr=newStr+entry.getKey();
//		}
		System.out.println(longestSubArray);
//		System.out.println(newStr);
//		for(Character ch1:keys) {
//			newStr=newStr+ch1;
//		}
//		newStr=newStr.replace("null", "");
//		System.out.println("Input String:"+InputArray);
//		System.out.println("Longest SubString without repition of chars : "+newStr);
//		System.out.println("Longest SubString without repition of chars : "+longestSubArray);
//		System.out.println("Lenght of sub string:"+longSize);
	}
}
