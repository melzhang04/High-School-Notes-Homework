
/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class UserInput
{
    public static void main (String[] args)
    {
        //Creates an obeject of the Scanner class
        Scanner keyboard = new Scanner(System.in);
        //println statement that prompts the user to enter name 
        System.out.println("Enter your name: ");
        //Creates a variable to store the input from the keyboard
        String name = keyboard.nextLine();
        
        //println statement that prompts the user to enter age 
        System.out.println("\nEnter your age: ");
        //Creates a variable to store the input from the keyboard
        int age = keyboard.nextInt();
        
        //println statement that prompts the user to enter 2 numbers 
        System.out.println("\nEnter 2 numbers: ");
        System.out.print("First number: " );
        double num1 = keyboard.nextDouble();
        System.out.print("Second number: " );
        double num2 = keyboard.nextDouble();
        
        //Passes the stored information into methods to be formatted and displayed
        System.out.println("\n\n" + userInfo(name, age) + "\n\n");
        System.out.println("The average of your 2 numbers is: " + avgNums(num1, num2));
    }
    public static String userInfo(String nm, int age)
    {
        return "Your name is " + nm + " and you are " + age + " years old!!";
    }
    public static double avgNums(double d1, double d2)
    {
        return (d1+d2)/2;
    }
    
}
