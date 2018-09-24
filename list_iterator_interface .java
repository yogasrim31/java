import java.util.*;
public class list_iterator_interface 
{
public static void main(String args[])
{
	ArrayList<String> a = new ArrayList<String>();  
	a.add("Mahendar Singh Dhoni");  
	a.add("Virat Kholi");  
	a.add("Suresh Raina");  
	a.add(1,"Sachin Tendulkar");  
	System.out.println("Element at 2nd Position: "+a.get(2));
	//System.out.println("Element at 3rd Position: "+a.get(2));  
	ListIterator<String> i = a.listIterator();  
	System.out.println("Traversing the Elements in Forward Direction...");  
	while(i.hasNext())
	{  
	System.out.println(i.next());  
	 }  
	System.out.println("Traversing the Elements in Backward Direction...");  
	while(i.hasPrevious())
	{  
	System.out.println(i.previous());  
	 }  
}
}
