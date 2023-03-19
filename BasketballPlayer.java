
/**
 * This class is the template used to create all instances of Basketball Players
 *
 * Melisa Zhang
 * 8/25/21
 */
public class BasketballPlayer
{
    /**
     * instance variables: represent the state of characteristics of each instance.
     * instance of a class: Specific creation on an object
     * these instance variables will have a data type(int, double, boolean) 
     * and store values
     * 
     * ALL INSTANCE VARIABLES MUST BE DECLARED PRIVATE!
     * 
     * if instance variables are not defined, Java automatically give them default values
     * 
     */
    //default values for primatives and reference variables
    private double weight;          // a double has a default value of 0.0
    private double heightInMeters;  
    private double pointsPerGame;   
    private String name;            // a String has a default value of null
    private int age;                // an int has a default value of 0
    private boolean retired;        // a boolean has a default value of false
    
    // the key word "static" means that there is only 1 variable and no copies are made!!
    // all references to the static variable go to the same location
    private static int howManyPlayers;
    
    /**
     * Constructor for objects of class BasketballPlayer
     * 
     * The constructor defines what happens to an object at the time of creation.
     * A constructor functions just like a method, but has the SAME NAME as the class
     */
    public BasketballPlayer() // the default constructor accepts NO parameters
    {
        // initialise instance variables
        howManyPlayers++;
        name = "the nameless one";
        weight = 200;
        
    }
    //we will create another constructor using a concept called Overloading
    public BasketballPlayer(String n, int a) // this is a specific constructor
    // Basketballplayer player23 = new BasketballPlayer("Nate", 22);
    {
        howManyPlayers++;
        name = n;
        age = a; 
    }
    public BasketballPlayer(String n, double ppg, double w, int a)
    //BasketballPlayer x = new BasketballPayer("Susie", 21.7, 154, 25);
    {
        howManyPlayers++;
        name = n;
        pointsPerGame = ppg;
        weight = w;
        age = a;
    }
    /**
     * We are going to create "getter" (accessor)  methods that will allow 
     * us to access the instance variables
     * getter methods should be created as return methods so that data can 
     * be used in another class
     * 
     * Notice that methods in the blueprint class are not declared static
     */
    public static int getPlayerCount()
    {
        return howManyPlayers;
    }
    
    public String getName()
    {
        // this will access and return the name that has been assigned to our instance
        return name;
    }
    public double getWeight()
    {
        //this will accesss and return the weight that has been assigned to our instance
        return weight;
    }
    public double getHeightInMeters()
    {
        //this will access and return the height in meters that has been assigned to our instance
        return heightInMeters;
    }
    public double getPointsPerGame()
    {
        //this will access and return the points per game that has been assigned to our instance
        return pointsPerGame;
    }
    public double getAge()
    {
        //this will access and return the age that has been assigned to our instance
        return age;
    }
    /**
     * Next we will create "setter" (mutator) that will allow us to change the data associated with our Basketball Players
     * 
     * Setter methods will be created as void and will assign parameters to our instance variables
     */
    public void setName(String n)
    {
        name = n;
    }
    public void setWeight(double w)
    {
        weight = w;
    }
    public void setHeightInMeters(double h)
    {
        heightInMeters = h;
    }
    public void setPointsPerGame(double p)
    {
        pointsPerGame = p;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public String playerInfo()
    {
        return name + "'s age is: " + age + "\nTheir PPG is: " + pointsPerGame + "\nHeight: " + heightInMeters + " Meters" + "\nWeight: " + weight + " lbs.";
    }
    
}
