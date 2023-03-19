
/**
 * Write a description of class FancyWordDiamondLab24f here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class FancyWordDiamondLab24f
{
    public static void main(String[] args)
    {
        String[] words = {"A", "IT", "CAT", "TONER"};
        for(String s: words)
        {
            diamond(s);
            System.out.println();
        }
    }
    public static void diamond(String s)
    {
        int l = s.length();
        String[][] dia = new String[l*4-2][l*4-2];
        String word = "";
        for (int i=l-1; i>-1; i--)
        {
           word+= s.substring(i, i+1);
        }
        word+=s.substring(1);
        for (String[] a: dia)
        {
            Arrays.fill(a, " ");
        }
        int space = l*2-2;
        for (int i=0; i<l*2-1; i++)
        {
            dia[i][space]=word.substring(i, i+1);
            dia[i][space+i+i]=word.substring(i, i+1);
            space--;
        }
        for (int i=0; i<l*2-1; i++) 
        {
            space++;
            dia[i+l*2-2][space]=word.substring(i, i+1);
            dia[i+l*2-2][l*4-4-space]=word.substring(i, i+1);
        }
         space = 0;
        for (int i=l-1; i<l*2-1; i++)
        {
            dia[i][i]=s.substring(space,space+1);
            dia[i][l*4-4-i]=s.substring(space,space+1);
            space++;
        }
        space = 0;
        for (int i=l*3-3; i>l*2-2; i--)
        {
            dia[i][i]=s.substring(space, space+1);
            dia[i][l*4-4-i]=s.substring(space,space+1);
            space++;
        }
        for (int i=0; i<l*4-3; i++)
        {
            for (int j=0; j<l*4-3; j++)
            {
                System.out.print(dia[i][j]);
            }
            System.out.println();
        }
    }
}
