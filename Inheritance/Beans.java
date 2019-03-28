
/**
 * Write a description of class Beans here.
 *
 * @author Jacinto
 * @version 3.26.19
 */
public class Beans extends Food
{
    public Beans(String name, int value, int durability, boolean rotten,int staminaRecharge){
        super(name, value, durability, rotten, staminaRecharge);
    }

    public void eat(){
        if(rotten){
            System.out.println("You open the can of beans and spend no time devouring it." + 
                " It tastes funny, you lose 10 health but you regain " + staminaRecharge + " stamina.");
        }
        else{
            System.out.println("You open the can of beans and spend no time devouring it." + 
                " You regain " + staminaRecharge + " stamina.");
        }
    }
    
}
