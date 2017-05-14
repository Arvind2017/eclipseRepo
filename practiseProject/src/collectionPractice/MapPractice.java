package collectionPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapPractice {
	
	public static void main(String agr[]){
		System.out.println("Hi This is done");
		
				
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Pranya");  
		  hm.put(101,"Arvind");  
		  hm.put(102,"Kiran");  
		  /*for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } */ 
		  Iterator itr=hm.entrySet().iterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
			  hm.put(103,"ak");
		  }
		  
		 for(String aa: hm.values())
		  {
			  System.out.println(aa);
		  }
		 for(Integer aa: hm.keySet())
		  {
			  System.out.println(hm.get(aa));
		  }
	}

}
