
/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Armor extends Item implements DefenseCommands
{
    public int defenseValue;
    public  int chanceToBlock;
    public Armor(String name, int value, int durability, int chanceToBlock){
        super(name, value, durability);
        this.defenseValue = defenseValue;
        this.chanceToBlock = chanceToBlock;
    }
    public void breaks(){
        System.out.println("Your armor could not take any more damage and broke apart");
    }
}
