import java.util.*;
public class tree_map 
{
public static void main(String args[])
{
	  TreeMap<Integer,String> h = new TreeMap<Integer,String>();  
	  h.put(175,"Priyanka Chopra");  
	  h.put(102,"Vijay Devarkonda");  
	  h.put(199,"Samantha");  
	  h.put(165,"Kajol");
	  //h.put(153,"Krishika");  
	  for(Map.Entry m:h.entrySet())
	  {  
	   System.out.println("\nID : "+m.getKey());
	   System.out.println("Name : "+m.getValue());  
	  }  
}
}
