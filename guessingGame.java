
/**
 * Write a description of class guessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class guessingGame
{
    public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       boolean stop = false;
       while (stop == false)
       {
           System.out.println("Guessing Game -- how many numbers?");
           int numbers = s.nextInt();
           System.out.println("Enter a number between 1 and " + numbers);
           double right = (int)(Math.random() * numbers) + 1;
           int guess = s.nextInt();
           int counter = 1;
           while(guess != right)
           {
               System.out.println("Enter a number between 1 and " + numbers);
               guess = s.nextInt();//this makes a guess that you dont compare until the if else has run
               counter++;
               if (guess > numbers || guess <= 0)
               {
                   counter++;
                   System.out.println("Number out of range! Guess Again");
                   guess = s.nextInt();
               }
               /*
               else
               {
                   counter++;
                   guess = s.nextInt(); //this guesses again even though you have guessed once already
               }
               */
           }
           //counter++;
           System.out.println("It took " + counter + " guesses to guess " + right);
           System.out.println("You guessed right " + 1.0/counter*100 + " percent of the time.");
           System.out.println("Do you want to play again? (y/n)");
           String yn = s.next();
           if (yn.equals("n"))
           {
               stop = true;
           }
           else
           {
               stop = false;
           }
       }
   }
}
