import java.util.*;
public class remove_all_method 
{
public static void main(String args[])
{
	ArrayList<String> a = new ArrayList<String>();  
	  a.add("Nithya");  
	  a.add("Anuppama");  
	  a.add("Keerthi");  
	  ArrayList<String> al = new ArrayList<String>();  
	  al.add("Samantha");  
	  al.add("Nayanthara");  
	  a.removeAll(al);  
	  System.out.println("Iterating the elements after removing the elements of al");  
	  Iterator i=a.iterator();  
	  while(i.hasNext())
	  {  
	   System.out.println(i.next());  
	  }  
}
}
