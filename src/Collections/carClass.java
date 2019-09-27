package Collections;

public class carClass {

	String cName;
	String cModel;
	int cYearOfProd;
	
	public carClass(String cName, String cModel, int cYearOfProd) {
		
		this.cName = cName;
		this.cModel = cModel;
		this.cYearOfProd = cYearOfProd;
		
		}
	
	@Override
	public String toString() {
	
		return "Car Name:"+cName+"  Car Model:"+cModel+ "  Car Year of Prod:"+cYearOfProd;
	}
	
}
