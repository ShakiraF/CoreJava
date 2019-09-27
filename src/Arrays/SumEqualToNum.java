package Arrays;

public class SumEqualToNum {
	public static void main(String[] args) {
		int[] Array= {1,2,3,4,5,6,7,-9,70,-10};
		int sumNum=6;
		boolean flag=false;
		
		for(int i=0;i<Array.length-1;i++)
		{
			for(int j=1;j<Array.length;j++) {
				if((Array[i]+Array[j])==sumNum) {
					System.out.println("Nembers are :"+Array[i]+ " and "+Array[j]);
					flag=true;
				}
			}
		}
		if(!flag) {
			System.out.println("No pair of numbers found which will sum up to :"+sumNum);
		}
	}

}
