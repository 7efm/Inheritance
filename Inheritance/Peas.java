
/**
 * Write a description of class Peas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Peas extends Food
{
    public Peas(String name, int value, int durability, boolean rotten, int staminaRecharge){
        super(name, value, durability, rotten, staminaRecharge);
    }
    public void consume(){
        if(rotten){
            System.out.println("");
        
        }else{
            System.out.println("The peas are crisp");
        }
    }
}
