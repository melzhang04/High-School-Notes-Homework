
/**
 * Write a description of class Groups here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Groups
{
public static void main(String[] args)
{
        int[] sample = {1,1,1,2,1,1,3,3,3,3,3,3,3,3,3,3,4,4,4,5,4,4,4,6};
        System.out.println(Arrays.toString(sort(sample)));
        int[] groups = new int[7];
        int size = 1; 
        int num = 1; 
        for (int i = 1; i < sample.length; i++) 
        {
            if (sample[i] == sample[i-1]) 
            {
                size++;
                if (size == 5)
                {
                groups[0] = size;
                }
                if (size == 3) 
                {
                    groups[2] = size; 
                    groups[5] = size; 
                }
                if (size == 4) 
                {
                    groups[3] = size; 
                }
                if (size == 2) 
                {
                    groups[4] = size; 
                }
                if (size ==8) 
                {
                    groups[6] = size; 
                }
            }

            else if (sample[i] != sample[i-1]) 
                {
                    num++;
                    size = 1;
                    if (size == 1) 
                    {
                        groups[1] = size;
                    }  
                } 
        }
    int group_one = 0; 
    int group_two = 0; 
    int group_three = 0; 
    int group_four = 0; 
    int group_five = 0; 
    int group_six = 0; 
    int group_one_final = 0;
    for (int i = 0; i <groups.length; i++) {
        if (groups[i] == 5) {
            group_five++; 
            group_two++;
            group_three++;
            group_four++;

        }
        if (groups[i] == 1) {
            group_one++; 
            group_one_final = group_one + num; 
        }
        if (groups[i] == 3) {
            group_three++; 
            group_two++;
        }
        if (groups[i] == 4) {
            group_four++;
            group_two++;
            group_three++;

        }
        if (groups[i] == 8) {
            group_six++; 
            group_two++; 
            group_three++;
            group_four++;
            group_five++;
        }
        if (groups[i] == 2) {
            group_two++; 

        }
    }
    System.out.println("size 1 count == " + group_one_final);
    System.out.println("size 2 count == " + group_two);
    System.out.println("size 3 count == " + group_three );
    System.out.println("size 4 count == " + group_four);
    System.out.println("size 5 count == " + group_five);
    System.out.println("size 6 count == " + group_six);
}
 public static int[] sort(int[] sample)
{
    Arrays.sort(sample);
    return sample;
}
}   

