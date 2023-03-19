
/**
 * Write a description of class LockerProblem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LockerProblem
{
    public static void main(String[] args) 
    {
        boolean[] lockers = new boolean[100];
        for (int s = 1; s <= 100; s++) 
        {
            toggle(lockers, s);
        }
        print(lockers);
    }
    public static void toggle(boolean[] open, int start) 
    {
        int nextLocker = start;
        for (int i = start - 1; i < open.length; i += nextLocker) 
        {
            open[i] = !open[i];
        }
    }
    public static void print(boolean[] lockers) 
    {
        for (int i = 0; i < lockers.length; i++) 
        {
            if (lockers[i]) 
            {
                System.out.print("L" + (i+1) + " ");
            }
        }
    }
}
