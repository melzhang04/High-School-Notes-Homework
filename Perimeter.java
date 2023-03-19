
/**
 * This lab will create a method to return/print the perimeter of a rectangle 
 * give l and w.
 *
 * Melisa Zhang
 * 8/19/21
 */
import java.util.Scanner;
public class Perimeter
{ 
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length and the width of");
        System.out.println("your rectangle");
        System.out.println("Length:  ");
        double length = input.nextDouble();
        
        System.out.println("Width:  ");
        double width = input.nextDouble();
        
        System.out.println("Thank you for using our service!!\n\n ");
        System.out.println("The perimeter of your rectangle with length: " + length + " and ");
        System.out.println("width: " + width + " is " + findPerimeter(length, width));
        
    }
    public static double findPerimeter(double l, double w)
    {
        return(2*l + 2*w);
    }
}