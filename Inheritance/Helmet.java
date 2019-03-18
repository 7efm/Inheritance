
/**
 * Abstract class Helmet - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Helmet extends Armor
{
    protected boolean worn;
    public Helmet(String name, int value, int durability){
        super(name, value, durability);
    }
}
