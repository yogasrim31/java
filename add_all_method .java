import java.util.*;
public class add_all_method 
{
public static void main(String args[])
{
	ArrayList<String> a = new ArrayList<String>();  
	  a.add("Joel");  
	  a.add("Suchithra");  
	  a.add("Pooja");  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Vijay");  
	  al.add("Chaitanya");  
	  a.addAll(al);    
	  Iterator i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
