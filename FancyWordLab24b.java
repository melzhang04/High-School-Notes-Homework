
/**
 * Write a description of class FancyWordLab24b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class FancyWordLab24b
{
    public static void main(String[] args)
    {
        String[] words = {"HELLO", "CAT", "A", "DOGHOUSE", "ONE", "IT"};
        for(String s: words)
        {
            String[][] hourglass = new String[s.length()][s.length()];
            String n = s;
            createHg(hourglass, n);
            for(String[] x: hourglass)
            {
                System.out.println(Arrays.toString(x));
            }
            System.out.println();
        }
    }
    public static void createHg(String[][] mat, String m)
    {
        for(int i = 0; i< mat.length; i++)
        {
            for(int j = 0; j<mat[i].length;j++)
            {
                mat[0][j] = m.substring(j,j+1);
                if(i==j)
                {
                    mat[i][j] = m.substring(j,j+1);
                }
                else
                {
                    mat[i][j] = " ";
                }
                mat[m.length()-1-j][j]=m.substring(j,j+1);
                mat[m.length()-1][j] = m.substring(j,j+1);
            }
        }
    }
}
