
/**
 * Write a description of class booleanTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BooleanTest
{
    public static void main (String[] args)
    {
        boolean t = true;
        boolean f = false;
        boolean compareTrue = 3==3;
        boolean compareFalse = 3!=3;
        int x = 25;
        int y = 21;
        boolean inequality = x>y;
        
        System.out.println("true --> " + t);
        System.out.println("false --> " +f);
        System.out.println("3==3 --> " + compareTrue);
        System.out.println("3!=3 --> " + compareFalse);
        System.out.println(x + " > " + y +" --> " + inequality);
        
        //test logical AND OR
        System.out.println("\n");
        System.out.println("true && false: " + (true && false)); //AND: both condition must be true to evaluate to true
        System.out.println("true || false: " + (true || false)); //OR: if either condition is true, it evaluates to true
        System.out.println("\n");
        
        //create and call a boolean return method to test if a number is even
        int evenTest = 11;
        System.out.println("The number " + evenTest + " is EVEN: " + isEven(evenTest));
        System.out.println("The number " + evenTest + " is ODD: " + !isEven(evenTest));
    }
    public static boolean isEven(int num)
    {
        return num % 2 == 0;  // this is how we determine if a number is even using mod
    }
    
}
