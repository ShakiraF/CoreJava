package Arrays;

import java.util.Arrays;

public class SubArraySumToNum {

	public static void main(String[] args) {


		int[] Array= {1,2,3,4,2,6,1,5};
		int sumNum=6;
		int start=0;
		int sum=Array[0];
		boolean flag=false;
		System.out.println("Input array is :"+Arrays.toString(Array));
		for(int i=1;i<Array.length;i++) {
			sum=sum+Array[i];	
			while(sum>sumNum && start<=i-1)
			{		
				sum=sum-Array[start];	
				start++;
			}
			if(sum==sumNum) {
				flag=true;
				System.out.print("SubSet of array is :");
				for(int k=start;k<=i;k++)
				{
					System.out.print(Array[k]+" ");

				}System.out.println();
			}

		}
		if(!flag)
		{
			System.out.println(" No sub set of array sums up to :"+sumNum);
		}
	}

}
