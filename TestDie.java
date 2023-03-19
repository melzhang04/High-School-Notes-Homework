
/**
 * Write a description of class TestDie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestDie
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        d1.setRigged(true);
        for(int i = 0;i<10;i++)
        {
            d1.rollDie();
            d1.showDie();
        }
    }
}
