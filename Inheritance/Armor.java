
/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Armor extends Item implements DefenseCommands
{
    protected int defenseValue;
    public Armor(String name, int value, int durability){
        super(name, value, durability);
        this.defenseValue = defenseValue;
    }
    public void breaks(){
    
    }
    
}
