
/**
 * Write a description of class Corn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Corn extends Food
{
    public Corn(String name, int value, int durability, boolean rotten, int staminaRecharge){
        super(name, value, durability, rotten, staminaRecharge);
        
    }
    public void consume(){
        if(rotten){
            System.out.println("The corn is brown and moldy, yet you eat it anyway. You lose 10 health" + 
            " but gain " + staminaRecharge + " stamina.");
        }else{
            
        }
    }
}
