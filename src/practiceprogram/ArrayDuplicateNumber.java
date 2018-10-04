package practiceprogram;

public class ArrayDuplicateNumber {

	public static void main(String[] args) {
		
		
		int ar[]={10,15,25,10,15,25};
		
		int dn=ar[0];
		
		int l=ar.length;
		
		for(int i=0;i<=l-1;i++)
		{
			for(int j=i+1;j<l-1;j++)
			{
				if(ar[j]==ar[i])
				{
					System.out.println(ar[i]+" is duplicate number");
				}
			}
		}

	}

}
