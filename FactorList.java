 


/**
 * Write a description of class FactorList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class FactorList
{
    public static void main(String[] args)
    {
        System.out.print(getListOfFactors(100));
    }
    public static ArrayList<Integer> getListOfFactors(int num)
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i = num; i>0;i--)
        {
            if(num%i==0)
            {
                factors.add(i);
            }
        }
        Collections.sort(factors);
        factors.remove(factors.indexOf(num));
        return factors;
    }
}
