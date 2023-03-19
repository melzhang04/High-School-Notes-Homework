
/**
 * Items that boost Podemons stats or heal them.
 *
 * @Noah and Martin and Caleb
 * @1/13/22
 */
public class Item
{
    private String name;
    private int healingAmount;
    private int accuracyAmount;
    private int speedAmount;
    private int attackAmount;
    private int defenseAmount;
    private boolean isCure;
    private boolean isLevelUp;
    private boolean isEscape;
    private final int USES = 5;
    private int timesUsed;
    public Item()
    {
        
    }
    public Item(String n, int heal, int acc, int speed, int attack, int def, boolean cure, boolean level, boolean escape, int uses)
    {
        name = n;
        healingAmount = heal;
        accuracyAmount = acc;
        speedAmount = speed;
        attackAmount = attack;
        defenseAmount = def;
        isCure = cure;
        isLevelUp = level;
        isEscape = escape;
        //USES = uses;
        timesUsed = 0;
    }
    /**
     * If the item has a use left it increments the timesUsed varaiable and applys all it's benefits on a podemon
     * returns true if isEscape == true and there is a use left
     */
    public boolean use(Podemon p)
    {
        if (timesUsed < USES)
        {
            p.setHP(p.getHP() + healingAmount);
            p.setAccuracy(p.getAccuracy() + accuracyAmount);
            p.setSpeed(p.getSpeed() + speedAmount);
            p.setAttack(p.getAttack() + attackAmount);
            p.setDefense(p.getDefense() + defenseAmount);
            timesUsed++;
            if(isCure)
            {
                //code to clear any potential status effects on podemon
            }
            if(isLevelUp)
            {
                //code to add a level to a podemon
            }
            return isEscape;
        }
        return false;
    }
    //setters
    public void setName(String i) {name = i;}
    public void setHealingAmount(int i) {healingAmount = i;}
    public void setAccuracyAmount(int i) {accuracyAmount = i;}
    public void setSpeedAmount(int i) {speedAmount = i;}
    public void setAttackAmount(int i) {attackAmount = i;}
    public void setDefenseAmount(int i) {defenseAmount = i;}
    public void setIsCure(boolean i) {isCure = i;}
    public void setIsLevelUp(boolean i) {isLevelUp = i;}
    public void setIsEscape(boolean i) {isEscape = i;}
    public void setTimesUsed(int i) {timesUsed = i;}
    //getters
    public String getName() {return name;}
    public int getHealingAmount() {return healingAmount;}
    public int getAccuracyAmount() {return accuracyAmount;}
    public int getSpeedAmount() {return speedAmount;}
    public int getDefenseAmount() {return defenseAmount;}
    public boolean getIsCure() {return isCure;}
    public boolean getIsLevelUp() {return isLevelUp;}
    public boolean getIsEscape() {return isEscape;}
    public int getUSES() {return USES;}
    public int getTimesUsed() {return timesUsed;}
}
