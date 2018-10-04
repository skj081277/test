package practiceprogram;

public class Fibsum {

	public static void main(String[] args) {
		
		
		int a =0;
		
		int b =1;
		
		System.out.print(a+" "+b);
		
		int c =a+b;
		
		while(c<=100)
		{
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
		}


	}

}
