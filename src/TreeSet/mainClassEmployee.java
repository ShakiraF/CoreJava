package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class mainClassEmployee 
{

	public static void main(String[] args)
	{
		TreeSet t1=new TreeSet();
		
		t1.add(new Employee(1,"singa",20000));
		t1.add(new Employee(12,"pinga",25000));
		t1.add(new Employee(9,"tinga",10000));
		t1.add(new Employee(8,"binga",30000));
		t1.add(new Employee(17,"minga",12000));
		t1.add(new Employee(13,"ninga",13000));
		
		
		System.out.println(t1);
		
		Iterator itr=t1.iterator();
		Iterator itr1=t1.iterator();
	while(itr.hasNext())
		{			
			Object obj=itr.next();
			Employee e= (Employee)obj;
		System.out.println(e);			
			
			}
	System.out.println("-------------------");
	while(itr1.hasNext())
	{			
		Object obj=itr1.next();
		Employee e= (Employee)obj;
	if(e.sal>=20000)
	{
		System.out.println(e.name+" has salary more than 20k which is :"+e.sal);
	}
	}
}
}
