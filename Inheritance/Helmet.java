
/**
 * Abstract class Helmet - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.lang.Math;
public class Helmet extends Armor
{
    protected boolean worn;
    public Helmet(String name, int value, int durability, int chanceToParry){
        super(name, value, durability, chanceToParry);
    }

    public boolean blocked(){
        int rand = (int)(Math.random()*100) + 1;
        if(rand <= chanceToBlock){
            System.out.println("Your " + name + " helmet blocked the attack!");
            return true;
        }
        return false;
    }
}
