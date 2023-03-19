
/**
 * Write a description of class Monster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monster
{
    private String name;
    private int size;

    public Monster(String name, int size)
    {
        this.name = name;
        this.size = size;
    }
    public String getName()
    {
        return name;
    }
    public int getSize()
    {
        return size;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setSize(int s)
    {
        size = s;
    }
    public void compareSize(Monster Monster2)
    {
        if(this.getSize()>Monster2.getSize())
        {
            System.out.println("Monster One's bigger than Monster Two.");
        }
        else if(this.getSize()==(Monster2.getSize()))
        {
            System.out.println("Monster One's size is equal to Monster Two's size.");
        }
        else
        {
            System.out.println("Monster One is smaller than Monster Two.");
        }
    }
    public String toString()
    {
        return name + " and " + size;
    }
}
