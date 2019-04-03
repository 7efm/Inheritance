
/**
 * Abstract class Food - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Food extends Consumable
{   
    public boolean rotten = false;
    public int staminaRecharge;
    public Food(String name, int value, int durability, boolean rotten, int staminaRecharge){
        super(name, value, durability); 
        this.rotten = rotten;
        this.staminaRecharge = staminaRecharge;
    }
    public void consume(){
        System.out.println("You consume whatever is in your hand");
    }
}
