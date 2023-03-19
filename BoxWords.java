
/**
 * Write a description of class BoxWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BoxWords
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in a word:");
        String x = s.next();
        String output = "";
        output +=x;
        System.out.println(x);
        for(int i = x.length()-2; i > 0; i--)
        {
            System.out.print(x.charAt((x.length()-1)-i));
            for(int i2 = x.length()-2; i2 > 0; i2--)
            {
               System.out.print(" ");
            }
            System.out.print(x.substring(i,i+1));
            System.out.println();
        }
        for(int i3 = x.length()-1; i3 >=0; i3--)
        {
            System.out.print(x.charAt(i3));
        }
    }
}
