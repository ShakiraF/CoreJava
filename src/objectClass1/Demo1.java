package objectClass1;

public class Demo1 {

	int x=10;
	public static void main(String[] args) {
	Demo1 d1= new Demo1();
	Demo1 d2=new Demo1();
	Demo1 d3=d1;
	
	System.out.println(d1.toString());
	System.out.println(d2.toString());
	System.out.println(d3.toString());
	
	System.out.println("-------------");
	System.out.println(d1.hashCode());
	System.out.println(d2.hashCode());
	System.out.println(d3.hashCode());
	System.out.println("--------------");
	
	System.out.println(d1.equals(d2));
	System.out.println(d1.equals(d3));
		

	}

}
