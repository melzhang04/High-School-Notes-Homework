
/**
 * Write a description of class FancyWordBoxLab24e here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class FancyWordBoxLab24e
{
    public static void main(String[] args)
    {
        String[] words= {"HELLO","CAT","A","DOGHOUSE","ONE","IT"};
        for(String s: words)
        {
            makebox(s);
            System.out.println();
        }
    }
    public static void makebox(String s)
    {
        String[][] box = new String[s.length()][s.length()];
        for(int i = 0; i<box.length; i++)
        {
            for(int j = 0; j<box[i].length; j++)
            {
                if(i==0)
                {
                    box[i][j] = s.substring(j,j+1);
                }
                else if(i>0 && i<s.length()-1)
                {
                    box[i][j] = " ";
                    box[i][0] = s.substring(i,i+1);
                    box[i][s.length()-1] = s.substring(s.length()-1-i,s.length()-i);
                    
                }
                else if(i == s.length()-1)
                {
                    box[i][j] = s.substring(i-j, i-j+1);
                }
            }
        }
        for(String[] x: box)
        {
            System.out.println(Arrays.toString(x));
        }
    }

}
