
/**
 * Write a description of class Books here.
 *
 * Melisa Zhang
 * 8/26/21
 */
public class Books
{
    // instance variables - replace the example below with your own
    private int pages;
    private String name;
    private int words;
    private double timeToReadInHours;
    public Books()
    {
        // initialise instance variables
    }
    public int getPages()
    {
        return pages;
    }
    public String getName()
    {
        return name;
    }
    public int getWords()
    {
        return words;
    }
    public double getTimeToReadInHours()
    {
        return timeToReadInHours;
    }
    public void setPages(int p)
    {
        pages = p;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setWords(int w)
    {
        words = w;
    }
    public void setTimeToReadInHours(double t)
    {
        timeToReadInHours = t;
    }
    public String bookInfo()
    {
        return "This book is named: " + name + "\nand, it is " + pages + " pages long.\nIt also has " + words + " words in it.\nOn average, it will take " + timeToReadInHours + " hours to read it.";
    }
}
