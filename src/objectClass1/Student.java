package objectClass1;

public class Student {
	int id;
	String name;
	double marks;
	
	Student(int id, String name, double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.marks;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return this.id==s.id && this.marks==s.marks;
		
	}
	
	
	
	

}
