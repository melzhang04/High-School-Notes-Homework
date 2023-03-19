
/**
 * Write a description of class forLoopMultTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class forLoopMultTable
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in a number you would like to multiply:");
        int n = s.nextInt();
        System.out.println("How many multiples do you want?");
        int m = s.nextInt();
        boolean b = n < 10 && m < 10;
        System.out.println("multiplication table for " + n + ":");
        if(b == true)
        {
        for (int i= 1; i <= m; i++)
        {
            System.out.println((i) + "      " + (i*n));
        }
    }
    else
    {
        System.out.println("Your numbers were too big! Please choose a numbers\nbetween 0 and 10.");
    }
}
}
