
/**
 * Write a description of class StringChopper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringChopper
{
    public static void main(String[] args)
    {
        String s1 = "456-56-234";
        int a = s1.indexOf("-");
        int b = s1.lastIndexOf("-");
        int s2 = Integer.parseInt(s1.substring(0, a));
        int s3 = Integer.parseInt(s1.substring(a+1, b));
        int s4 = Integer.parseInt(s1.substring(b+1,s1.length()));
        System.out.println("SS#" + s1 + " has a total of "+ (s2+s3+s4));
    }
}
