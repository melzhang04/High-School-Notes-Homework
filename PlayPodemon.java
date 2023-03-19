
/**
 * Write a description of class PlayPodemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class PlayPodemon
{
   public static void main(String[] args)
   {
       //parameters for Moves Constructor (String n, String t, int amm, int dmgmult)
       ArrayList<Moves> p1moves = new ArrayList<Moves>();
       p1moves.add(new Moves(10, 15));
       p1moves.add(new Moves(1, 1000));
       p1moves.add(new Moves(400, 7));
       p1moves.add(new Moves(2, 75));
       
       ArrayList<Moves> p2moves = new ArrayList<Moves>();
       p2moves.add(new Moves(11, 11));
       p2moves.add(new Moves(25, 12));
       p2moves.add(new Moves(10, 15));
       p2moves.add(new Moves(30, 15));
       
       Podemon p1 = new Podemon("Shuckle", "Grass", 5, 2000, 10, 230, 90, p1moves);
       Podemon p2 = new Podemon("Smon", "Water", 20, 3000, 25, 35, 90, p2moves);
       
       System.out.println(p1);
       System.out.println("\n\n");
       System.out.println(p2);
       
       Trainer t1 = new Trainer();
       t1.addPodemon(p1);
       t1.addItem(new Item());
       Trainer t2 = new Trainer();
       t2.addPodemon(p2);
       
       
   }
}
