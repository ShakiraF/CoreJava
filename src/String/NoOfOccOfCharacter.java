package String;

import java.util.Arrays;
import java.util.HashMap;

public class NoOfOccOfCharacter {
	public static void main(String[] args) {
		
		String str="Shakira shakira";
		int len=str.length();
		char[] newArr=str.toCharArray();
		
		System.out.println(Arrays.toString(newArr));
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		for(Character ch:newArr)
			
		{ch=ch.toLowerCase(ch);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
				
		}
		System.out.println("Character : Occurence");
		System.out.println(hm);
		
	}

}
