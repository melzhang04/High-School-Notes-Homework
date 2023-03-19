 


 description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Fibonacci
{
    public static void main(String[] args)
    {
        arr(10);
        int[] seq = new int[];
        //System.out.println(ret(, 4));
    }
    public static void arr(int size)
    {
        int[] seq = new int[size];
        seq[0]=1;
        seq[1]=1;
        for(int j=2; j<seq.length; j++)
        {
            seq[j] = seq[j-1] + seq[j-2];
            System.out.println(seq[j]);
        }
    }
    public static int ret(int[] seq, int place)
    {
        if(place<= seq.length && place >=0)
        {
            return seq[place];
        }
        return -1;
    }
}
