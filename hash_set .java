import java.util.*;
public class hash_set 
{
public static void main(String args[])
{
	HashSet<String> a = new HashSet<String>();  
	  a.add("Shahid Kapoor");  
	  a.add("Sharukh Khan");  
	  a.add("Shahid Kapoor");  
	  a.add("Ranbir Kapoor");
	  Iterator<String> i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
