package yogaa;

public class java98 {
int rollno;
String name;
String city;
java98(int rollno,String name,String city){
	this.rollno=rollno;
	this.name=name;
	this.city=city;
}
public String toString() {
return rollno +""+ name +"" +city;
}
public static void main(String args[]) {
	java98 s1=new java98(101,"yoga","madurai \n");
	java98 s2=new java98(102,"sri","madurai");
	
	System.out.print(s1);
	System.out.print(s2);
}
}
