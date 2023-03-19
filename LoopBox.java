
/**
 * Write a description of class LoopBox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LoopBox
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the amount of *'s you want:");
        int n = s.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int i2 = 0; i2 < n-i; i2++)
            {
                System.out.print("*");
            }
            for(int i3 = n-i; i3 <= n; i3++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
