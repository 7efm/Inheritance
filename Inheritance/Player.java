
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    protected int health;
    protected int stamina;
    public Player(int health, int stamina, boolean helmet, boolean bodyArmor){
        this.health = health;
        this.stamina = stamina;
        helmet = false;
        bodyArmor = false;
    }
    public void healthChange(int changeH){
        health += changeH;
    }
}
