
/**
 * Write a description of class StringSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringSearch
{
    public static void main(String[] args)
    {
        Scanner one = new Scanner(System.in);
        System.out.println("Please enter in a word: ");
        String s1 = one.next();
        System.out.println("Pleae enter the letter or group of letters \nyou want to search for: ");
        String s2 = one.next();
        System.out.println(search(s1, s2));
    }
    public static String search(String s1, String s2)
    {
        int x = s1.indexOf(s2);
        if (x == -1)
        {
            return "looking for " + s2 + " false";
        }
        else
        {
            return "looking for " + s2 + " true";
        }
    }
}
