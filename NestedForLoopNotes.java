
/**
 * Examples and comment notes on NestedForLoopNotes.
 *
 * @Kelley)
 * @
 */
public class NestedForLoopNotes
{
    public static void main (String[] args)
    {
        /**
         * nested for loops are designed as a loop inside of a loop.
         * the outer loop runs, then the inner loop runs through the entirety
         * this process continues until all loops have finished
         * 
         * ******** uncomment the examples to run ********
         */

        /**
         * EXAMPLE to show the order in which the loop runs
         */
    
        for(int i = 0; i < 5; i++) //outer loop
        {
        for (int j = 0; j < 2; j++) //inner loop
        {
        System.out.println("outer" + i + "-inner" + j);
        }
        System.out.println(); //after the inner loop has finished add an empty line for spacing
        }
         

        /**
         * EXAMPLE to show how to loop through different substring of words
         */

        
        String word = "CompSci";
        for(int i = 0; i < word.length(); i++) //outer loop will run for the length of the word times
        {
        for (int j = 0; j < 3; j++) //inner loop will run 3 times 0,1,2
        {
        System.out.print(word.substring(i)); //prints a substring from 0 to the end of the word
        }
        System.out.println(); //after the inner loop has finished add an empty line for spacing
        }
        

        /**
         *  EXAMPLE to make a design with * with inner loop running with respect to outer loop variable
         */
        
        int numTimes = 10;
        for(int i = 1; i < numTimes; i++) //outer loop 
        {
            for (int j = 0; j < i; j++) //inner loop runs based on value of i
            {
                System.out.print("*"); //prints * inner loop number of times
            }
            System.out.println(); //after the inner loop has finished add a line break for spacing
        }
        for(int i = numTimes; i > 0; i--) //outer loop starts at numTImes and works down to >0
        {
            for (int j = 0; j < i; j++) //inner loop runs based on value of i
            {
                System.out.print("*"); //prints * inner loop number of times
            }
            System.out.println(); //after the inner loop has finished add a line break for spacing
        }
        
    }
}
