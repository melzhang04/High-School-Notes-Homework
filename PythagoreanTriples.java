
/**
 * Write a description of class PythagoreanTriples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class PythagoreanTriples
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in a number to decide \nhow many pythagorean triples you want:");
        int n = s.nextInt();
        int gcf = 1;
        for (int a = 1; a < n; a++)
            {
                for (int b = a; b < n; b++)
                {
                    for (int c = b; c < n; c++)
                    {
                        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))
                        {
                            for (int x = 1; x < n; x++)
                            {
                                if (a%x == 0 && b%x == 0 && c%x == 0)
                                {
                                    gcf = x;
                                }
                            }
                            if (a<b && gcf ==1)
                            {
                                if (a%2 != 0 && b%2 == 0 && c%2 != 0)
                                {
                                    System.out.println(a + " " + b + " " + c);
                                }
                                else if (a%2 ==0 && b%2 != 0 && c%2 != 0)
                                {
                                    System.out.println(a + " " + b + " " + c);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

