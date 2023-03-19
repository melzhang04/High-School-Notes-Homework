
/**
 * Write a description of class Conditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conditionals
{
    public static void main (String[] args)
    {
        boolean t = true;
        if(t)
        {
            System.out.println("The condition is true!");
        }
        else{
            System.out.println("The condition is false!");
        }
        
        boolean t2 = true;
        boolean f = false;
        boolean f2 = false;
        if(f && f2)
        {
            System.out.println("Both conditions are true!");
        }
        else if(f || f2)
        {
            System.out.println("Only one of the conditions is true!");
        }
        else{
            System.out.println("Both conditions are false!");
        }
        
        int isItPrime = 23;
        
        if(isPrime(isItPrime))
        {
            System.out.println(isItPrime + " is prime!!");
        }
        else{
            System.out.println(isItPrime + " is NOT prime!!");
        }
        
        listAllPrimes(100);
    }
    
    public static boolean isPrime(int num)
    {
        for (int i = 2; i<= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void listAllPrimes(int x)
    {
        System.out.println("Here is a list of all prime numbers up to " +x);
        for (int i = 2; i <= x; i++)
        {
            if (isPrime(i))
            {
                System.out.println("PRIME: " + i);
            }
        }
        
    }
}
