package Arrays;

import java.util.HashSet;
import java.util.TreeSet;

public class SecondLargestInArray {

	public static void main(String[] args) {
		//		int value=0;
		int[] Array={2,18,6,9,7,11,27,25,3};
		int Largest1=0, Largest2=0;

		if(Array[0]>Array[1])
		{
			Largest1=Array[0];
			Largest2=Array[1];
		}else {
			Largest1=Array[1];
			Largest2=Array[0];
		}
		for(int i=2;i<Array.length;i++)
		{
			if(Array[i]>Largest1) {
				Largest2=Largest1;
				Largest1=Array[i];
			}else if((Array[i]>Largest2) && (Array[i]<Largest1)){

				Largest2=Array[i];				
			}
		}
		System.out.println("Input Array :");   
		for(int e:Array) {
		System.out.print(" "+e);
		}
		System.out.println();
		System.out.println("Second largest is: "+Largest2);
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
//		HashSet<Integer> ts=new HashSet<Integer>();
		for(int e:Array) {
			ts.add(e);
			
		}
		System.out.println("Size of list: "+ts.size());
		System.out.println("List is :"+ts);
//	System.out.println(ts.headSet(12));
//	System.out.println(ts.tailSet(27));
	
	System.out.println(ts.lower(ts.last()));
	System.out.println(ts.ceiling(ts.last()));
	
	
//		System.out.println("Last :"+ts.last());
		
		
		
		
	}
}

