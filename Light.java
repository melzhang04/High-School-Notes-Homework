
/**
 * Write a description of class Light here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Light
{
    private String color;
    private boolean isOn;
    private int watts;
    
    //we created a final variable (constant) that will describe he shape of our light
    //final variable names are written with all CAPS
    private final String SHAPE = "Oval";

    /**
     * Constructor for objects of class Light
     */
    public Light(String color, int watts)
    {
        // initialise instance variables
        //the default boolean value is false so each instnace will be off upon creation
        //if you use the same parameter name as the instance variable, you must use "this" keyword
        this.color = color;
        this.watts = watts;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getColor()
    {
        // put your code here
        return color;
    }
    public int getWatts()
    {
        return watts;
    }
    public boolean getIsOn()
    {
        return isOn;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setWatts(int w)
    {
        watts = w;
    }
    public void setIsOn(boolean b)
    {
        isOn = b;
    }
    public void compareWattage(Light otherLight)
    {
        //lightOne.compareWattage(lightTwo);
        //implicitParameter.compareWattage(expicitParameter);
        
        if(this.getWatts()>otherLight.getWatts())
        {
            System.out.println("The light with " + this.getWatts() + " is greater than the light with " + otherLight.getWatts() + " watts.");
        }
        else
        {
            System.out.println("The light with " + otherLight.getWatts() + " is greater than the light with " + this.getWatts() + " watts.");
        }
    }
    //override the toString method to make it do what fits our object
    public String toString()
    {
       return "The light is " + this.getColor() + ", it has " + getWatts() + " watts, and it's status is " + isOn;
    }
    
}
