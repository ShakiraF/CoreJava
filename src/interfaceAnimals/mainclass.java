package interfaceAnimals;

import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		
		Animals a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to animal planets");
		System.out.println("1.Dod\n2.Cat\n3.Lion\n4.Exit");
		while(true)
		{
		System.out.println("Please enter your choice");
		int choice=sc.nextInt();
		
		switch (choice) {
		case 1: a=new Dog();
			a.sound();
			break;
		case 2: a=new Cat();
				a.sound();
				break;
		case 3: a=new Lion();
				a.sound();
				break;
		case 4: System.exit(0);
		

		default:System.out.println("invalid choice");
			
		}
		
	}
}

}
