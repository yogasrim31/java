public class student4
{int id;
String name;
student4(int i,String n)
{
    id=i;
    name=n;
}
void display()
{
    System.out.println(id+""+name);
    
}
public static void main(String  args[])
{
    student4 s1=new student4(111,"yoga");
    student4 s2=new student4(112,"sri");
    
    s1.display();
    s2.display();
}
}