
/**
 * Write a description of class gradeCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class gradeCheck
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number grade: ");
        int g = x.nextInt();
        if (g >= 90)
        {
            System.out.println(g + " is a A");
        }
        else if ((g >= 80) && (g < 90))
        {
            System.out.println(g + " is a B");
        }
        else if ((g >= 75) && (g < 80))
        {
            System.out.println(g + " is a C");
        }
        else if ((g >= 70) && (g < 75))
        {
            System.out.println(g + " is a D");
        }
        else
        {
            System.out.println(g + " is a F");
        }
    }
}
