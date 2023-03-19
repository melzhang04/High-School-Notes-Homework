
/**
 * Write a description of class reverseNum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class reverseNum
{
        public static void main (String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int number = s.nextInt();
            String s1 = "";
            while (number%10 < number)
            {
                s1 = s1 + number%10;
                number = number/10;
            }
            s1 = s1 + number%10;
            System.out.println(s1);
        }
    }
