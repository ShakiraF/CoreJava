package String;

public class IntToStrAndViceVersa {
	
	public static void main(String[] args) {
		
		String str="2015";
		int  i=12;
//		System.out.println(Integer.parseInt(str,4));
//		System.out.println(Integer.parseInt(str, i));
		System.out.println("String to Intger:"+Integer.valueOf(str));
		String tStr=Integer.toString(i);
		System.out.println("Integer to String:"+tStr);
	}

}