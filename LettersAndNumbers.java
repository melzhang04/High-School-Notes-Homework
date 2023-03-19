
/**
 * Write a description of class LettersAndNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LettersAndNumbers
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter in a number:");
        int n = s.nextInt();
        System.out.println("Please enter in the letter you want to start at:");
        String l = s.next();
        char let = l.charAt(0);
       String output = "";
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j<n-i; j++)
            {
                for (int k =0; k<n-j; k++)
                {
                    if(let+j>90)
                    {
                        output+=(char)(let+j-26); 
                    }
                    else
                    {
                        output+=(char)(let+j);
                    }
                }
                output+=(" ");
            }
            output+="\n";
        }
        System.out.print(output);
    }
}
