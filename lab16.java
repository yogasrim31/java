public class student9
{
  int rollno;
  String name;
  static String college="rit";
  static String college()
  {
      college="rec";
      
  }
   student9(int r,String n)
   {
       rollno=r;
       name=n;
   }
void display()
{
     System.out.println(rollno+""+name+""+college);
  
}
 public static void main(String  args[])
{
student9. change();
student9 s1=new student9(111,"yoga");

student9 s2=new student9(112,"sri");
student9 s3 =new student9(113,"swetha");
s1.display();
s2.display();
s3.display();    
}

    
    
}
