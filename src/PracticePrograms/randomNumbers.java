package PracticePrograms;

import java.util.Random;

public class randomNumbers {
	
	public static void main(String[] args) {
		
		Random ran=new Random();
//		for(int i=1;i<=2;i++) {
			System.out.println(ran.nextInt(1000));
//			System.out.println(ran.doubles());
			System.out.println(Math.random());
			int n = Math.addExact(10, 20);
			System.out.println(n);
			System.out.println(Math.ceil(10.01));
		System.out.println(Math.round(10.6));
		System.out.println(Math.floor(16.1));
System.out.println(Math.nextDown(10.23));	
	}
	
}
