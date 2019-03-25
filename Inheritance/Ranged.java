
/**
 * Abstract class Ranged - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Ranged extends Weapon
{
    protected int range;
    public Ranged(String name, int value, int durability, int range){
        super(name, value, durability, range);
    
    }
}
