
/**
 * Notes for introdcution to Methods with primitive data, parameters, and return values.
 *
 * @Coach Kelley    
 * @8-12-2021
 */
public class VoidMethods
{
    public static void otherMethod() //method header
    {
         System.out.println("I am the otherMethod");   
    }
    public static void main (String[] args)
    {
        System.out.println("The main method always runs first no matter where it is!");
        methodOne(); //method to call methodOne
        methodTwo();
        otherMethod();
        System.out.println("\n\n");
        allMethods();
    }
    public static void methodOne()
    {
         System.out.println("I am methodOne");   
    }
    public static void methodTwo()
    {
         System.out.println("I am methodTwo");   
    }
    public static void allMethods()
    {
        methodOne();
        methodTwo();
        otherMethod();
    }
}
