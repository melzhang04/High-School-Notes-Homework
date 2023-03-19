
/**
 * Write a description of class primeNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class primeNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in an integer:");
        int n = s.nextInt();
        boolean t = false;
        for (int i = 2; i<=n/2; i++)
        {
            if (n%i == 0)
            {
                t = true;
                break;
            }
        }
        if(!t)
        {
            System.out.println(n + " is prime.");
        }
        else
        {
            System.out.println(n + " is not prime.");
        }
    }
}
