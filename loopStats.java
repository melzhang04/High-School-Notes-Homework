
/**
 * Write a description of class loopStats here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class loopStats
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in a start and stop number:");
        int start = s.nextInt();
        int stop = s.nextInt();
        int sum = 0;
        int numEven = 0;
        int numOdd = 0;
        System.out.println(start + " " + stop);
        for(int i = start; i<=stop; i++)
        {
            sum= sum + i;
        }
        System.out.print("total " + sum);
        for(int i = start; i<=stop; i++)
        {
            if (i%2 ==0)
            {
                numEven++;
            }
        }
        System.out.println("\neven count " + numEven);
        for(int i = start; i<=stop; i++)
        {
            if (i%2 !=0)
            {
                numOdd++;
            }
        }
         System.out.println("odd count " + numOdd);
    }
}
