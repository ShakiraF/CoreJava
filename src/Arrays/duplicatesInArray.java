package Arrays;

import java.util.HashSet;

public class duplicatesInArray 
{  //Using Brute Force method
	public static void main(String[] args)
	{

		String[] Array= {"Syed","Kashaf","Shakira","Sabah","Syed","Kashaf"};	
		System.out.println("==============Using Array Brute Force===============");
		for(int i=0;i<Array.length;i++)
		{
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[i].equals(Array[j]) && (i!=j)) 
					System.out.println("Duplicate element is :"+Array[j]);
			}
		}
		System.out.println();
		System.out.println("==============Using HashSwet===============");
		HashSet<String> hs=new HashSet<String>();
		for(String arrayElement:Array) {
			if(!hs.add(arrayElement)) {
				System.out.println("Duplicate elemenys is :"+arrayElement);
			}
		}
	}
}