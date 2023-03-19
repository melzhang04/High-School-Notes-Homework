
/**
 * Write a description of class Moves here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Moves
{
    private String name;
    private String type;
    private String status;
    private int ammo;
    private int basedmg;
    private int dmgmultiplier;
    private int dmg;
    private final String[][] Moves = {{"Cry","bubbly","watertackle","WaterBoard"},{"firestorm","Andy","DeathMetal","FlaminHotCheetos"},{"lawnmower","flytrap","Poison", "Chloraphorm"}};
    
    public Moves()
    {
        
    }
    public Moves(int amm, int dmgmult)
    {
        int moveType = (int)(Math.random()*Moves.length);
        name = Moves[(int)Math.random()*Moves.length][(int)Math.random()*Moves[0].length];
        if(moveType==0)
        {
            type = "Water";
        }
        else if(moveType==1)
        {
            type = "Fire";
        }
         else
        {
            type = "Grass";
        }
        ammo = amm;
        dmgmultiplier = dmgmult; 
        status = "N/A";
        
    }
    public double ftype(Podemon p2){
        switch(p2.getType()){
            case "Fire":
                switch(this.getType()){
                    case "Water":
                        return .75;
                    case "Grass":
                        return 2;
                    case "Fire":
                        return 1.25;
                }
            case "Water":
                switch(this.getType()){
                    case "Fire":
                        return 2;
                    case "Grass":
                        return .75;
                    case "Water":
                        return 1.25;
                }
            case "Grass":
                switch(this.getType()){
                    case "Water":
                        return 2;
                    case "Fire":
                        return .75;
                    case "Grass":
                        return 1.25;
                }
                default: return 0.0;
        }
   
    }

    public void findDMG(Podemon p2)
    {
        dmg = basedmg*dmgmultiplier;
        dmg *=this.ftype(p2);
    }

    //setters
    public void setName(String s)
    {
        name = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setStatusEffect(String s)
    {
        status = s;
    }

    public void setAmmo(int i)
    {
        ammo = i;
    }

    public void setBaseDMG(int i)
    {
        basedmg = i;
    }

    public void setDMGMult(int i)
    {
        dmgmultiplier = i;
    }

    public void setDMG(int i)
    {
        dmg = i;
    }

    //getters
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public String getStatusEffect()
    {
        return status;
    }

    public int getAmmo()
    {
        return ammo;
    }

    public int getBaseDMG()
    {
        return basedmg;
    }

    public int getDMGMult()
    {
        return dmgmultiplier;
    }

    public int getDMG()
    {
        return dmg;
    }
}
