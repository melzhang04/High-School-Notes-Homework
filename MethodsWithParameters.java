
/**
 * Write a description of class MethodsWithParameters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MethodsWithParameters
{
    public static void main (String[] args)
    {
        addTwoInts(7, 15);
        addTwoInts(8, 2);
        addTwoInts(34, 15);
        

        System.out.println(sayMyName("Melisa"));
        findMaxNum(6.5,6.7);
    }
    //here we will create a method that accepts 2 int parameters and adds them together
    public static void addTwoInts(int num1, int num2) //inside the parenthesis is where the variable declarations go
    {
        System.out.println("The sum of the 2 integers is " + (num1 + num2));
    }
    public static String sayMyName(String name)
    {
        return "My name is: " + name;
    }
    public static void findMaxNum(double num1, double num2)
    {
        if(num1>num2)
        {
            System.out.println("The larger of the 2 nums is: " + num1);
        }
        else
        {
            System.out.println("The larger of the 2 nums is: " + num2);
        }
    }
}
