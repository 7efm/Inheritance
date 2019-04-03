
/**
 * Write a description of class Cactus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cactus extends Food
{
    private int sharpness;
    public Cactus(String name, int value, int durability, boolean rotten, int staminaRecharge, int sharpness){
        super(name, value, durability, rotten, staminaRecharge);
        this.sharpness = sharpness;
    }
    
    public void consume(){
        if(rotten){
            System.out.println("You swallow the cactus whole."
            + " It damages your throat, but you regain " + staminaRecharge + " stamina.");
            System.out.println("The cactus is rotten and sharp, so it takes " + (10+sharpness) + " health" );
        }
        else{
            System.out.println("You swallow the cactus whole."
            + " It damages your throat, you regain "+ staminaRecharge + " stamina but lose " + sharpness + " health");
        }
    
    }
}
