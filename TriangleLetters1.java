
/**
 * Write a description of class TriangleLetters1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleLetters1
{
    public static void main(String[] args)
    {
        int n = 4;
        for (int x = 1; x < n; x++)
        {
            for (int A = 0; A < x; A++)
            {
                System.out.print("A");
            }
            System.out.println();
        }
        System.out.println();
        int n2 = 8;
        for (int y = 1; y < n2; y++)
        {
            for (int X = 0; X < y; X++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("R");
        System.out.println();
        int n3 = 7;
        for (int z = 1; z < n3; z++)
        {
            for (int T = 0; T < z; T++)
            {
                System.out.print("T");
            }
            System.out.println();
        }
        System.out.println();
        int n4 = 5;
        for (int a = 1; a < n3; a++)
        {
            for (int W = 0; W < a; W++)
            {
                System.out.print("W");
            }
            System.out.println();
        }
    }
}
