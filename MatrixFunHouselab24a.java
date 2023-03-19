
/**
 * Write a description of class MatrixFunHouselab24a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MatrixFunHouselab24a
{
   public static void main(String[] args)
   {
       System.out.println("mat before changes");
       int[][] mat = new int[10][10];
       for(int[] n: mat)
       {
           System.out.println(Arrays.toString(n));
       }
       System.out.println();
       System.out.println("mat after changes");
       mat[0][0] = 5;
       mat[0][1] = 4;
       mat[0][2] = 6;
       mat[1][1] = 2;
       mat[2][2] = 6;
       mat[3][2] = 9;
       mat[3][4] = 7;
       mat[7][8] = 9;
       mat[8][2] = 9;
       for(int[] n: mat)
       {
           System.out.println(Arrays.toString(n));
       }
       int counter = 0;
       for(int x = 0; x<mat.length; x++)
       {
           for(int y = 0; y<mat[x].length;y++)
           {
               counter += mat[x][y];
           }
           System.out.println("maxtrix row " + x + " total = " + counter);
           counter = 0;
       }
       int total = 0;
       for(int i= 0; i< mat.length; i++)
       {
            for(int j= 0; j< mat[i].length; j++)
            {
                total += mat[i][j];
            }
       }
       System.out.println("matrix total = " + total);
   }
}
