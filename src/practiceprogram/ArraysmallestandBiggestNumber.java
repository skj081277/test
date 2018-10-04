package practiceprogram;

import java.util.Arrays;

public class ArraysmallestandBiggestNumber {

	public static void main(String[] args) {
		
		int ar[]={23,28,38,15,24,50,43};
		
		
		int sn=ar[1];
		
		int bn=ar[0];
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]<sn)
			{
				sn=ar[i];
			}
			
			else if(ar[i]>bn)
			{
				bn=ar[i];
				
			}
		}
		
       
		System.out.println("\n given Array is : "+Arrays.toString(ar));
		System.out.println("\n Smallest number is ----- "+sn);
		System.out.println("\n Biggest number is ----- "+bn);

	}

}
