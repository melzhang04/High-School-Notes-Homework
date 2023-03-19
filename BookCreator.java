
/**
 * Write a description of class BookCreator here.
 *
 * Melisa Zhang
 * 8/26/21
 */
public class BookCreator
{
    public static void main (String[] args)
    {
        Books book1 = new Books();
        
        book1.setName("Harry Potter and the Goblet of Fire");
        book1.setPages(636);
        book1.setWords(190637);
        book1.setTimeToReadInHours(12.5);
        System.out.println(book1.bookInfo());
    }
}
