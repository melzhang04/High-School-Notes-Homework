
/**
 * Write a description of class HowManyHistogram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class HowManyHistogram
{
    public static int[] random(int arr)
    {
        int[] nums = new int[arr];
        for(int i = 0; i<arr; i++)
        {
            nums[i] = (int)(Math.random()*9+1);
        }
        return nums;
    }
    public static int[] ten(int[] random)
    {
        int[] size = new int[10];
        Arrays.sort(random);
        for(int i:random)
        {
            size[i] = i;
        }
        return random;
    }
    public static void print(int[] random)
    {
        int[] histogram = new int[10];
        int counter = 0;
        for (int i: random)
        {
            System.out.println(histogram[counter] + "-" + random[i]);
            counter++;
        }
    }
    public static void main(String[] args)
    {
        int[] test = {1,5,3,4,5,5,5,4,3,2,5,5,5,3};
        print(test);
    }
}
