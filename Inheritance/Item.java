
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    protected String name;
    protected int value;
    protected int durability;
    public Item(String name, int value, int durability){
        this.name = name;
        this.value = value;
        this.durability = durability;
    }

    public String getName(){
        return name;
    }

}
