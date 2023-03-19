
/**
 * Write a description of class StringLength here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringLength
{
    public static void main(String[] args)
    {
        String s1 = "hello";
        String s2 = "goodbye";
        System.out.println(s1 + " is " + s1.length() + " characters long.");
        System.out.println(s2 + " is "+ s2.length() + " characters long.");
        System.out.println(compare(s1, s2));
    }
    public static String compare(String s1, String s2)
    {
        if (s1.length()==s2.length())
        {
            return s1 + " and " + s2 + " have the same number of letters.";
        }
        else 
        {
            return s1 + " and " + s2 + " do not have the same number \nof letters.";
        }
    }
}
