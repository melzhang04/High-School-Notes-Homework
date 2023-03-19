
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class test
{
     public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("How many arrays do you wish to enter?");
        int n = input.nextInt();
        int[][] twodeejay = new int[n][];
        int[][] placeholder = new int[n][];
        int size = 0;
        int value = 0;
        for (int i=0; i<n; i++)
        {
            System.out.println("What is the size of array " + i + ":");
            size = input.nextInt();
            twodeejay[i] = new int[size];
            placeholder = twodeejay;
            for (int j=0; j<size; j++)
            {
                System.out.println("Enter the value for spot " + j + ":");
                value = input.nextInt();
                twodeejay[i][j] = value;
            }
            System.out.println("TwoDRay before copying ray to row " + i);
            print(placeholder, n, i-1);
            System.out.println("TwoDRay before sorting row " + i);
            print(twodeejay, n, i);
            sort(twodeejay, i);
            System.out.println("TwoDRay after sorting row " + i);
            print(twodeejay, n, i);
        }
    }
    public static void print (int[][] a, int rows, int param)
    {
        for (int i=0; i<rows; i++)
        {
            System.out.print("row " + i + ": ");
            if (i<=param)
            {
                for (int j=0; j<a[i].length; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void sort(int[][] a, int b)
    {
        int temp = 0;
        for (int i=0; i<a[b].length; i++)
        {
            for (int j=i+1; j<a[b].length; j++)
            {
                if (a[b][i] > a[b][j])
                {
                    temp = a[b][i];
                    a[b][i] = a[b][j];
                    a[b][j] = temp;
                }
            }
        }
    }
}
