
/**
 * Write a description of class MPH here.
 *
 * Melisa Zhang
 * 8/22/21
 */
import java.util.Scanner;
public class MPH
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles = ");
        double miles = input.nextDouble();
        System.out.println("Total time in minutes = ");
        double time = input.nextDouble();
        double timeInHours= time/60;
        System.out.println("distance traveled in an hour or MPH = " + distanceTraveled(miles, time/60));
        
        
    }
    public static double distanceTraveled(double miles, double time)
    {
        return(miles/time);
    }
}
