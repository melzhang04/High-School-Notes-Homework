
/**
 * Write a description of class OddEvenPart1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class OddEvenPart1
{
    public static void main(String[] args)
    {
        System.out.println(496);
        System.out.println(oddEven(496));
        System.out.print(isPerfect(7));
    }
    public static String oddEven(int num)
    {
        boolean isOdd = false;
        if(!(num%2==0))
        {
            isOdd = true;
        }
        return num + " isOdd == " + isOdd;
    }
    public static String isPerfect(int num)
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
            isPerfect= false;
        }
        return num + " isPerfect == " + isPerfect;
    }
}
