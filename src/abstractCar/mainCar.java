package abstractCar;
import java.util.Scanner;

public class mainCar {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the world of Caarss");
		System.out.println("------------------------------");
		System.out.println("1.Audi\n2.BMW\n3.Tata\n4.Exit");
		
		System.out.println("Enter your choice of car");
		Scanner sc=new Scanner(System.in);
		
		int choice=sc.nextInt();
		
		
		switch (choice)
		{
			case 1: Audi a=new Audi();
					a.carPrice();
					a.carYearOfManufacture();
					break;
			case 2: BMW b=new BMW();
					b.carPrice();
					b.carYearOfManufacture();
					break;
			case 3 :TATA t=new TATA();
				t.carPrice();
				t.carYearOfManufacture();
				break;
			case 4 : System.exit(0);
			
			default : System.out.println("Invalid choice");					
		}
		
		System.out.println("------------------------------");
				
				

	}

}
