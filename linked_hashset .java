import java.util.*;
public class linked_hashset 
{
public static void main(String args[])
{
	  LinkedHashSet<String> a = new LinkedHashSet<String>();  
	  a.add("Anushka Sharma");  
	  a.add("Deepika Padukone");  
	  a.add("Anushka Sharma");
	  a.add("Priyanka Chopra");
	//  a.add("Ashwini");  
	  Iterator<String> i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
