
/**
 * Introduction 2 - Dimensional Arrays
 *
 * Melisa Zhang
 * 1/24/22
 */
import java.util.Arrays;
public class Intro
{
    public static void main(String[] args)
    {
        /**
         * Here we will create a 2-D Array filled with values
         * 2-D Arrays use 2 bracket notation
         * String[][] example = new String[4][3];
         * 
         * We can access and assign values using the double bracket notation
         *      -->   example [index of array(row)][index of element from that returned array];
         * 
         * You can created a jagged array, but all Arrays assessed in this course will be rectangular
         *         a square is a rectangle, but a rectangle is not necessarily a square
         */
        
        //Create a 2-D Array filled with Strings
        String[][] lottaWords = {  {"Bot", "Lot", "Words", "of"},
                                   {"I", "Was", "gonna", "ask"},
                                   {"last", "one", "is", "so creative"}
                                };
        //Isaac wantes to change "bot" to bureaucracy
        lottaWords[0][0] = "bureaucracy";
        
        //print(lottaWords);
        //System.out.println();
        
        //startsWithB(lottaWords);
        //System.out.println();
        //print(lottaWords);
        print(lottaWords);
        System.out.println();
        iDontKnow(lottaWords);
        print(lottaWords);
    }
    public static void print(String[][] a)
    {
        //Print the 2-D Array using loops
        //****   for: each loop   ****
        System.out.println("lottaWords printed using a for: each loop");
        for(String[] s: a)
        {
            System.out.println(Arrays.toString(s));
        }
        System.out.println("\nlottaWords printed using a regular for loop");
        for(int i= 0; i< a.length; i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }
    public static void startsWithB(String[][] a)
    {
        for(int r= 0; r< a.length; r++)
        {
            for(int c= 0; c< a[r].length; c++)
            {
                //reassign each position[r][c] with b + substring
                a[r][c] = "b" + a[r][c].substring(1);
            }
        }
    }
    public static void iDontKnow(String[][] m)
    {
        for(int r= 0; r< m.length; r++)
        {
            for(int c= 0; c< m[r].length; c++)
            {
                //assign each index the reverse of its characters!!!
                m[r][c] = reverseWords(m[r][c]);
            }
        }
    }
    public static String reverseWords(String s)
    {
        String reverse = "";
        for(int i = s.length()-1; i>=0; i--)
        {
            //reverse += s.charAt(i);
            reverse += s.substring(i,i+1);
        }
        return reverse;
    }
}
