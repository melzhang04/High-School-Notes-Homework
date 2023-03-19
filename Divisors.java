
/**
 * Write a description of class Divisors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Divisors
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Please enter in a whole number: ");
       int n = s.nextInt();
       int div = 1;
       System.out.println( n + " has divisors ");
       while (div < n)
       {
           if (n%div == 0)
           {
               System.out.print(div + " ");
           }
           div++;
       }
   }
}
