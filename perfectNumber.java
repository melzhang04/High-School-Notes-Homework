
/**
 * Write a description of class perfectNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class perfectNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in an integer: ");
        int n = s.nextInt();
        int div = 1;
        int sum = 0;
        while (div < n)
       {
           if (n%div == 0)
           {
               sum = sum + div;
           }
           div++;
       }
       if(sum == n)
           {
               System.out.println(n + " is perfect.");
           }
           else
           {
               System.out.println(n + " is not perfect.");
           }
    }
}
