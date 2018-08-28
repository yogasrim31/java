package yogaa;
import java.util.regex.*;
public class java105 {
public static void main(String args[]) {
	System.out.println("by characters  and qualifier");
	System.out.println(Pattern.matches("[789]{1}[0-9]","9953038949 "));
	System.out.println(Pattern.matches("[789][0-9]{9}","9953038949 "));
	System.out.println(Pattern.matches(" [789][0-9]{9}"," 995303389490 "));
	System.out.println(Pattern.matches("[789][0-9]{9 }"," 6953038949 "));
	System.out.println(Pattern.matches(" [789][0-9]{9}","8853038949"));
	System.out.println (" by metacharaters....");
	System.out.println(Pattern.matches("[789]\\d {9 }","8853038949   "));
	System.out.println(Pattern.matches("[789] \\d{9 }","  3853038949 "));
}
}
