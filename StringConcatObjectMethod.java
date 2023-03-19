
/**
 * Write a description of class StringConcatObjectMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringConcatObjectMethod
{
    public static void main(String[] args)
    {
        Scanner one = new Scanner(System.in);
        System.out.println("Please enter in two words: ");
        StringConcatenation s1 = new StringConcatenation(one.next(), one.next());
    }
}
