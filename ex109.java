
import java.util.Scanner;
public class ex109{

 
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n, i, k=1;
System.out.println("Enter the number of coins: ");
n = in.nextInt();
in.close();
while (true) {
for (i=1; i<=k; i++) {
System.out.print("$");
}
n = n - k;
k++;
System.out.println();
if (n < k) {
break;
}
}
}
}