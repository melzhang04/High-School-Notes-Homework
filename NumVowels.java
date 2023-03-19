 


/**
 * Write a description of class NumVowels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class NumVowels
{
    public static void main(String[] args)
    {
        String b = "chicken";
        System.out.println(b);
        System.out.println(vowels(b));
        System.out.print(characters(b));
    }
    public static String vowels(String w)
    {
        ArrayList<String> word = new ArrayList<String>();
        int counter = 0;
        for(int i=1; i<=w.length();i++)
        {
            String l = w.substring(i-1,i);
            word.add(l);
        }
        for(String x: word)
        {
            if(x.equals("a")||x.equals("e")||x.equals("i")||x.equals("o")||x.equals("u"))
            {
                counter++;
            }
        }
        return "num vowels == " + counter;
    }
    public static String characters(String w)
    {
        ArrayList<String> word = new ArrayList<String>();
        int counter = 0;
        for(int i=1; i<=w.length();i++)
        {
            String l = w.substring(i-1,i);
            word.add(l);
        }
        for(String x: word)
        {
            if(!(x=="a"||x=="e"||x=="i"||x=="o"||x=="u"))
            {
                counter++;
            }
        }
        return "num chars == " + counter;
    }
}
