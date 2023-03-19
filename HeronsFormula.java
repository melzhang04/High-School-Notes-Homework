
/**
 * Write a description of class HeronsFormula here.
 *
 * Melisa Zhang
 * 8/22/21
 */
import java.util.Scanner;
import java.lang.Math;
public class HeronsFormula
{
   public static void main (String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("a =  ");
       double a = input.nextDouble();
       System.out.println("b =  ");
       double b = input.nextDouble();
       System.out.println("c =  ");
       double c = input.nextDouble();
       System.out.println(perimeter(a, b, c));
       System.out.println("s = " + (perimeter(a, b, c))/2);
       double s = (perimeter(a, b, c))/2;
       double s1 = s - a;
       double s2 = s - b;
       double s3 = s - c;
       System.out.println("area = " + Math.sqrt(s*(s1*s2*s3)));
       
       
   }
   public static double perimeter(double a, double b, double c)
   {
       return (a + b + c);
   }
   }

