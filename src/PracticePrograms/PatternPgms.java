package PracticePrograms;

public class PatternPgms {
	public static void main(String[] args) {
		System.out.println("1===============================================");
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		System.out.println("2===============================================");
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j<=i)
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3===============================================");
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{	
				if(j>=i) {
				System.out.print("*");
			}
			}	
			System.out.println();
		}
		System.out.println("4===============================================");
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{ if((i+j)>=(4)) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		System.out.println("5===============================================");
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{ if(i<=j) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		System.out.println("6===============================================");
		int rows = 5, k = 0;
        for(int i = 1; i <= rows; ++i, k = 0) {
        	for(int space = 1; space <= (rows*2)-1; ++space) {
                System.out.print("*  ");
                while(k != 2 * i - 1) {
                    System.out.print("  ");
                    ++k;
            }
            
            }
            System.out.println();
        }
	}
	
	}



