
/**
 * Write a description of class LightHouse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LightHouse
{
   public static void main (String[] args)
   {
       Light lOne = new Light("white", 60);
       Light lTwo = new Light("red", 100);
       Light lThree = new Light("purple", 90);
       
       System.out.println(lOne.getWatts());
       //System.out.println(lOne.getColor());
       //System.out.println(lOne.getIsOn());
       //lOne.compareWattage(lTwo);
    
       //lThree.compareWattage(lOne);
       
       System.out.println(lOne);
       
   }
}
