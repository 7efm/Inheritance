
/**
 * Write a description of class Pufferfish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pufferfish extends Food
{
    public Pufferfish(String name, int value, int durability, boolean rotten,int staminaRecharge){
        super(name, value, durability, rotten, staminaRecharge);
    }

    public void consume(){
        if(rotten){
            System.out.println("You take a bite of the pufferfish." +
            " It tastes funny, you lose 10 health but you regain " + staminaRecharge + " stamina.");
        }
        else{
            System.out.println("You cut and cook the pufferfish and spend no time devouring it." + 
                " You regain " + staminaRecharge + " stamina.");
        }
    } 
}
