package PracticePrograms;

public class stringSplit {
	
	public static void main(String[] args) {
		
		String str="Apple,Boy,Cat,Dog/Elephant_Fan,Goat";
		String str1="Welcome to java Program";
		String[] strArray=str1.split("\\s");
		for(int i=0;i<strArray.length;i++)
		{
			System.out.println(strArray[i]);
		}
	}
}
