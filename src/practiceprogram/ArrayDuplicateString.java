package practiceprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayDuplicateString {

	public static void main(String[] args) {
		
        String ar[]={"java","jay","ram","site","ram"};
		
		
		/*
		int l=ar.length;
		
		for(int i=0;i<=l-1;i++)
		{
			for(int j=i+1;j<=l-1;j++)
			{
				if(ar[j].equals(ar[i]))
				{
					System.out.println(ar[i]+" is duplicate String");
				}
			}
		}*/
        
        
        /*Set<String> a=new HashSet<String>();
        
        for(String str:ar)
        {
        	if(a.add(str)==false)
        	{
        		System.out.println("duplicate element is ;"+str);
        	}
        }*/
		
        Map<String,Integer> str=new HashMap<String,Integer>();
        
       for(String name:ar)
       {   
    	 Integer count=  str.get(name);
    	 
    	 if(count==null)
    	 {
    		 str.put(name, 1);
    	 }
    	 else if(count>1)
    	 {
    		 str.put(name, ++count);
    	 }
	}

}
}
