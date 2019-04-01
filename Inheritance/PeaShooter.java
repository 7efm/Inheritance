
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
        super(name, value, durability, range, ammo, weaponDamage);
        this.ammo = ammo;
    }

    public int attack(){
        System.out.println("You load and fire 5 peas into your enemy and hope for the best");
        ammo -= 5;
        return getDamage();
    }

    public boolean parry(){
        System.out.println("You load and fire 5 peas into your enemy and hope for the best");
        int rand = (int)(Math.random()*100) + 1;
        if(rand <= getParryChance()){
            System.out.println("Your peashooter succesfully parried!");
            return true;
        } else{
            System.out.println("Sorry, but your peashooter could not parry succesfully.");
            return false;
        }
    }
}
