
/**
 * Write a description of class oddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class oddEven
{
    public static void main (String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int a = x.nextInt();
        System.out.println(a + " is odd: ");
        if ((a%2)!=0)
        {
            System.out.print(true);
        }
        else
        {
            System.out.print(false);
        }
        System.out.println("\n"+ a + " is even: ");
        if ((a%2)==0)
        {
            System.out.print(true);
        }
        else
        {
            System.out.print(false);
        }
    }
}
