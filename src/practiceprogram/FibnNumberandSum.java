package practiceprogram;

public class FibnNumberandSum {

	public static void main(String[] args) {
		
		
		int a=0;
		int b=1;
		
		int count=2;
		
		int sum=a+b;
		
		int d;
		
		System.out.print(a+" "+b);
		
		int sumofseries=a+b;
		
		while(count<25)
			
		{
			System.out.print(" "+sum);
			
			a=b;
			b=sum;
			sum=a+b;
			count=count+1;
			sumofseries=sumofseries+sum;
			
			
		}
		
		System.out.println();
		
		System.out.println("total sum of series is = "+ sumofseries);

	}

}
