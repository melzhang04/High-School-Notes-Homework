
/**
 * Write a description of class DistanceFormula here.
 *
 * Melisa Zhang
 * 8/22/21
 */
import java.util.Scanner;
import java.lang.Math;
public class DistanceFormula
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("x1 = ");
        double x1 = input.nextDouble();
        System.out.println("x2 = ");
        double x2 = input.nextDouble();
        double x = (x(x1, x2))*(x(x1, x2));
        System.out.println("y1 = ");
        double y1 = input.nextDouble();
        System.out.println("y2 = ");
        double y2 = input.nextDouble();
        double y = (y(y2, y1))*(y(y2, y1));
        System.out.println("The distance between the two points is: " + (Math.sqrt(x + y)));
        
    }
    public static double x(double x1,double x2)
    {
        return (x2 - x1);
    }
    public static double y(double y1, double y2)
    {
        return (y2 - y1);
    }
}
