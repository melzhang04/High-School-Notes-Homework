
/**
 * Write a description of class discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class discount
{
    public static void main(String [] args)
    {
       Scanner x = new Scanner(System.in);
       System.out.println("Enter the original bill amount: ");
       int m = x.nextInt();
       if (m>2000){
           System.out.println(m-(m*.15));
       }
       else {
           System.out.println(m);
       }
    }
}
