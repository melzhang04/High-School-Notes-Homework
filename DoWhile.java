
/**
 * Write a description of class DoWhile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DoWhile
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        //int x = 3;
        /*String response;
        do{
            System.out.println("What is your question?");
            String question = scan.nextLine();
            System.out.println("That is a good Question. Do you have another?");
            response = scan.nextLine();
        }
        while(response.equalsIgnoreCase("yes"));//condition to be evaulated
        System.out.println("We have eaten to tootsie pop");
        */
        int x;
        int userSum = 0;
        int totalNums = 0;
        do{
            //the instructions to be completed in the loop
            System.out.println("Please enter an integer:");
            x= scan.nextInt();
            userSum += x;
            totalNums++;
        }
        while(userSum<100);//condition to be evaluated
        System.out.println("The sum has exceeded 100.... it is: " + userSum);
        System.out.println("You entered " + totalNums + " numbers.");
        System.out.println("The average of your entries is: " + userSum/(double)totalNums);
    }
    
    
}
