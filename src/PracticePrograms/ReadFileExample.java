package PracticePrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileExample
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		BufferedReader objReader=null;
		try {
		String currentLine;
		objReader=new BufferedReader(new FileReader("./InputFiles/FileReader.txt"));
		
		while((currentLine=objReader.readLine())!=null) {
			System.out.println(currentLine);
		}
		}
		catch(Exception e) {
			e.getStackTrace();
			e.printStackTrace();
		}
		finally{
			try {
			if(objReader!=null) {
				objReader.close();
			}
			}catch(Exception e){
				System.out.println(e.getStackTrace());
				e.printStackTrace();
				
				
			}
		}
		
	}
	

}
