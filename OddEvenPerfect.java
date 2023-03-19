
/**
 * Write a description of class OddEvenPerfect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class OddEvenPerfect
{
    public static void main(String[] args)
    {
        int[] nums = {5,12,9,6,1,4,8,6};
        System.out.println(Arrays.toString(nums));
        System.out.println(odd(nums));
        System.out.println(even(nums));
        int counter = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(perfect(i))
            {
                counter++;
            }
        }
        System.out.print("perfect count = " + counter);
    }
    public static String odd(int[] arr)
    {
        int counter = 0;
        for(int i: arr)
        {
            if(i%2!=0)
            {
                counter++;
            }
        }
        return "odd count = " + counter;
    }
    public static String even(int[] arr)
    {
        int counter = 0;
        for(int i: arr)
        {
            if(i%2==0)
            {
                counter++;
            }
        }
        return "even count = " + counter;
    }
    public static boolean perfect(int num)
    {
        boolean isPerfect = true;
        ArrayList<Integer> div = new ArrayList<Integer>();
        for(int i = 1; i<num; i++)
        {
            if(num%i==0)
            {
                div.add(i);
            }
        }
        int sum = 0;
        for(int k: div)
        {
            sum+=k;
        }
        if(!(sum==num))
        {
            isPerfect = false;
        }
        return isPerfect;
    }
}
