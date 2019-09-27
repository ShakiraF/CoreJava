package Arrays;

public class MissingNumbers {
	
	public static void main(String[] args) {
		int n=8;
		int[] arr= {1,3,4,6,8,5,9};
		
		MissingNumbers m=new MissingNumbers();
		int sumOfNumbers=m.sum(n);
		int sumOfArrElements=m.sumOfArray(arr);
		System.out.println(sumOfNumbers);
		System.out.println(sumOfArrElements);
		int missNum=sumOfNumbers-sumOfArrElements;
		System.out.println("Missing number is:"+missNum);		
	}

	public int sum(int n)
	{ int sum;
		sum=n*(n+1)/2;
		return sum;
	}
	
	public int sumOfArray(int[] arr)
	{   int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
		return sum;
	}
}
