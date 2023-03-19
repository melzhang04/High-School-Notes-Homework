
/**
 * Write a description of class StringRipper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringRipper
{
    public static void main(String[] args)
    {
        Scanner one = new Scanner(System.in);
        System.out.println("Please enter in a word:");
        String s1 = one.next();
        System.out.println("Your word is: " + s1);
        System.out.println("Please choose two numbers to decide your substring:");
        int a = one.nextInt();
        int b = one.nextInt();
        if (b>s1.length())
        {
            System.out.println("Please choose a smaller second number, \nas this is out of bounds and will return an error!");
            int c = one.nextInt();
            System.out.println("Your substring is: " + s1.substring(a, c));
        }
        else 
        {
            System.out.println("Your substring is: " + s1.substring(a, b));
        }
}
}