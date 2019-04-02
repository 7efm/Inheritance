
/**
 * Write a description of class Item here.
 * 
 * @author  
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    public String name;
    public int value;
    public int durability;
    public Item(String name, int value, int durability){
        this.name = name;
        this.value = value;
        this.durability = durability;
    }

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }

    public int getDurability(){
        return durability;
    }
}
