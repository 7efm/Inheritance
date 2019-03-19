
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Character
{
    private Backpack pack = new Backpack();
    protected Item helmet;
    protected Item bodyArmor;
    public Player(int health, int stamina, Item helmet, Item bodyArmor){
        super(health, stamina);
        helmet = null;
        bodyArmor = null;
    }
    
}
