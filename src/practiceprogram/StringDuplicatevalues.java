package practiceprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicatevalues {

	public static void main(String[] args) {
		
		String ar[]={"java","jay","ram","site","ram"};
		
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
	       
	 //get the values from this hashMap;
	       
	       Set<Entry<String,Integer>> entrySet = str.entrySet();
	       
           for(Entry<String,Integer> entry:entrySet)
           {
        	  
        	  
        	  if(entry.getValue()>1)
        	   {
        		  System.out.println(entry.getValue());
        		   System.out.println("Duplicate element is :: "+entry.getKey());
        	   }
           }
	}
	

	}


