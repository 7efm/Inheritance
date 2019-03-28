
/**
 * Abstract class Consumable - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Consumable extends Item
{
    public Consumable(String name, int value, int durability){
       super(name, value, durability);
    }
    public void consume(){
        System.out.println("You consume the " + name +  ".");
        durability --;
    }
}
