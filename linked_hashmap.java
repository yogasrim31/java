import java.util.*;
public class linked_hashmap 
{
public static void main(String args[])
{
	  LinkedHashMap<Integer,String> h = new LinkedHashMap<Integer,String>();  
	  h.put(225,"Sai"); 
	  h.put(248,"Anushka");
	  h.put(201,"Divya");  
	  h.put(252,"Pavithra");
	  h.put(207,"Nikitha");  
   	  for(Map.Entry m:h.entrySet())
   	  {  
	   System.out.println("\nID : "+m.getKey());
	   System.out.println("Name : "+m.getValue());  
	  }  
}
}
