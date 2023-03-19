
/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review
{
    private final double DESIREDGRADE = 100;
    private String testDay;
    private int numberOfQuestions;
    private boolean confident;
    private String subject;
    public Review()
    {
        testDay = "tomorrow";
        numberOfQuestions = 00;
        confident = false;
    }
    public Review(String t, int n, boolean c, String s)
    {
        testDay = t;
        numberOfQuestions = n;
        confident = c;
        subject = s;
    }
    public String getTestDay()
    {
        return testDay;
    }
    public int getNumberOfQuestions()
    {
        return numberOfQuestions;
    }
    public boolean getConfident()
    {
        return confident;
    }
    public String getSubject()
    {
        return subject;
    }
    public void setTestDay(String t)
    {
        testDay = t;
    }
    public void setNumberOfQuestions(int n)
    {
        numberOfQuestions = n;
    }
    public void setConfident(boolean c)
    {
        confident = c;
    }
    public void setSubject(String s)
    {
        subject = s;
    }
    public String toString()
    {
        return "Subject: " + subject + "\nThe test day is: " + testDay + "\nand there are " + numberOfQuestions + " questions on the test." + "\nMy desired grade is: " + DESIREDGRADE + ".\nAm I confident: " + confident;
    }
}
