
/**
 * Write a description of class Substring here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Substring
{
    public static void main(String[] args)
    {
        Scanner one = new Scanner(System.in);
        System.out.println("Please enter in your first and last name: ");
        String s1 = one.nextLine();
        String s2 = one.nextLine();
        System.out.println("Your first name is " + first(s1) + " and your last name is \n" + last(s2) + ".");
    }
    public static String first(String s1)
    {
        return s1.substring(0);
    }
    public static String last(String s2)
    {
        return s2.substring(0);
    }
}
