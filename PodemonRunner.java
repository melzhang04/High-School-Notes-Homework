
/**
 * Write a description of class PodemonRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PodemonRunner
{
    public static void main(String[] args)
    {
        Podemon p1 = new Podemon();
        p1.setName("Pidachu");
        p1.setType("Electric");
        p1.setHp(35);
        p1.setSpeed(75);
        p1.setAccuracy(65);
        p1.setAttack(50);
        p1.setDefense(30);
        p1.setDexNum(1);
        //show infor about our Podemon
        System.out.println(p1);
        System.out.println("\n");
        Podemon p2 = new Podemon("OnionTurtle", "Onion");
        System.out.println(p2);
        System.out.println("\n");
        //construct Podemon ("name", "type", speed, attack, defense, accuracy, hp, dexNum)
        Podemon p3 = new Podemon("EEEEEE", "Alpha", 80,45,20,70,45,3);
        System.out.println(p3);
        System.out.println("\n");
        while(p1.getHp()>0 && p3.getHp()>0)
        {
            p1.fight(p3);
        }
    }
}
