import java.util.*;
public class user_array_list 
{
public static void main(String args[])
{
	employee emp1 = new employee(157, "Suganya", "Project Manager");
	employee emp2 = new employee(128, "Fardheen", "Accountant");
	employee emp3 = new employee(143, "Lakshmi", "Team Leader");
	ArrayList<employee> a = new ArrayList<employee>();
	a.add(emp1);
	a.add(emp2);
	a.add(emp3);
	Iterator i = a.iterator();
	while(i.hasNext())
	{
		employee e = (employee)i.next();
		//System.out.println("\nID : " + e.id);
		//System.out.println("Name : " + e.name);
		//System.out.println("Designation : " + e.designation);
		System.out.println(e.id+" "+e.name+" "+e.designation);
	}
}
}
class employee
{
	int id;
	String name;
	String designation;
	employee(int id, String name, String designation)
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
}
