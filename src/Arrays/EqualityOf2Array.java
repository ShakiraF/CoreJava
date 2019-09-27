package Arrays;
import java.util.Arrays;

public class EqualityOf2Array {
	public static void main(String[] args) {
		int[] Array1= {1,2,8,9,45,76};
		int[] Array2= {1,2,8,9,45,76,78};
		boolean flag=true;

		if(Array1.length==Array2.length) 
		{
			for(int i=0;i<Array1.length;i++)
			{
				if(Array1[i]!=Array2[i])
				{
					flag=false;
				}


			}
		}else {
			flag=false;

		}
		System.out.println("Input Arrays are:");
		System.out.println("First Array: "+Arrays.toString(Array1));
		System.out.println("Second Array: "+Arrays.toString(Array2));
		
		if(flag) {
			System.out.println("Both array are equal");
		}else {
			System.out.println("Both array are not equal");
		}
	}

}
