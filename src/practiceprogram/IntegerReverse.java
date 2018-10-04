package practiceprogram;

import java.util.Scanner;

public class IntegerReverse {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter number to reverse");
		
		Scanner in =new Scanner(System.in);
		
		int i=in.nextInt();
		
		int reverseInteger=0;
		
		while(i!=0)
		{
			reverseInteger=reverseInteger*10+i%10;
			
			i=i/10;
		}
		
		System.out.println("Reverse Integer is --"+reverseInteger);

	}

}
