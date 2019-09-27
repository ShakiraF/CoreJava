package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashsetPgm {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Shakira");
		hs.add("Fathima");
		hs.add("Syed");
		hs.add("Kashaf");
		hs.add("kashaf");
		hs.add("fahad");
		ArrayList<String> al=new ArrayList<String>(hs);
		TreeSet<String> ts=new TreeSet<String>(hs);
		Collections.sort(al);
		System.out.println(hs);
		System.out.println(al);
		System.out.println(ts);
	}
}
