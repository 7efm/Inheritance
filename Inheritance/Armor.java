
/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Armor extends Item implements DefenseCommands
{
    protected int defenseValue;
    protected int chanceToBlock;
    public Armor(String name, int value, int durability, int chanceToBlock){
        super(name, value, durability);
        this.defenseValue = defenseValue;
        this.chanceToBlock = chanceToBlock;
    }
    public void breaks(){
    
    }
}
