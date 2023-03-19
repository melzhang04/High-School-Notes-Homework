
/**
 * Write a description of class ForLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoop
{
    public static void main (String[] args)
    {
        //the syntax for a "for loop"!!

        //for(variable defined; condition to be checked; increment)
        /*
        for(int i = 0;               i <= 5;                 i++)
        {
        System.out.println("for this iteration, i is: " + i);
        }
        //List the 1st 10 multiples of 5
        System.out.println("\n\nThe first 10 multiples of 5 are: ");
        for(int i = 0; i < 10; i++)
        {
        System.out.println((i+1)*5);
        }
        System.out.println("\n\nThe first 10 multiples of 5 are: ");
        for(int i = 5; i <= 50; i+=5)
        {
        System.out.println(i-5);
        }
         */
        for(int i = 5; i>0; i--)
        {
            System.out.println(i);
            wait(2000);
        }
        System.out.println("BLASTOFFFF!!!!");
    }

    public static void wait(int x/*milliseconds*/)
    {
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
        }
    }

    
}
