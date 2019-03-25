
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
        health = 500;
        stamina = 100;
        helmet = null;
        bodyArmor = null;
    }
    public int getHealth(){
        return health;
    }
    public int getStamina(){
        return stamina;
    }
    public int raiseStamina(int change){
        stamina += change;
        return stamina;
    }
}
