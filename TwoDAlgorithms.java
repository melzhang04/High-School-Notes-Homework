
/**
 * Write a description of class TwoDAlgorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class TwoDAlgorithms
{
    public static void main (String[] args)
    {
        int[][] grades = new int[5][5]; //{ {1,1,2}, {5,4,3}}
        
        
        assignRandomValues(grades);
        printArray(grades);
        System.out.println("\n The average of the 2D Array is: "+ averageAll(grades));
        System.out.println("\n The average of the of row 3 is: "+ averageOneRow(2, grades));
        System.out.println("\n The average of the of column 1 is: "+ averageOneRow(0, grades));
        
    } 
    public static void printArray(int[][] a)
    {
        for (int row = 0; row<a.length; row++) //this outer loop will access each 1-D array(row)
        {
            System.out.print("[");
            for (int col = 0; col<a[row].length; col++)
            {
                System.out.format("%4d", a[row][col]);
            }
            System.out.print(" ]");
            System.out.println();
        }
    }
    public static void assignRandomValues(int[][] a)
    {
        for (int r= 0; r<a.length; r++)
        {
            for (int c=0; c<a[r].length; c++)
            {
                //assign random values from 0 --> 100;
                a[r][c] = (int)(Math.random()*101);
            }
            
        }
    }
    // average all vaule in the array
    public static double averageAll(int[][] a)
    {
        int sum = 0;
        int ctr = 0;
        for (int[] x : a)
        {
            for (int num : x)
            {
                ctr++;
                sum+=num;
            }
        }
        return (double)sum/ctr;
    }
    /**
     *  precondition: The @param row is valid
     */
    public static double averageOneRow(int row, int[][] arr)
    {
        int sum = 0;
        
        for (int x: arr[row])
        {
            sum+=x;
        }
        return (double)sum/arr[row].length;
    }
    public static double averageOneCol(int col, int[][] arr)
    {
        int sum = 0;
        for (int row = 0; row<arr.length; row++)
        {
            sum+= arr[row][col];
        }
        
        
        return (double)sum/arr.length;
    }
    
    
    
    
    
    
    
    
    
}
