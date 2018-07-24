import java.util.Scanner;
public class readint {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDig = num % 10;
        int remainingNumber = num / 10;
        int SecondDig = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDig = remainingNumber % 10;

        int sum = thirdDig + SecondDig + firstDig;

        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}