package String;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsAndOcuurence {

	public static void main(String[] args) {
		//		String s1="Hello to Java World , Hello Java is to Programming language";
		String s1="Bread butter and bread java is java shakira bread is shakira";

		//		int iStrlen=s1.length();
		String[] words=s1.split(" ");

		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(String word:words) {
			word=word.toLowerCase();			
			if(hm.containsKey(word.toLowerCase())) {
				hm.put(word, hm.get(word)+1);
			}else {
				hm.put(word, 1);
			}
		}
		
		 for(Map.Entry entry:hm.entrySet()) {
			 System.out.println(entry.getKey()+ " : "+entry.getValue());
		 }
//		
//		Set<String> wordsInString=hm.keySet();
//		Collection<Integer> Value=hm.values();
//
//		System.out.println(wordsInString);
//		System.out.println(Value);
//		System.out.println("Words : Occurence");
//		for(String word:wordsInString) {
//			if(hm.get(word)>1) {
//				
//				System.out.println(word+": "+hm.get(word));
//			}
//		}
	}

}
