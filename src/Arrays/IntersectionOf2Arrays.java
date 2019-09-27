package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {

		//		String[] arr1= {"Syed","Kashaf","Shakira","Sabah","Kashaf"};
		String[] arr1= {"0","1","2","3"};
		String[] arr2= {"1","3","2","4","5"};

		//		String[] arr2= {"lulu","Syed","Kashaf","Sabah","Zaiba","Kashaf"};
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				{
					hs.add(arr1[i]);
				}
			}
		}
		System.out.println("Array 1 is :"+Arrays.toString(arr1));
		System.out.println("Array 2 is :"+Arrays.toString(arr2));
		System.out.println("Intersection of arr1 and arr2 is: "+hs);
		
		System.out.println("==========Using Collection===========");
		HashSet<String> h1=new HashSet<String>(Arrays.asList(arr1));
		HashSet<String> h2=new HashSet<String>(Arrays.asList(arr2));
		h1.retainAll(h2);
		System.out.println("Common Elements are :"+h1);
			}
}
