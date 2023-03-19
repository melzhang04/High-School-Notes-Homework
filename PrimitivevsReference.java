
/**
 * Write a description of class PrimitivevsReference here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class PrimitivevsReference
{
    public static void main(String[] args)
    {
        /*int x = 5;
        System.out.println(x); //prints 5
        //primitive data types are passed by their value!!!!!!
        System.out.println(addThree(x)); //passes x into the method, which prints 13;
        
        System.out.println(x); //prints 5
        
        //Strings are also passed to methods by their value!!!!!!
        String str = "hello";
        System.out.println(str); //prints hello
        addGoodbye(str); //passes str into the method
        System.out.println(str); //prints hello
        */
        int[] testArr = new int[5];
        int[] copyOfTest = Arrays.copyOf(testArr, testArr.length);
        System.out.println(Arrays.toString(testArr));
        editArray(testArr);
        System.out.println(Arrays.toString(testArr));
    }
     public static void editArray(int[] param)
    {
        param[2] = 5;
        param[3] = 12;
    }
    public static void addGoodbye(String s)
    {
        s+= "goodbye";
    }
    public static int addThree(int num)
    {
        num+=8;
        return num;
    }
    public static void checkStringLocation(String s)
    {
        System.out.println(s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));
    }
}
