package objectClass1;

public class mainStudentClass 
{
	public static void main(String[] args) {
		
	Student s1= new Student(111, "aaa", 12.69);
	Student s2=new Student(111, "bbb", 12.69);
	
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	
	System.out.println(s1.equals(s2));
	
	
	}
	

}
