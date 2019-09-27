package String;

import java.text.DecimalFormat;

public class percentageOfDiffChars {

	public static void main(String[] args) {
		String s= "Tiger Runs @ The Speed Of 100 km/hour.";
		int NumCnt=0,LCnt=0,UCnt=0,sCnt=0;

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				NumCnt=NumCnt+1;
			}else if(Character.isUpperCase(ch)) {
				UCnt=UCnt+1;			
			}else if(Character.isLowerCase(ch)) {
				LCnt=LCnt+1;
			}else {
				sCnt=sCnt+1;
			}
		}
		double u=(UCnt*100.0)/s.length();
		double l=(LCnt*100.0)/s.length();
		double d=(NumCnt*100.0)/s.length();
		double s1=(sCnt*100.0)/s.length();
		DecimalFormat dd=new DecimalFormat("##.##");
		System.out.println("No of Upercase is "+UCnt+" and % is :"+dd.format(u));
		System.out.println("Lowercase %:"+dd.format(l));
		System.out.println("Digits %:"+dd.format(d));
		System.out.println("Special Characters %:"+dd.format((sCnt*100.0)/s.length()));
		
	}
}
