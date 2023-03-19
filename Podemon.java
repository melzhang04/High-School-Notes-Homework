
/**
 * Write a description of class pokeman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.ArrayList;

public class Podemon
{
    private String name;
    private String type;
    private int speed;
    private int hp;
    private int attack;
    private int defense;
    private int accuracy;

    private  ArrayList<Moves> moves ;
    //need to make undefined constructor for runner class
    public Podemon()
    {
        for(int i = 0; i<4; i++){
            moves.add(new Moves());

        }
    }

    public Podemon(String n, String t)
    {
        name =n;
        type=t;
        for(int i = 0; i<4; i++){
            moves.add(new Moves());

        }
    }//cannot use same kind of constructor
    public Podemon(String n, String t, int s, int hp, int a, int d, int acc, ArrayList<Moves> bruh)
    {
        moves = new ArrayList<Moves>();
        name=n;
        type=t;
        speed=s;
        this.hp=hp;
        attack=a;
        defense=d;
        accuracy=acc;
        for(int i = 0; i<4; i++){
            moves.add(bruh.get(i));

        }
    }

    public String toString()
    {
        return "This pokeman is named:" + 
        getName() +"\ntype:" +
        getType() + "\nspeed:" + getSpeed()+
        "\nhp:" + getHP() + 
        "\nattack:" + getAttack() +
        "\ndefense:"+ getDefense() + 
        "\naccuracy:" + getAccuracy();

    }

    public void fight(Podemon obj)
    {System.out.println("Now Kill Each Other!!!");
        System.out.println(getName()+ ":" + getHP());
        System.out.println(obj.getName()+ ":" + obj.getHP());

        int[] totalAttack=new int [getAttack() + obj.getAttack()];
        int damageDoneByOne=Math.abs(getAttack()-obj.getDefense());
        int damageDoneByTwo=Math.abs(getAttack()-obj.getDefense());
        for( int i=0;i<getAttack();i++)
        {
            totalAttack[i]=1;
        }for( int k=getAttack(); k<totalAttack.length;k++)
        {
            totalAttack[k]=1;
        }
        int winner=totalAttack[(int)(Math.random()*totalAttack.length)];
        if (winner ==1)
        {
            obj.setHP(obj.getHP()-damageDoneByOne);

        }
        else {
            setHP(getHP()-damageDoneByTwo);
        }
        System.out.println("Aftermath");
        System.out.println(getName()+ ":" + getHP());
        System.out.println(obj.getName()+ ":" + obj.getHP());

    }

    public  void setMoves(int i,String n, String t, int amm, String dmgmult){
        moves.get(i).setName(n);
        moves.get(i).setType(t);
        moves.get(i).setAmmo(amm);
        moves.get(i).setStatusEffect(dmgmult);
    }

    public ArrayList<Moves> getMoves(){
        return moves;
    }

    public void setName(String n)
    {
        name=n;  
    }

    public void setMoves(ArrayList<Moves> m)
    {
        moves=m;
    }

    public void setType(String t)
    {
        type=t;
    }

    public void setSpeed(int s)
    {
        speed=s;
    }

    public void setHP(int h)
    {
        hp=h;
    }

    public void setAttack(int a)
    {
        attack=a;
    }

    public void setDefense(int d)
    {
        defense=d;
    }

    public void setAccuracy(int aim)
    {
        accuracy=aim;
    }

    public ArrayList<Moves> getMoves2()
    {
        return moves;
    }

    public String getType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getAttack()
    {
        return attack;
    }

    public int getDefense()
    {
        return defense;
    }

    public int getAccuracy()
    {
        return accuracy;
    }

    public int getHP()
    {
        return hp;
    }

}
