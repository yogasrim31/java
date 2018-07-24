import java.util.*;

public class ex84 {

public static void main(String[] args) {
String a;
Scanner in = new Scanner(System.in);

System.out.println("Word:");
a = in.nextLine();
System.out.println(a.substring((a.length()-3), a.length()) + a + a.substring((a.length()-3), (a.length())));
}

}