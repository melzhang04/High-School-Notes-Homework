
/**
 * Write a description of class test2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class test2
{
    public static void main(String[] args)
    {
        int[][] matrix1 = new int [2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;
        int[][] matrix2 = new int [2][2];
        matrix2[0][0] = 5;
        matrix2[0][1] = 6;
        matrix2[1][0] = 7;
        matrix2[1][1] = 8;
        int[][] matrix3 = new int [3][3];
        int[][] matrix4 = new int [3][2];
        if (dimensioncheckeradd(matrix1, matrix2))
        {
            print(add(matrix1, matrix2));
        }
        if (dimensioncheckermultiply(matrix1, matrix2))
        {
            print(multiply(matrix1, matrix2));
        }
    }
    public static int[][] multiply (int[][] m1, int[][] m2)
    {
        int[][] multimatrix = new int [m1.length][m2[0].length];
        for (int i=0; i<m1.length; i++)
        {
            for (int j=0; j<m2[i].length; j++)
            {
                for (int k=0; k<m1[i].length; k++)
                {
                    multimatrix[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        return multimatrix;
    }
    public static boolean dimensioncheckermultiply(int[][] m1, int[][] m2)
    {
        if (m1.length != m2[0].length)
        {
            return false;
        }
        return true;
    }
    public static int[][] add (int[][] m1, int[][] m2)
    {
        int[][] additionmatrix = new int [m1.length][m1[0].length];
        for (int i=0; i<m1.length; i++)
        {
            for (int j=0; j<m1[i].length; j++)
            {
                additionmatrix[i][j] = m1[i][j]+m2[i][j];
            }
        }
        return additionmatrix;
    }
    public static boolean dimensioncheckeradd(int[][] m1, int[][] m2)
    {
        if (m1.length != m2.length)
        {
            return false;
        }
        else
        {
            for (int i=0; i<m1.length; i++)
            {
                if (m1[i].length != m2[i].length)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void print(int[][] m)
    {
        for (int i=0; i<m.length; i++)
        {
            System.out.print("[ ");
            for (int j=0; j<m[i].length; j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("]");
        }
    }

}
