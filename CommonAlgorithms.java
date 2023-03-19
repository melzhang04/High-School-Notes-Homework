
/**
 * Write a description of class CommonAlgorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class CommonAlgorithms
{
    public static void main (String[] args)
    {
        /*int[] nums = {3, 6, 8, 23, 15, 7, 56};
        double[] decimals = {3.5, 9.9, 12, 2.4, 14, 2.1, 3.5, 10};
        String[] words = {"Hello!", "CompSci", "fred", "test", "holidays"};

        String[] longestWords = longestWord(words);
        int len = longestWords.length;
        if(len == 1)
        {
            System.out.println("The longest word in the Array is: "+Arrays.toString(longestWords));
        }
        else{
            System.out.println("There are " +len+ " \"biggest\" words in the Array that have the same length. ");
            System.out.println("The longest words are: "+Arrays.toString(longestWords));
        */
        double[] decimals = {2.2, 4.5, 1.9,8.7, 1.025, 4.53};
        double[] prime = {3,5,7,11,13,17,19};
        System.out.println(containsPrime(prime));
        System.out.println(consecutivePrime(prime));
        /*int[] nums = {7,8,2,4,12,0,-3};
        String[] words = {"hello", "abc123"};
        System.out.println(countLetters(words));
        System.out.println(Arrays.toString(decimals));
        System.out.println("The  smallest number in the array is: " + findMin(decimals));
        
        System.out.println(Arrays.toString(nums));
        System.out.println("The largest number in the array is: " + findMax(nums));
        */
        }
    public static int[] countLetters(String[] s)
    {
        int[] bothNums = new int[2];
        int letterCounter = 0;
        int nonLetterCounter = 0;
        for (String str: s)
        {
            for(int i = 0; i<str.length(); i++)
            {
                if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122)
                {
                    letterCounter++;
                }
                else
                {
                    nonLetterCounter++;
                }
            }
        }
        bothNums[0] = letterCounter;
        bothNums[1] = nonLetterCounter;
        return bothNums;
    }
    public static double findMin(double[] arr)
    {
        double min = Double.MAX_VALUE;
        //for: each loop
        for (double d: arr)
        {
            if (d<min)
            {
                min = d;
            }
        }
        return min;
    }
    
    public static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static double computeSum(double[] arr)
    {
        double sum = 0.0;
        for(double m: arr)
        {
            sum += m;
        }
        return sum;
    }

    public static double computeAverage(double[] arr)
    {
         return computeSum(arr)/arr.length;
    }

    public static boolean containsPrime(double[] arr)
    {
        boolean b = true;
        int counter = 0;
        for (int i = 0; i<arr.length; i++)
        {
            counter++;
            if (arr[i] % counter == 0)
            {
                b = false;
            }
            else
            {
                b = true;
            }
        }
        return b;
    }

    public static boolean isIncreasing(double[] arr)
    {
        boolean increase = false;
        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i+1]>arr[i])
            {
                increase = true;
            }
            else
            {
                increase = false;
            }
        }
        return increase;
    }

    public static boolean consecutivePrime(double[] arr)
    {
        boolean p = false;
        int counter = 0;
        for (int i = 0; i< arr.length-1; i++)
        {
            counter++;
            if (arr[i] % counter != 0)
            {
                if(arr[i+1] > arr[i])
                {
                    p = true;
                }
            }
        }
        return p;
    }

    public static boolean isDoubleUp(double[] arr)
    {
        boolean dubs = false;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i+1] == 2*arr[i])
            {
                dubs = true;
            }
        }
        return dubs;
    }

    public static int moreThanFourLetters(String[] words)
    {
        int counter = 0;
        for (String str: words)
        {
            for(int i = 0; i<str.length(); i++)
            {
                if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122)
                {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static String[] longestWord(String[] words)
    {
        int longest = Integer.MIN_VALUE;
        int howMany = 0;
        for(String s: words)
        {
            if(s.length() > longest)
            {
                longest = s.length();
            }
        }
        for(String s: words)
        {
            if(s.length() == longest)
            {
                howMany++;
            }
        }
        String[] longWords = new String[howMany];
        int index = 0;
        for(String s: words)
        {
            if(s.length() == longest)
            {
                longWords[index]=s;
                index++;
            }
        }   
        return longWords;
    }

    public static int[] reverseArray(int[] nums)
    {
        return null;
    }
    
}
