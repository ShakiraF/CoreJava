package PracticePrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormats {
	
	public static void main(String[] args) {
		
		Date date=new Date();
//		System.out.println(date);
//		System.out.println(date1);
		Date d=new Date(12,10,11);
		Date d1=new Date("12/1/2000 11:55:30");
		
//		System.out.println(d1);
//		System.out.println(d);
			
		String timeStr="hh-mm-ss-F-E-G-k_K-u-w-W";
		SimpleDateFormat s2=new SimpleDateFormat(timeStr);
		System.out.println(s2.format(date));
		String yearStr="MM:YYYY:zzz G:k:K";
//		SimpleDateFormat s1=new SimpleDateFormat(yearStr);
//		System.out.println(s1.format(d));
		String dateStr="dd/MM/yyy";
		SimpleDateFormat s=new SimpleDateFormat(dateStr);
		System.out.println(s.format(date));
		
		
	}

}





