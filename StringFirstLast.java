
/**
 * Write a description of class StringFirstLast here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringFirstLast
{
    public static void main(String[] args)
    {
        Scanner one = new Scanner(System.in);
        System.out.println("Please enter in a word: ");
        String s1 = one.next();
        int last = s1.length()-1;
        System.out.println("Your word is: " + s1 + "\nand the first and last letter is " + s1.charAt(0) +  " and " +s1.substring(last));
    }
}
