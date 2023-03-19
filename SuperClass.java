
/**
 * Write a description of class SuperClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SuperClass
{
    private int x;
    private String xy;
   
    public SuperClass()
    {
        x = 95;
        xy = "This Really is a String";
        System.out.println("Default Constructor for SuperClass called");
    }
    public SuperClass(int g, String n)
    {
        x = g;
        xy = n;
        System.out.println("2 Param Constructor for SuperClass called");
    }
}
