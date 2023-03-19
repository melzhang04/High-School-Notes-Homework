
/**
 * Write a description of class PlayYahtzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class PlayYahtzee
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Yahtzee y = new Yahtzee();
        y.firstRoll();
        
        String again = "yes";
        System.out.println("Do you want to re-roll any dice? (yes or no)");
        if(in.next().equalsIgnoreCase(again))
        {
            System.out.println("How many dice?");
            int numReRolls = in.nextInt();
            for(int i = 0;i<numReRolls;i++)
            {
                y.reRoll();
            }
        }
        //if we don't want to reroll?
        y.whatIsIt();
        System.out.println("Thanks for Playing!!!");
    }
}
