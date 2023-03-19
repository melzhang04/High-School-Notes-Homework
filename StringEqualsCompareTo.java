
/**
 * Write a description of class StringEqualsCompareTo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringEqualsCompareTo
{
   public static void main (String[] args)
   {
       Scanner one = new Scanner(System.in);
       System.out.println("Please enter in two words you \nwould like to compare: ");
       String s1 = one.next();
       String s2 = one.next();
       System.out.println(compare(s1, s2));
   }
   public static String compare(String s1, String s2)
   {
       if (s1.equals(s2))
       {
           return s1 + " has the same letters as " + s2;
       }
       else
       {
           return s1 + " does not have the same letters as " + s2;
       }
   }
}
