package String;

public class OccOfACharInStr {
	
	public static void main(String[] args) {
		
		String str="Shakira Fathima";
		str=str.toLowerCase();
		String ch="s";		
		int count=str.length()-str.replace("s", "").length();
		System.out.println("No of occurence of Character "+ch+" is " +count);
		
		System.out.println("=========Using other method========");
		char ch1='a';
		int count1=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch1)
			{
				count1++;
			}
		}System.out.println("No of occurence of Character "+ch1+" is " +count1);
	}

}
