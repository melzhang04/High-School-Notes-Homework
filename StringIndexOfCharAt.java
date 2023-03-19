
/**
 * Write a description of class StringIndexOfCharAt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringIndexOfCharAt
{
    public static void main(String[] args)
    {
        Scanner one = new Scanner(System.in);
        System.out.println("Please enter in two words: ");
        String s1 = one.nextLine();
        String s2 = one.nextLine();
        String s3 = s1 + " " + s2;
        System.out.println("Your string is: " + s3);
        System.out.println(s3.toUpperCase());
        System.out.println((s1.substring(0,s1.length()) + "-" + s2.substring(0,s2.length())).toUpperCase());
        
    }
}
