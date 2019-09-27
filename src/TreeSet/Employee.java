package TreeSet;

public class Employee implements Comparable{
	
	int id;
	String name;
	double sal;
	
	public Employee(int id, String name, double sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	 @Override
	public String toString() {
		
		return this.name+"  "+this.id+"  "+this.sal;
		
	}
	@Override
	public int compareTo(Object obj) {
		Employee e=(Employee)obj;
		
		return this.name.compareTo(e.name);
	}
	 
	 

}
