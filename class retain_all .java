import java.util.*;
public class retain_all 
{
public static void main(String args[])
{
	ArrayList<String> a = new ArrayList<String>();  
	  a.add("Vijay Devarkonda");  
	  a.add("Naga Chaitanya");  
	  a.add("Ram Charan");  
	  ArrayList<String> al = new ArrayList<String>();  
	  al.add("Vijay Devarkonda");  
	  al.add("Mahesh Babu");  
	  a.retainAll(al);  
	  System.out.println("Iterating the elements after retaining the elements of al");  
	  Iterator i = a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  

}
}
