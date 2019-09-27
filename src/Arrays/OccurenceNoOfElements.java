package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class OccurenceNoOfElements {

	public static void main(String[] args) {
		//		String[] arr= {"Syed","Kashaf","Kashaf","Lulu","Shakira","Syed"};
		int[] array= {1,2,2,3,5,1,3,9};

		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		System.out.println("Initial HashMap"+hm);
		for(int i:array) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}else {
				hm.put(i,1);
			}
		}
		System.out.println("===============Using HashMaps=============");
		System.out.println("Input Array is: "+Arrays.toString(array));
		System.out.println("Element Count :"+hm);

		System.out.println("===============Using Arrays=============");
		int[] fr= new int[array.length];
		System.out.println("Frequency Array"+Arrays.toString(fr));
		int value = -1;
		for(int i=0;i<array.length-1;i++) {
			int count =1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					fr[j]=value;
				} if(fr[i]!=value)
				{
					fr[i]=count;
				}
				if(fr[array.length-1]!=value) {
				fr[array.length-1]=1;
		}
			}
		}
		System.out.println("Frequency Array is: "+Arrays.toString(fr));
		System.out.println("Input Array is: "+Arrays.toString(array));
		System.out.println("Elemnt  : Occurence");
		for(int i=0;i<fr.length;i++)
		{
		    if(fr[i] != value)  
			System.out.println(+array[i]+"    "+fr[i]);
		}
	}
}


