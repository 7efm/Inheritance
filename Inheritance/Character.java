
/**
 * Abstract class Character - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Character
{
    protected int health;
    protected int stamina;
    public Character(int health, int stamina){
        this.health = health;
        this.stamina = stamina;
    }
    public void healthChange(int changeH){
        health += changeH;
    }
    public int getStamina(){
        return stamina;
    }
}
