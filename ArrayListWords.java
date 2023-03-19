
/**
 * Write a description of class ArrayListWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ArrayListWords
{
    public static void main(String[] args)
    {
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "alligator"};
        vowels(words);
        chars(words);
        System.out.println("after removing words with 3 chars");
        remove(3,words);
    }
    public static void vowels(String[] w)
    {
        ArrayList<Integer> vowels = new ArrayList<Integer>();
        int counter = 0;
        int max = Integer.MIN_VALUE;
        for(String x: w)
        {
            for(int j=0;j<x.length(); j++)
            {
                if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u')
                {
                    counter++;
                }
                if(counter>max)
                {
                    max = counter;
                }
            }
            vowels.add(counter);
            counter = 0;
        }
        int num = 0;
        for(int i=1;i<max+1;i++)
        {
            counter = i;
            for(int x: vowels)
            {
                if(x==i)
                {
                    num++;
                }
            }
            if(num!=0)
            {
                System.out.println("word with " + i + " vowels = " + num);
            }
            num = 0;
        }
    }
    public static void chars(String[] a)
    {
        ArrayList<Integer> chars = new ArrayList<Integer>();
        int counter = 0;
        int max = 0;
        for(String x: a)
        {
            for(int j=0;j<x.length(); j++)
            {
                counter++;
                if(counter>max)
                {
                    max = counter;
                }
            }
            chars.add(counter);
            counter = 0;
        }
        int num = 0;
        for(int i=1; i<max; i++)
        {
            counter=i;
            for(int x: chars)
            {
                if(x==i)
                {
                    num++;
                }
            }
            if(num!=0)
            {
                System.out.println("word with " + i + " chars = " + num);
            } 
            num = 0;
        }
    }
    public static void remove(int num, String[] word)
    {
        ArrayList<String> list = new ArrayList<String>();
        for(String x: word)
        {
            list.add(x);
        }
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).length()==num)
            {
                list.remove(i);
                i--;
            }
        }
        System.out.print(list);
    }
}

