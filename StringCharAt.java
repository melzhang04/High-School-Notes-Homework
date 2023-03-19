
/**
 * Write a description of class StringCharAt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringCharAt
{
    public static void main(String[] args)
    {
        String s1 = "hello";
        String s2 = "howdy";
        if (s1.charAt(0)==s2.charAt(0))
        {
            System.out.println( s1 + " has the same first letter as " + s2);
        }
        else
        {
            System.out.println(s1 + "does not have the same first letter as " + s2);
        }
    }
}
