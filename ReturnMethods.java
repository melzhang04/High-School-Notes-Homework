
/**
 * Introductory notes for methods that return a value
 *
 * @Coach Kelley
 * @8-12-2021
 */
public class ReturnMethods
{
    public static void main (String[] args)
    {
        //returnMethodOne();// this returns 1, but nothing is done with it.....
        int variable = returnMethodOne(); //the int variable has a value of 1
        System.out.println(returnMethodOne() + 23 + variable); //returnMethodOne() call = 1
        
        System.out.println(returnMethodTwo() + " " + returnMethodThree());
    }
    public static int returnMethodOne() //return method that is expecting an in value
    {
        return 1; //the keywork return notifies the method that something coming back
    }
    public static double returnMethodTwo()
    {
        return 3.14;
    }
    public static String returnMethodThree()
    {
        return "is an approximation of pi";
    }
}
