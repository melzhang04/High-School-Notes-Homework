
/**
 * Write a description of class SortMatrixLab24h here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class SortMatrixLab24h
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("How many arrays do you wish to enter?::");
        int row = s.nextInt();
        int mat[][] = new int[row][];
        int[][] temp = new int[row][];
        for(int i = 0; i<row; i++)
        {
            System.out.println("What is the size of array " + i + " : ");
            int x = s.nextInt();
            mat[i] = new int[x];
            temp = mat;
            for(int j = 0; j<x;j++)
            {
                System.out.println("Enter the value for spot " + j + " :: ");
                int num = s.nextInt();
                mat[i][j] = num;
            }
        }
        System.out.println("TwoDRay before sorting");
        for(int[] y: mat)
        {
            System.out.println(Arrays.toString(y));
        }
        System.out.println("TwoDRay after sorting");
        for(int[] b: mat)
        {
            for(int c = 0; c<b.length; c++)
            {
                Arrays.sort(b);
            }
        }
        for(int z = 0; z<mat.length; z++)
        {
            for(int p = 0; p<mat[z].length;p++)
            {
                System.out.print(mat[z][p] + " ");
            }
            System.out.println();
        }
    }
}
