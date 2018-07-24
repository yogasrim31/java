import java.util.Scanner;

public class ex42 {

public static Scanner scan = new Scanner(System.in);
public static String password1, password2, temp;
public static boolean yes = false;

public static void main(String[] args){
while(yes == false) {
System.out.println("Input your password");
password1 = scan.nextLine();
System.out.println("Confirm your password");
password2 = scan.nextLine();

if (password1.equals(password2)) {
System.out.println("want to see your password? type y and enter to view, any character and enter to not display");
if (scan.hasNext("y")) {
yes = true;
System.out.println(password1);
} else {
yes = true;
System.out.println("thanks for storing your password");
}
} else {
System.out.println("passwords do not match. Please retry entry\n");
}
}
}
}