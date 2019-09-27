package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrToArrListNViceVersa {
	
	public static void main(String[] args) {
		
		String[] arr= {"Syes","Kashaf","Sabah","Shakira","Lulu"};
		System.out.println("Input array is :"+Arrays.toString(arr));
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		System.out.println("===========Array  to ArrayList==========");
		System.out.println(al);
		
		System.out.println("===========Array List to Array==========");
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Syed");
		a1.add("Kashaf");
		a1.add("Lulu");
		a1.add("Shakira");
		a1.add("Fathima");
		a1.add("Sabah");
		a1.add("Fahad");
		System.out.println("List items are :"+a1);
		String[] newArr=new String[a1.size()];
		a1.toArray(newArr);
		for(String s:newArr)
		{
			System.out.println(s);
		}
	}

}
