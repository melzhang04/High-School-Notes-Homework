
/**
 * Write a description of class factorialLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class factorialLoop
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in a whole number:");
        long n = s.nextInt();
        long f = 1;
        System.out.print("The factorial of " + n + " is ");
        for(long i = n; i > 1; i--)
        {
            System.out.print(i + "x");
        }
        System.out.print("1");
        for(long i = n; i > 0; i--)
        {
            f = f*i;
        }
        System.out.println(" = " + f);
    }
}
