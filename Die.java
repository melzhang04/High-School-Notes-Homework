
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    private int rolledNum;
    private int numSides;
    private boolean isRigged;
    public Die()
    {
        numSides = 6;
    }
    public Die(int sides)
    {
        numSides = sides;
    }
    /**
     * Setter methods for number of sides and rigged;
     */
    public void setSides(int x)
    {
        numSides = x;
    }
    public void setRigged(boolean b)
    {
        isRigged = b;
    }
    /**
     * Getter methods for number of sides and rigged;
     */
    public int getSides()
    {
        return numSides;
    }
    public int getRolledNum()
    {
        return rolledNum;
    }
    /**
     * Dice methods;
     */
    public void rollDie()
    {
        int riggedNumber = (int)(Math.random()*numSides+1);
        int[] riggedArray = new int[numSides+numSides/2];
        for(int i=0;i<riggedArray.length;i++)
        {
            if(i<numSides)
            {
                riggedArray[i] = i+1;
            }
            else
            {
                riggedArray[i] = riggedNumber;
            }
        }
        if(isRigged)
        {
            rolledNum = riggedArray[(int)(Math.random()*riggedArray.length)];
        }
        else
        {
            rolledNum = (int)(Math.random()*numSides+1);
        }
    }
    public void showDie()
    {
        System.out.println("**************");
        System.out.println("*            *");
        System.out.println("*            *");
        System.out.println("*     "+rolledNum+"      *");
        System.out.println("*            *");
        System.out.println("*            *");
        System.out.println("**************");
    }
}
