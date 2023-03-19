
/**
 * Write a description of class WhileLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WhileLoops
{
    public static void main (String[] args)
    {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        while(x<5)
        {
            System.out.println(x);
            x++;
        }
        System.out.println("The loop is finished");
        String yesNo = "yes";
        String input = scan.nextLine();
        while(input.equals(yesNo))
        {
            System.out.println("Is the baby a boy or girl?");
            String baby = scan.nextLine();
            if(isBoy(baby))
            {
                System.out.println("Your baby is a boy");
            }
            else
            {
                System.out.println("Your baby is not a boy");
            }
            System.out.println("Do you want to enter another Baby?");
            input = scan.nextLine();
            if(input.equalsIgnoreCase("yes"))
            {
                yesNo = "yes";
            }
            else {
                yesNo = " : ( ";
            }
        }
    }
        public static boolean isBoy(String baby)
        {
        if(baby.equalsIgnoreCase("boy"))
        {
            return true;
        }
        else {
            return false;
        }

    }
}

