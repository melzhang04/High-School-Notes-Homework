
/**
 * Write a description of class StringCompareTo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringCompareTo
{
    public static void main(String[] args)
    {
        String s1 = "abe";
        String s2 = "ape";
        System.out.println(compare(s1, s2));
    }
    public static String compare(String s1, String s2)
    {
        int x = s1.compareTo(s2);
        if (x==-1)
        {
            return s2 + " should be placed before " + s1;
        }
        else
        {
            return s1 + " should be placed before " + s2;
        }
    }
}
