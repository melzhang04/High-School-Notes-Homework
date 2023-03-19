
/**
 * Write a description of class PascalsTriangleLab24c here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class PascalsTriangleLab24c
{
    public static void main(String[] args)
    {
        int[] data = {3,6,7,2,4,5};
        for(int x: data)
        {
            triangle(x);
            System.out.println();
        }
    }
    public static void triangle(int a)
    {
        int[][] tri = new int[a][a];
        for(int i = 0; i<a; i++)
        {
            for(int j= 0; j<=i; j++)
            {
                if((j == 0)||(j == i))
                {
                    tri[i][j] = 1;
                }
                else
                {
                    tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
                }
            }
        }
        for(int[] x: tri)
        {
            System.out.println(Arrays.toString(x));
        }
    }
}

