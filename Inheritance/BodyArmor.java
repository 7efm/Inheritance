
/**
 * Write a description of class BodyArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BodyArmor extends Armor
{
    private boolean worn;
    public BodyArmor(String name, int value, int durability, int chanceToParry){
        super(name, value, durability, chanceToParry);
    }
    public boolean blocked(){
        int rand = (int)(Math.random()*100) + 1;
        if(rand <= chanceToBlock){
            System.out.println("Your " + name + " armor blocked the attack!");
            return true;
        }
        return false;
    }
}
