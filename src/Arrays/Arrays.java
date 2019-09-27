package Arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		int[] intArray=new int[10];
		int[] newArray=new int[intArray.length];
		int key,sum=0,avg=0,product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Key value");
		key=sc.nextInt();

		Boolean flag=false;

		for(int i =0;i<10;i++)
		{
			intArray[i]=i;
		}

		System.out.print("Array elements are : ");
		for(int i =0;i<10;i++)
		{
			System.out.print(" "+intArray[i]);
		}
		System.out.println();

		//Array in reverse order
		System.out.print("Array in reverse order :");

		for(int i=(intArray.length-1);i>=0;i--)
		{
			System.out.print(" " +intArray[i]);
		}
		System.out.println();
		System.out.println("===============================");	

		//Key value search
		for(int i=0;i<intArray.length;i++)
		{
			if(intArray[i]==key) {
				flag=true;			
				break;
			}
		}

		if(flag) {
			System.out.println("Key Value found :"+key);	
		}else {
			System.out.println("Key Value not found  "+key);
		}

		//Print even numbers
		System.out.print("Even elemets in the array :");
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]%2==0) {
				System.out.print(" "+intArray[i]);
			}
		}
		System.out.println();
		//Print Odd numbers
		System.out.print("Odd elemets in the array :");
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]%2!=0) {
				System.out.print(" "+intArray[i]);
			}
		}
		System.out.println();
		//Copy one array to amother array
		for(int i=0;i<intArray.length;i++) {
			newArray[i]=intArray[i];
		}
		System.out.println("First Array : New Array");
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]+"  :  "+newArray[i]);
		}
		
		//Sum of array elements
		for(int i=0;i<intArray.length;i++) {
			sum=sum+intArray[i];
			
		}
		for(int i=1;i<intArray.length;i++) {
			
			product=product*intArray[i];
		}
		
		System.out.println("Sum of array elements is :"+sum);
		System.out.println("Average of array elements is: "+sum/intArray.length);
		System.out.println("Product of array elements is "+product);
			
	}	

}
