
/**
 * A recursive method is a method that calls itself
 * A recursive method contains at least 1 base case --> what stops the recursion
 * Each recursive call has its own set of local parameters
 * Recursion can be used to traverse objects
 *
 * Melisa Zhang
 * 18/3/22
 */
public class RecursiveTests
{
    public static void main(String[] args)
    {
        /*
         * System.out.println("Print statement, then recursive call");
         * recWithBase(5);
         * System.out.println("\n\nRecursive call, then print statement");
         * recWithBaseStack(5);
         */
        System.out.println(factorialRecursion(5));
        System.out.println(sumOddsToOne(5));
        
        String[] words = {"concise","conspiracy","lamborghini","pyramid","rendezvous","no","soccer"};
        System.out.println(findLetter(words,"r",0));
    }
    public static void stackOverFlow()
    {
        System.out.println("Hello");
        stackOverFlow();
    }
    public static void recWithBase(int x)
    {
        //BaseCase
        if(x>0)
        {
            System.out.println(x);
            recWithBase(x-1);
        }
        else
        {
            System.out.println("BLASTOFF");
        }
    }
    public static void recWithBaseStack(int x)
    {
        //BaseCase
        if(x>0)
        {
            recWithBaseStack(x-1); //recursive call comes before the print statement
            System.out.println(x);
        }
        else
        {
            System.out.println("BLASTOFF");
        }
    }
    public static int factorialRecursion(int f)
    {
        if(f>1)
        {
            return f*factorialRecursion(f-1);
        }
        else
        {
            return 1;
        }
    }
    /**
     * Pre-Condition: the parameter is odd
     * return the sum of all odd numbers from 1 to 'odd'
     */
    public static int sumOddsToOne(int odd)
    {
        if(odd%2==0) //if precondition of odd is removed
        {
            odd--;
        }
        if(odd>0)
        {
            if(odd%2!=0)
            {
                return odd + sumOddsToOne(odd-2);
            }
        }
        return 0;
    }
    /**
     * find the first occurrence of a word that contains the parameter
     * ---You must use substring
     */
    public static String findLetter(String[] arr, String letter, int index)
    {
        if(index<arr.length)
        {
            if(arr[index].indexOf(letter)!=-1)
            {
                return arr[index];
            }
            else
            {
                return findLetter(arr,letter,index+1);
            }
        }
        return "parameter not found";
    }
}
