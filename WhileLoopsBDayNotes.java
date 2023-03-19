
/**
 * Write a description of class WhileLoopsBDayNotes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileLoopsBDayNotes
{
    public static void main(String[] args)
    {
        int counter = 0;
        while (counter<5)
        {
            sayHello();
            System.out.println(counter);
            counter++; //the loop stops when we increment to 5
        }
        System.out.println("The loop is complete");
    }
    public static void sayHello()
    {
        System.out.println("Hello");
    }
}
