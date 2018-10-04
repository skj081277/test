package practiceprogram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Plese enter String");
		
		Scanner in =new Scanner(System.in);
		
		String s=in.next();
		
		String ReverseString="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			ReverseString=ReverseString+s.charAt(i);
		}
		
		System.out.println("Reverse String is -- = "+ReverseString);

}
	
}
