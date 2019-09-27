package Arrays;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {

		int[] array= {4,6,8,5,9,3,2,28,9};

		int temp;
		for(int i=1;i<array.length;i++)
		{ 
			for(int j=0;j<array.length;j++)
			{
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
//				System.out.println("Iteration "+i+" :"+Arrays.toString(array));
		}
		System.out.println("After sorting :"+Arrays.toString(array));
	}
}
