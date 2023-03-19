
/**
 * Write a description of class Yahtzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Yahtzee
{
    private ArrayList<Die> dice;
    private int p1score;
    private int p2score;
    private int[] howMany;
    public Yahtzee()
    {
       dice = new ArrayList<Die>();
       for(int i = 0; i<5;i++)
        {
            dice.add(new Die());
            
        }
    }
    public void firstRoll()
    {
        for(Die d: dice)
        {
            d.rollDie();
            d.showDie();
        }
    }
    public void reRoll()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Which die do you want to re-roll?");
        int x = in.nextInt()-1;
        dice.get(x).rollDie();
        dice.get(x).showDie();
    }
    public void whatIsIt()
    {
        ArrayList<Integer> values = new ArrayList<Integer>();
        for(Die d: dice)
        {
            values.add(d.getRolledNum());
        }
        Collections.sort(values);
        if(isStraight(values))
        {
            System.out.println("You have a Straight");
        }
        else if(numDice(values) >= 2)
        {
            System.out.println("You have " +numDice(values) + " of a kind");
        }
        else
        {
            System.out.print("You have something we haven't coded for yet");
        }
    }
    public boolean isStraight(ArrayList<Integer> l)
    {
        for(int x=0;x<l.size();x++)
        {
            if(l.get(x)!=(l.get(x+1)-1))
            {
                return false;
            }
        }
        return true;
    }
    public int numDice(ArrayList<Integer> l)
    {
        howMany = new int[6];
        for(int x: l)
        {
            howMany[x-1]++;
        }
        int max = 0;
        for(int num: howMany)
        {
            if(num>max)
            {
                max = num;
            }
        }
        return max;
    }
}
