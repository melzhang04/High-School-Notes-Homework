
/**
 * Write a description of class digitAdder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class digitAdder
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in an integer:");
        int n = s.nextInt();
        int x = n;
        int sum = 0;
        while(x > 0)
        {
            sum = sum + x%10;
            x = x/10;
        }
        System.out.println(sum + " is the sum of the digits of " + n);
    }
}
