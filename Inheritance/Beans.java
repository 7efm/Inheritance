
/**
 * Write a description of class Beans here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beans extends Food
{
    public Beans(String name, int value, int durability, boolean rotten,int staminaRecharge){
        super(name, value, durability, rotten, staminaRecharge);
        name = "Can of Beans";
        value = 5;
        durability = 1;
    }
    
}
