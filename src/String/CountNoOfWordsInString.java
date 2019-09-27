package String;

public class CountNoOfWordsInString {
public static void main(String[] args) {
	
	String str="hello World this is Shakira  ";
	String[] words=str.split(" ");
	
	int count=words.length;
	System.out.println("No of words in str is :"+count);
}
}
