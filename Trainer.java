
/**
 * Write a description of class Trainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Trainer
{
    private int level;
    private int wins;
    private int losses;
    private double money;
    //private ArrayList<Podemon> lineup;
    private ArrayList<Podemon> trainerList;
    private String name;
    private ArrayList<Item> items;
    public Trainer()
    {
        items = new ArrayList<Item>();
        trainerList = new ArrayList<Podemon>();
        level(); //assign a random level
        name(); // assign a random name
        
        
    }
    public void setLevel(int n)
    {
        level = n;
    }
    public int getLevel()
    {
        return level;
    }
    public void setWins(int n)
    {
        wins = n;
    }
    public int getWins()
    {
        return wins;
    }
    public void setLosses(int n)
    {
        losses = n;
    }
    public int getLosses()
    {
        return losses;
    }
    public void setMoney(double n)
    {
        money = n;
    }
    public double getMoney()
    {
        return money;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void lineup()
    {
        
    }
    public void name()
    {
        String[] trainerNames = {"Misty", "Brock", "May", "Dawn", "Iris", "Chloe", "Clemont"};
        name = trainerNames[((int)(Math.random()*trainerNames.length))];
    }
    public void level()
    {
        level = (int)(Math.random()*10);
    }
    public void addTtem(Item i)
    {
            items.add(i);
    }
    public void addPodemon(Podemon p)
    {
        trainerList.add(p);
    }
    public ArrayList<Podemon> getTrainerList()
    {
        return trainerList;
    }
}




