
/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    private int weaponDamage;
    private int parryChance;
    public Weapon(String name, int value, int durability, int weaponDamage){
        super(name, value, durability);
        this.weaponDamage = weaponDamage;
        this.parryChance = parryChance;
    }

    public int getDamage(){
        return weaponDamage;
    }

    public int getParryChance(){
        return parryChance;
    }
}
