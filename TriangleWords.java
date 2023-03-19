
/**
 * Write a description of class TriangleWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TriangleWords
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Please enter in a word:");
       String word = s.next();
       String output = "";
        for (int i = 1; i< word.length(); i++)
        {
            for (int j = 0; j< word.length()-i; j++)
            {
                output+=" ";
            }
            if (i>1)
            {
                output += word.charAt(i-1);
            }
            for (int k = 0; k< 2*i-3; k++)
            {
                output+=" ";   
            }
            output+=word.charAt(i-1)+"\n";
        }
        for (int x=word.length()-1; x>0; x--)
        {
            output+=word.charAt(x);
        }
        for (int y = 0; y<word.length(); y++)
        {
            output+=word.charAt(y);
        }
        System.out.println(output);
   }
}
