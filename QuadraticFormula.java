
/**
 * Write a description of class QuadraticFormula here.
 *
 * Melisa Zhang
 * 8/22/21
 */
import java.util.Scanner;
import java.lang.Math;
public class QuadraticFormula
{
   public static void main (String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("a = ");
       double a = input.nextDouble();
       System.out.println("b = ");
       double b = input.nextDouble();
       System.out.println("c = ");
       double c = input.nextDouble();
       System.out.println("Quadratic = " + ((-b + Math.sqrt((b*b) - 4*a*c))/(2*a)) + " or " + ((-b - Math.sqrt((b*b) - 4*a*c))/(2*a)));
   }
   public static double abc(double a, double b, double c)
   {
       return ((-b + Math.sqrt((b*b) - 4*a*c))/(2*a));
   }
   public static double abc2(double a, double b, double c)
   {
       return ((-b - Math.sqrt((b*b) - 4*a*c))/(2*a));
   }
}
