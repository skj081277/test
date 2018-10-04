package practiceprogram;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		System.out.println("Please enter number to check if this prime number");
		
		Scanner in =new Scanner(System.in);
		
		int n=in.nextInt();
		
		int flag=0;
		
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		
		if(flag==0)
		{
			System.out.println(n+" is prime");
		}
		
		
		else
		{
			System.out.println(n+" is not a prime");
		}

	}

}
