
/**
 * Write a description of class PeaShooter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PeaShooter extends Ranged
{
    private int ammo;
    public PeaShooter(String name, int value, int durability, int range, int ammo, int weaponDamage){
        super(name, value, durability, range, weaponDamage);
        this.ammo = ammo;
    }
    public int attack(){
        System.out.println("You load and fire 5 peas into your enemy and hope for the best");
        ammo -= 5;
        return weaponDamage;
    }
    public boolean parry(){
                System.out.println("You load and fire 5 peas into your enemy and hope for the best");
    }
}
