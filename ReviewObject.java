
/**
 * Write a description of class ReviewObject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReviewObject
{
    public static void main(String[] args)
    {
        Review test1 = new Review();
        Review test2 = new Review("Friday", 45, true, "AP Macro");
        Review test3 = new Review();
        test1.setTestDay("Monday");
        test1.setNumberOfQuestions(35);
        test1.setConfident(false);
        test1.setSubject("AP CompSci");
        
        System.out.println(test1);
        System.out.println("\n");
        System.out.println(test2);
        System.out.println("\n");
        System.out.println(test3);
    }
}
