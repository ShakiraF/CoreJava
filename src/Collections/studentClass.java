package Collections;

public class studentClass {
	
	int sId;
	String sName;
	double sMarks;
	
	public studentClass(int sId, String sName, double sMarks) {
		
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}
	
	@Override
	public String toString() {

		return  "Studens Id:"+sId+"  Student name:"+sName+"  Student Marks:" +sMarks;
	}
	
	
	

}
