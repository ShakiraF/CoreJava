package Collections;

import java.util.ArrayList;

public class mainClass {
	
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		 a1.add(new studentClass(11, "Samauel", 95.6));
		 a1.add(new studentClass(22, "Krishna", 55.6));
		 a1.add(new studentClass(33, "Rahul", 87.5));
		 a1.add(new studentClass(44, "Samaira", 66.8));
		 a1.add(new studentClass(55, "Sakshi", 77.9));
		 
		 a1.add(new carClass("Skoda", "Rapid", 2005));
		 a1.add(new carClass("Maruthi", "Ertiga", 2012));
		 a1.add(new carClass("MaruthiSuzuki", "Wagonr", 2006));
		 a1.add(new carClass("Honda", "City", 2002));
		 a1.add(new carClass("Honda", "Amaze", 2015));
		 a1.add(new carClass("Skoda", "Octavia", 2018));
		 
		 for(int i=0;i<a1.size();i++)
		 {
			 Object obj=a1.get(i);
			 
			 if(obj instanceof studentClass)
			 {
				 studentClass s=(studentClass)obj;
				 
				 if(s.sName.startsWith("S"))
				 {
					 System.out.println(s);
					 System.out.println("Name starts with S :"+s.sName);
				 }
				 					
					 
			 }
			 else if(obj instanceof carClass)
			 {
				 carClass c= (carClass)obj;
				 if(c.cYearOfProd>2010)
					
				 {
					 System.out.println(c);
					 System.out.println("year of Production is :"+c.cYearOfProd);
				 }
				 
				 }
			 }
		 }
		 
		
	}


