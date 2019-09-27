package PracticePrograms;

public class FibonacciSeries {

	public static void main(String args[]) {
		int a = 0, b = 1, c, i, count = 10;
		// To print 0 and 1
		System.out.print(a + " " + b);
		// loop starts from 2. We have already printed 0 and 1 in the previous step
		for (i = 2; i < count; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		System.out.println();
		StringBuffer s=new StringBuffer("Fathima ");
		s.append("Shakira");
		System.out.println(s);
		String s1="Mercedece";
		StringBuilder s2=new StringBuilder(s1);
		s2.deleteCharAt(1);
		s1=s2.toString();
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s.reverse());
	}
}