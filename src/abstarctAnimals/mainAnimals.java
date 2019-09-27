package abstarctAnimals;
import java.util.Scanner;

public class mainAnimals {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Animals world");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("1.Dog\n2.Cat\n3.Lion\n4.Exit");
		while(true)
		{
		
		System.out.println("Please enter the choice of Animal");
		int choice=sc.nextInt();
		
		System.out.println("---------------------------");
		switch (choice)
		{
		case 1 : Dog d=new Dog();
				d.sound();
				Dog.m1();
				break;
				
		case 2 : Cat c=new  Cat();
				c.sound();
				break;
				
		case 3 : Lion l=new Lion();
				l.sound();
				break;
		
		case 4 : System.exit(0);
		
		default : System.out.println("Invalid choice");
		
		}
		}

	}

}
