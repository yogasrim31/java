package com.javatpoint;  
public class Student{  
private String name;  
   
public String getName(){  
return name;  
}  
public void setName(String name){  
this.name=name  
}  
}  
//save as Test.java  
package com.javatpoint;  
class Test{  
public static void main(String[] args){  
Student s=new Student();  
s.setName("virat");  
System.out.println(s.getName());  
}  
}  
