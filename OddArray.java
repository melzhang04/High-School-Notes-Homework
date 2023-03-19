
/**
 * Write a description of class OddArray here.
 *
 * Mr. Lewis
 * 9/22/2017
 */

import java.util.*;

public class OddArray
{
   // I am going to run all the methods in the main method
  
    public static void main(String[] args)
    {
       int[] numArray = { 1,3,5,7,9,11,13,15,17,19,20};
       int odds = 0; 
       int evens = 0;
       for(int i: numArray)
       {
           if(i % 2 == 1)
           odds++;
           if(i % 2 == 0)
           evens++;
        }
        int[] oddArray = new int[odds];
        int[] evenArray = new int[evens];
        int oddPlace = 0;
            int evenPlace = 0;
        for(int x: numArray)
        {
            if(x % 2 == 1)
            {
                oddArray[oddPlace] = x;
                oddPlace++;
            }
            if(x % 2 == 0)
            {
                evenArray[evenPlace] = x;
                evenPlace++;
            }
        }
        System.out.println("Odds - " + Arrays.toString(oddArray));
        System.out.println("Evens - " + Arrays.toString(evenArray));      
        }
    
    /* //makeArray is going to create the array
     public static int[] makeArray()
     {
         int[] numArray = { 12, 23, 7, 26, 9, 15, 4, 22};
         return numArray;
      }
      
      //oddsNums & evenNums are going to count the odds and evens in the array
      public static int oddNums(int[] original)
      {
          int odds = 0;
          for(int i: original)
          { if(i % 2 == 1)
              odds++;
            }
            return odds;
        }
        public static int evenNums(int[] original)
      {
          int evens = 0;
          for(int i: original)
          { if(i % 2 == 0)
              evens++;
            }
            return evens;
        }
        
        //buildArrays will take the odds and evens of the original array and put them into the new arrays
        public static void buildArrays(int [] original)
        {
            for (int x: original)
            {
                if(x % 
        }*/
}
