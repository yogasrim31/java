package yogaa;
import java.util.regex.*;
public class java104 {
	public  static void main(String args[]) {
		System.out.println("metacharacters d..");
		System.out.println(Pattern.matches("\\d","abc"));
		System.out.println(Pattern.matches("\\d","1"));
		System.out.println(Pattern.matches("\\d","4443"));
		System.out.println(Pattern.matches("\\d","323abc"));
		System.out.println("metacharacters D..");	
		System.out.println(Pattern.matches("\\D","abc"));
		System.out.println(Pattern.matches("\\D","1"));
		System.out.println(Pattern.matches("\\D","4443"));
		System.out.println(Pattern.matches("\\D","323abc"));
		System.out.println(Pattern.matches("[amn]?","m"));
		System.out.println("metacharacters D with qualifier...");
		System.out.println(Pattern.matches("\\D*","mak"));
		}

}
