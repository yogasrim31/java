package yogaa;

public class java97 {
int rollno;
String name;
String city;

java97(int rollno,String name,String city)
{
	this.rollno=rollno;
	this.name=name;
	this.city=city;
}
public static void main(String  args[]) {
	java97 s1=new java97(101,"yoga","banglore");
	java97 s2=new java97(102,"sri","banglore");
	System.out.println(s1);
	System.out.println(s2);
	
}
}
