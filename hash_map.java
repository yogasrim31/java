import java.util.*;
public class hash_map 
{
public static void main(String args[])
{
	  HashMap<Integer,String> h = new HashMap<Integer,String>();  
	  h.put(225,"Sai");
	  h.put(248,"Anushka");
	  h.put(201,"Divya");  
	  h.put(252,"Pavithra");
	  h.put(207,"Nikitha");  
	  for(Map.Entry mp:h.entrySet())
	  {  
	   System.out.println("\nId: "+mp.getKey());
	   System.out.println("Name : "+mp.getValue());  
	  }  
}
}
