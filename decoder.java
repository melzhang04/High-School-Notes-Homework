
/**
 * Write a description of class decoder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class decoder
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String l = x.nextLine();
        char a = l.charAt(0);
        if(Character.isLetter(a)== true)
        {
            if (l ==l.toLowerCase())
        {
            System.out.println(l + " decodes to " + l.toUpperCase());
        }
            else
        {
            System.out.println(l + " decodes to " + l.toLowerCase());
        }
    }else if(Character.isDigit(a)== true)
    {
        System.out.println(l + " decodes to " + (char)((int)(a)+17));
    }
    else
    {
        System.out.println(l+ " decoddes to #");
    }
}
}

