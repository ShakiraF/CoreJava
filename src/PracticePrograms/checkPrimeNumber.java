package PracticePrograms;

public class checkPrimeNumber {

	public static void main(String[] args) {
		int count=0;
		
		for(int j=0;j<=20;j++)
		{
			boolean isPrime = true;

			if(j==0|j==1)
			{
				System.out.println(j+" is prime number");
				isPrime=true;
			} 
			else	
				for(int i=2;i<= Math.sqrt(j);i++) 
				{

					if(j%i==0)
					{
						isPrime=false;
						break;
					}

				}

			if(isPrime) {
				System.out.println(j+" : is prime Number");
				count=count+1;
			}
			else {
				System.out.println(j+" :is not a prime Number");
			}
		}System.out.println("Number of primenumbers from 0 to 1000 is :"+count);
		
		System.out.println(Math.sqrt(19));
	}	
	
	}
