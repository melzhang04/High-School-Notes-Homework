
/**
 * Write a description of class TriangleLetters3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TriangleLetters3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the amount of rows you want:");
        int n = s.nextInt();
        System.out.println("Please enter the letter you want:");
        String x = s.next();
        for(int i = n; i > 0; i--)
        {
            for(int i2 = i-1; i2 > 0; i2--)
            {
                System.out.print(" ");
            }
            for(int i3 = 0; i3 <= n-i; i3++)
            {
                System.out.print(x);
            }
            System.out.print("\n");
        }
    }
}
