
/**
 * Write a description of class MatrixMultiLab24i here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MatrixMultiLab24i
{
    public static void main(String[] args)
    {
        int[][] mat1 = {{1,2},{3,4}};
        int[][] mat2 = {{5,6},{7,8}};
        int[][] add = new int[2][2];
        for (int i=0; i<mat1.length; i++)
        {
            for (int j=0; j<mat1[i].length; j++)
            {
                add[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        for(int[] x: mat1)
        {
            System.out.println(Arrays.toString(x));
        }
        System.out.println(" + ");
        for(int[] y: mat2)
        {
            System.out.println(Arrays.toString(y));
        }
        System.out.println(" = ");
        for(int[] z: add)
        {
            System.out.println(Arrays.toString(z));
        }
        System.out.println("\n\n");
        int[][] multi = new int [mat1.length][mat2[0].length];
        for (int a=0; a<mat1.length; a++)
        {
            for (int b=0; b<mat2[a].length; b++)
            {
                for (int c=0; c<mat1[b].length; c++)
                {
                    multi[a][b]+=mat1[a][c]*mat2[c][b];
                }
            }
        }
         for(int[] x: mat1)
        {
            System.out.println(Arrays.toString(x));
        }
        System.out.println(" + ");
        for(int[] y: mat2)
        {
            System.out.println(Arrays.toString(y));
        }
        System.out.println(" = ");
        for(int[] m: multi)
        {
            System.out.println(Arrays.toString(m));
        }
    }
}
