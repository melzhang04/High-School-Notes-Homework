
/**
 * Write a description of class test3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class test3
{
   public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word");
        String s = input.nextLine();
        diamond(s);
    }
    public static void diamond(String s)
    {
        String[][] crystal = new String[s.length()*4-2][s.length()*4-2];
        String word = "";
        for (int i=s.length()-1; i>-1; i--)
        {
           word+= s.substring(i, i+1);
        }
        word+=s.substring(1);
        for (String[] a: crystal)
        {
            Arrays.fill(a, " ");
        }
        int spacing = s.length()*2-2;
        for (int i=0; i<s.length()*2-1; i++) //draws the top half of the diamond
        {
            crystal[i][spacing]=word.substring(i, i+1);
            crystal[i][spacing+i+i]=word.substring(i, i+1);
            spacing--;
        }
        for (int i=0; i<s.length()*2-1; i++) //draws bottom half of diamond
        {
            spacing++;
            crystal[i+s.length()*2-2][spacing]=word.substring(i, i+1);
            crystal[i+s.length()*2-2][s.length()*4-4-spacing]=word.substring(i, i+1);
        }
        spacing = 0;
        for (int i=s.length()-1; i<s.length()*2-1; i++) //draws the top diagonals of the diamond
        {
            crystal[i][i]=s.substring(spacing, spacing+1);
            crystal[i][s.length()*4-4-i]=s.substring(spacing, spacing+1);
            spacing++;
        }
        spacing = 0;
        for (int i=s.length()*3-3; i>s.length()*2-2; i--) //draws the bottom diagonals of the diamond
        {
            crystal[i][i]=s.substring(spacing, spacing+1);
            crystal[i][s.length()*4-4-i]=s.substring(spacing, spacing+1);
            spacing++;
        }
        for (int i=0; i<s.length()*4-3; i++) //prints diamond
        {
            for (int j=0; j<s.length()*4-3; j++)
            {
                System.out.print(crystal[i][j]);
            }
            System.out.println();
        }
    }
}
