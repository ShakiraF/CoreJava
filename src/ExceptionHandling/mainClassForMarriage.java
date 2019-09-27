package ExceptionHandling;

import java.util.Scanner;

public class mainClassForMarriage {

	public static void main(String[] args) throws NotEligibleToMarry {

		System.out.println("Welcome marriage Baerue");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter gender ");
		char gender=sc.next().charAt(0);
		System.out.println("Please enter age");
		int age=sc.nextInt();


		if(gender=='m' && age >=21)
		{
			System.out.println("Malewith age 21 and above Eligible for  Marriage");

		}
		else if (gender=='f' && age>=18 )
		{
			System.out.println("Feamle with age 18 and above are eligible to maariage");
		}

		else
		{
			try 
			{
				throw new NotEligibleToMarry();
			}
			catch (NotEligibleToMarry e) {
				System.out.println("Reason for exception="+e.getMessage());
				// TODO: handle exception
			}
		}
	}

}
