
/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
   public Weapon(String name, int value, int durability){
       super(name, value, durability);
    }
}
