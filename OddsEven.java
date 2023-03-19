
/**
 * Write a description of class OddsEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class OddsEven
{
    public static void main(String[] args)
    {
        int[] testData1 = {2,4,6,8,10,12,14};
        int[] testData2 = {1,2,3,4,5,6,7,8,9};
        int[] testData3 = {2,10,2021,23,24,40,55,60,61};
        System.out.println(Arrays.toString(odd(testData1)));
        System.out.println(Arrays.toString(even(testData1)));
    }
    public static int[] odd(int[] arr)
    {
        int oddcounter = 0;
        for(int n: arr)
        {
            if(n%2 != 0)
            {
                oddcounter++;
            }
        }
        int[] odds = new int[oddcounter];
        int oddplace = 0;
        for(int x: arr)
        {
            if(x%2 != 0)
            {
                odds[oddplace] = x;
                oddplace++;
            }
        }
        return odds;
    }
    public static int[] even(int[] arr)
    {
        int evencounter = 0;
        for(int n: arr)
        {
            if(n%2 == 0)
            {
                evencounter++;
            }
        }
        int[] evens = new int[evencounter];
        int evenplace = 0;
        for(int x: arr)
        {
            if(x%2 == 0)
            {
                evens[evenplace] = x;
                evenplace++;
            }
        }
        return evens;
    }
}

